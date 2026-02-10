package Day3.Questions;

public class CheckOrderStatus {
    public static void main(String[] args) {
        boolean paymentDone = true;
        boolean isStockAvailable = false;
        boolean backOrderAllowed = true;

        boolean cond = (paymentDone && (isStockAvailable || backOrderAllowed));

        String result = cond ? "Online order is confirmed" : "Online order is not confirmed";

        System.out.println(result);
    }
}
