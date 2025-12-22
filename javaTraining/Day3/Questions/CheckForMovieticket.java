package Day3.Questions;

public class CheckForMovieticket {
    public static void main(String[] args) {
        boolean seatsAvailable = true;
        boolean membershipHolder = false;
        boolean validPromocode = true;

        boolean cond = (seatsAvailable && (membershipHolder || validPromocode));

        String result = cond ? "Can book movie ticket" : "Can't book movie ticket";

        System.out.println(result);
    }
}
