package Day7.Questions;

import java.util.Scanner;

public class ElectricityBillCalc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Calculating electricity bill for current month");
        System.out.print("Enter meter readings of previous month: ");
        double preMonthReadings = sc.nextDouble();

        System.out.print("Enter meter readings of current month: ");
        double currMonthReadings = sc.nextDouble();

        if(preMonthReadings >= currMonthReadings) {
            double consumedUnits = Math.round((currMonthReadings - preMonthReadings) * 100.0) / 100.0;
            double bill = electricityBill(consumedUnits);

            if(bill > 0.0) {
                System.out.println("User consumed " + consumedUnits + " units this month.\nHe/She has to pay " + bill + " rupees as a electricity bill this current month");
            }
            else {
                System.out.println("User has consumed less than 200 units so he/she doesn't have to pay any amount for that this month");
            }
        }
        else {
            System.out.println("Invalid readings.\nCurrent Month readings should be greater or equal to Previous Month readings");
        }

        
        sc.close();

    }

    public static double electricityBill(double consumedUnits) {
        
        if(consumedUnits <= 200) {
            return 0.0;
        }
        else {
            double ratePerUnit = 12.0;
            double totalbill = consumedUnits * ratePerUnit;
            return Math.round(totalbill * 100.0) / 100.0;
        }
    }
}
