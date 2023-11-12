import javax.swing.*;
import java.awt.*;

public class PayrollCalculator {
    public static void main(String[] args) {
        // Create the frame
        JFrame frame = new JFrame("Payroll Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);

        // Create and set up the content pane
        JPanel panel = new JPanel(new SpringLayout());
        frame.setContentPane(panel);

        // Add components to the panel
        panel.add(new JLabel("Employee Name:"));
        panel.add(new JTextField(20));  // Text field for employee name

        panel.add(new JLabel("Rate per Hour:"));
        panel.add(new JTextField(10));  // Text field for rate per hour

        panel.add(new JLabel("Hours per Day:"));
        panel.add(new JTextField(5));  // Text field for hours per day

        panel.add(new JLabel("Number of Days Worked:"));
        panel.add(new JTextField(5));  // Text field for number of days worked

        // Lay out the panel
        SpringUtilities.makeCompactGrid(panel, 4, 2, 6, 6, 6, 6);

        // Display the frame
        frame.setVisible(true);
    }
}
