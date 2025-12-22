package Day3.Questions;

public class CheckForDiscount {
    public static void main(String[] args) {
        boolean aPremiumMember = false;
        double cartAmount = 5000.55;
        boolean isSaleGoingOn = false;

        boolean cond = (aPremiumMember || (cartAmount >= 5000 && isSaleGoingOn));
        String result = (cond ? "Gets a Discount" : "Can't get a discount");

        System.out.println(result);
    }
}
