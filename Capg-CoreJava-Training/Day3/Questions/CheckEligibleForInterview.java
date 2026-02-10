package Day3.Questions;

public class CheckEligibleForInterview {
    public static void main(String[] args) {
        int experienceOfYears = 0;
        boolean hasStrongProjects = false;
        boolean graduationDone = true;

        boolean cond = (experienceOfYears >= 2 || hasStrongProjects) && graduationDone;

        String result = cond ? "Eligible for Interview" : "Not Eligible for Interview";

        System.out.println(result);
    }
}
