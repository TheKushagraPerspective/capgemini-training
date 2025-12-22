package Day3.Questions;

public class CheckServerStatus {
    public static void main(String[] args) {
        double cpuUsage = 84.2;
        double memoryUsage = 89.0;
        boolean serverMaintenanceStatus = true;

        boolean cond = ((cpuUsage >= 85 || memoryUsage >= 90) || serverMaintenanceStatus);

        String result = (cond ? "Server should be marked unstable" : "Server continues its working");

        System.out.println(result);
    }
}
