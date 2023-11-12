import javax.swing.JOptionPane;

public class OvertimeCalculatorGUI {
    public static void main(String[] args) {
      
        String week1Input = JOptionPane.showInputDialog("Enter hours worked for week 1:");
        int week1Hours = Integer.parseInt(week1Input);

      
        String week2Input = JOptionPane.showInputDialog("Enter hours worked for week 2:");
        int week2Hours = Integer.parseInt(week2Input);

        int regularHours = Math.min(week1Hours, 40) + Math.min(week2Hours, 40);
        int overtimeHours = Math.max(week1Hours - 40, 0) + Math.max(week2Hours - 40, 0);

  
        double regularPay = regularHours * 10.0; 
        double overtimePay = overtimeHours * 15.0; 

        // Display the results
        String resultMessage = "Regular hours: " + regularHours + "\n" +
                               "Overtime hours: " + overtimeHours + "\n" +
                               "Regular pay: $" + regularPay + "\n" +
                               "Overtime pay: $" + overtimePay + "\n" +
                               "Total pay: $" + (regularPay + overtimePay);

        JOptionPane.showMessageDialog(null, resultMessage);
    }
}
