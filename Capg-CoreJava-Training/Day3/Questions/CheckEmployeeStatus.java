package Day3.Questions;

public class CheckEmployeeStatus {
    public static void main(String[] args) {
        boolean cardHolder = true;
        boolean permanentEmp = true;
        boolean tempEmp = false;

        boolean cond = (cardHolder && (permanentEmp || tempEmp));

        String result = (cond ? "Can enter the office" : "can't enter the office");
        System.out.println(result);
    }
}
