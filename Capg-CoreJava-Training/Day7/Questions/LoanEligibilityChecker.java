package Day7.Questions;

import java.util.Scanner;

public class LoanEligibilityChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your monthly income, current credit score, and loan amount to analyze the eligibility");
        System.out.print("Enter monthly income: ");
        double monthlyIncome = sc.nextDouble();

        System.out.print("Enter your cibil score: ");
        int cibilScore = sc.nextInt();

        System.out.print("Enter the amount you want to take as a loan: ");
        double loanAmount = sc.nextDouble();

        System.out.print("For how many years you want the loan: ");
        int year = sc.nextInt();

        System.out.print("How many current loans currently you are having: ");
        int countOfCurrentLoan = sc.nextInt();
        double totalValueOfCurrentLoans = 0.0;

        if(countOfCurrentLoan > 0) {
            int i = 1;
            while(i <= countOfCurrentLoan) {
                System.out.print("Enter the EMI amount of " + i + " loan: ");
                totalValueOfCurrentLoans += sc.nextDouble();
                i++;
            }
        }

        System.out.println(eligibilityChecker(monthlyIncome , cibilScore , loanAmount , year , countOfCurrentLoan , totalValueOfCurrentLoans));



        sc.close();
    }


    public static String eligibilityChecker(double monthlyIncome , int cibilScore , double loanAmount , int year , int countOfCurrentLoan , double totalValueOfCurrentLoans) {

        if(cibilScore >= 650) {
            // user can have upto 70% of monthly income as a loan
            double maxEmiAmount = (monthlyIncome * 0.7);
            double monthlyEMIOfRequiredLoan = loanAmount / (year * 12);
            double totalEmiAmount = totalValueOfCurrentLoans + monthlyEMIOfRequiredLoan;   // previous loan amount + current loan amount

            if(maxEmiAmount >= totalEmiAmount) {
                return "Eligible for the Loan. \nAfter grant the asked loan, your EMI amount will be " + (Math.round(totalEmiAmount * 100.0) / 100.0) + " per month which follows the crossing limits. The limit is nothing but a user can have 70% of monthly income as a EMI.";
            }
            else {
                return "Not Eligible for the Loan. \nReason for not-eligibility is: Your EMI of ongoing Loans + EMI of asked loan is crossing the limit. The limit is nothing but a user can have 70% of monthly income as a EMI.";
            }
        }
        else {
            return "Not Eligible for the loan.\nYour cibil score is less than 650.";
        }
    }
}
