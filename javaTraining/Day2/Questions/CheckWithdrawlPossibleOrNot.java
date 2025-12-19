package Day2.Questions;

public class CheckWithdrawlPossibleOrNot {
    public static void main(String[] args) {
        int bankBalance = 534;
        int amountToWithdrawl = 445;

        String result = (amountToWithdrawl <= bankBalance) ? "Can withdraw the given amount" : "Can't withdraw the given amount";
        System.out.println(result);
    }
}
