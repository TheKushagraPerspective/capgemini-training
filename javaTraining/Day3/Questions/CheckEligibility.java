package Day3.Questions;

public class CheckEligibility {
    public static void main(String[] args) {
        int currentAttendence = 75;
        boolean medicalProofSubmitted = false;   // true -> submitted , false -> not submitted
        boolean feesPaid = false;    

        boolean cond1 = (currentAttendence >= 75 || medicalProofSubmitted) && feesPaid;
        String result = (cond1 ? "Eligible for the Examination" : "Not Eligible for the Examination");

        System.out.println(result);
    }
}
