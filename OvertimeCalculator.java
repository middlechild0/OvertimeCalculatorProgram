import java.util.Scanner;

public class OvertimeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input for week 1
        System.out.println("Enter hours worked for week 1:");
        int week1Hours = scanner.nextInt();

        // Input for week 2
        System.out.println("Enter hours worked for week 2:");
        int week2Hours = scanner.nextInt();

        // Calculate regular and overtime hours
        int regularHours = Math.min(week1Hours, 40) + Math.min(week2Hours, 40);
        int overtimeHours = Math.max(week1Hours - 40, 0) + Math.max(week2Hours - 40, 0);

        // Calculate pay for regular and overtime hours
        double regularPay = regularHours * 10.0;  // Assuming a rate of $10 per hour
        double overtimePay = overtimeHours * 15.0;  // Assuming an overtime rate of $15 per hour

        // Display the results
        System.out.println("Regular hours: " + regularHours);
        System.out.println("Overtime hours: " + overtimeHours);
        System.out.println("Regular pay: $" + regularPay);
        System.out.println("Overtime pay: $" + overtimePay);
        System.out.println("Total pay: $" + (regularPay + overtimePay));

        scanner.close();
    }
}
