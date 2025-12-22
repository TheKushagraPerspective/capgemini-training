package Day2.Questions;

public class LoanDetails {
    public static void main(String[] args) {
        int principalAmount = 500000;
        double loanTenure = 5.0;
        double totalInterestRate = 10.0;

        double totalMonths = loanTenure * 12;
        double interestRatePerMonth = totalInterestRate / totalMonths;
        double interestRatePerYear = (totalInterestRate / loanTenure);
        double interestAmountPerMonth = (principalAmount / 100) * interestRatePerMonth;
        double totalInterestToBePaid = (interestAmountPerMonth * totalMonths);
        double totalAmountToBePaidPerMonth = (principalAmount / (loanTenure * 12)) + interestAmountPerMonth;
        double totalAmountToBePaid = principalAmount + totalInterestToBePaid;


        System.out.println("Initial Principal Amount is : " + principalAmount);
        System.out.println("Loan granted for : " + loanTenure + " years");
        System.out.println("Interest Rate will be : " + totalInterestRate + "% for " + loanTenure + " years");
        System.out.printf("Interest Rate per month : %.2f%n", interestRatePerMonth);
        System.out.printf("Interest Rate per year : %.2f%n", interestRatePerYear);
        System.out.printf("EMI Amount to be paid per month : %.2f%n", totalAmountToBePaidPerMonth);
        System.out.printf("Total Interest amount will be : %.2f%n", totalInterestToBePaid);
        System.out.printf("Total Amount to be paid after loan tenure : %.2f%n", totalAmountToBePaid);

    }
}
