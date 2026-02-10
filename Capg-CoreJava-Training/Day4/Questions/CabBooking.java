package Day4.Questions;

import java.util.Scanner;

public class CabBooking {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String driverAvailability, location, paymentMode;

        System.out.print("Enter the user location: ");
        location = sc.nextLine();

        System.out.print("IS Driver(you) available: (YES/NO) ");
        driverAvailability = sc.nextLine();

        System.out.print("What Payment mode user has selected: (CASH/ONLINE) ");
        paymentMode = sc.nextLine();

        if (driverAvailability.equals("YES") && (location.equals("Bisauli") || location.equals("chandausi"))) {
            if (paymentMode.equals("CASH") || paymentMode.equals("ONLINE")) {
                System.out.println("Cab Booking is available for your Route");
            } else {
                System.out.println("Payment mode is Invalid");
            }
        } else {
            System.out.println("Eith Cab is not available for your route or driver is not available");
        }

        sc.close();

    }
}
