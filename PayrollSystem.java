import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PayrollSystem {

    private JFrame payrollFrame;
    private JTextField employeeNameField;
    private JTextField ratePerHourField;
    private JTextField hourPerDayField;
    private JTextField numberOfDaysField;
    private JTextField grossSalaryField;
    private JTextField taxField;
    private JTextField philHealthField;
    private JTextField sssField;
    private JTextField totalDeductionField;
    private JTextField grossSalaryLabelField;
    private JTextField deductionField;
    private JLabel netSalaryLabel;
    private JTextField netSalaryField;
    private JLabel philHealthLabel;
    private JLabel sssLabel;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    PayrollSystem window = new PayrollSystem();
                    window.payrollFrame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public PayrollSystem() {
        initialize();
    }

    private void initialize() {
        payrollFrame = new JFrame();
        payrollFrame.setBounds(100, 100, 1109, 399);
        payrollFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        payrollFrame.getContentPane().setLayout(null);

        JLabel payrollLabel = new JLabel("Payroll Management System");
        payrollLabel.setFont(new Font("Tahoma", Font.BOLD, 30));
        payrollLabel.setHorizontalAlignment(SwingConstants.CENTER);
        payrollLabel.setBounds(0, 0, 1087, 49);
        payrollFrame.getContentPane().add(payrollLabel);

        JLabel employeeNameLabel = new JLabel("Employee Name:");
        employeeNameLabel.setHorizontalAlignment(SwingConstants.RIGHT);
        employeeNameLabel.setBounds(64, 65, 127, 20);
        payrollFrame.getContentPane().add(employeeNameLabel);

        employeeNameField = new JTextField();
        employeeNameLabel.setLabelFor(employeeNameField);
        employeeNameField.setBounds(210, 62, 120, 26);
        payrollFrame.getContentPane().add(employeeNameField);
        employeeNameField.setColumns(10);

        JLabel ratePerHourLabel = new JLabel("Rate Per Hour:");
        ratePerHourLabel.setHorizontalAlignment(SwingConstants.RIGHT);
        ratePerHourLabel.setBounds(64, 101, 127, 20);
        payrollFrame.getContentPane().add(ratePerHourLabel);

        ratePerHourField = new JTextField();
        ratePerHourLabel.setLabelFor(ratePerHourField);
        ratePerHourField.setBounds(210, 98, 120, 26);
        payrollFrame.getContentPane().add(ratePerHourField);
        ratePerHourField.setColumns(10);

        JLabel hourPerDayLabel = new JLabel("Hour Per Day:");
        hourPerDayLabel.setHorizontalAlignment(SwingConstants.RIGHT);
        hourPerDayLabel.setBounds(64, 137, 127, 20);
        payrollFrame.getContentPane().add(hourPerDayLabel);

        hourPerDayField = new JTextField();
        hourPerDayLabel.setLabelFor(hourPerDayField);
        hourPerDayField.setBounds(210, 134, 120, 26);
        payrollFrame.getContentPane().add(hourPerDayField);
        hourPerDayField.setColumns(10);

        JLabel numberOfDaysLabel = new JLabel("Number of days worked:");
        numberOfDaysLabel.setHorizontalAlignment(SwingConstants.RIGHT);
        numberOfDaysLabel.setBounds(15, 173, 176, 20);
        payrollFrame.getContentPane().add(numberOfDaysLabel);

        numberOfDaysField = new JTextField();
        numberOfDaysLabel.setLabelFor(numberOfDaysField);
        numberOfDaysField.setBounds(210, 170, 120, 26);
        payrollFrame.getContentPane().add(numberOfDaysField);
        numberOfDaysField.setColumns(10);

        JLabel grossSalaryLabel = new JLabel("GROSS SALARY:");
        grossSalaryLabel.setFont(new Font("Tahoma", Font.BOLD, 21));
        grossSalaryLabel.setHorizontalAlignment(SwingConstants.RIGHT);
        grossSalaryLabel.setBounds(15, 220, 176, 36);
        payrollFrame.getContentPane().add(grossSalaryLabel);

        grossSalaryField = new JTextField();
        grossSalaryLabel.setLabelFor(grossSalaryField);
        grossSalaryField.setEditable(false);
        grossSalaryField.setBounds(210, 227, 120, 26);
        payrollFrame.getContentPane().add(grossSalaryField);
        grossSalaryField.setColumns(10);

        JLabel deductionLabel = new JLabel("DEDUCTION OF SALARY:");
        deductionLabel.setForeground(new Color(139, 0, 0));
        deductionLabel.setFont(new Font("Tahoma", Font.BOLD, 17));
        deductionLabel.setBounds(386, 65, 217, 20);
        payrollFrame.getContentPane().add(deductionLabel);

        JLabel taxLabel = new JLabel("TAX  15% of Monthly Wage");
        taxLabel.setHorizontalAlignment(SwingConstants.RIGHT);
        taxLabel.setBounds(369, 101, 206, 20);
        payrollFrame.getContentPane().add(taxLabel);

        taxField = new JTextField();
        taxLabel.setLabelFor(taxField);
        taxField.setEditable(false);
        taxField.setBounds(590, 98, 146, 26);
        payrollFrame.getContentPane().add(taxField);
        taxField.setColumns(10);

        philHealthField = new JTextField();
        philHealthField.setEditable(false);
        philHealthField.setBounds(590, 134, 146, 26);
        payrollFrame.getContentPane().add(philHealthField);
        philHealthField.setColumns(10);

        sssField = new JTextField();
        sssField.setEditable(false);
        sssField.setBounds(590, 170, 146, 26);
        payrollFrame.getContentPane().add(sssField);
        sssField.setColumns(10);

        totalDeductionField = new JTextField();
        totalDeductionField.setEditable(false);
        totalDeductionField.setBounds(590, 227, 146, 26);
        payrollFrame.getContentPane().add(totalDeductionField);
        totalDeductionField.setColumns(10);

        JLabel totalDeductionLabel = new JLabel("TOTAL DEDUCTION :");
        totalDeductionLabel.setLabelFor(totalDeductionField);
        totalDeductionLabel.setFont(new Font("Tahoma", Font.BOLD, 21));
        totalDeductionLabel.setBounds(369, 230, 220, 20);
        payrollFrame.getContentPane().add(totalDeductionLabel);

        grossSalaryLabel = new JLabel("Gross Salary :");
        grossSalaryLabel.setHorizontalAlignment(SwingConstants.RIGHT);
        grossSalaryLabel.setBounds(786, 81, 99, 20);
        payrollFrame.getContentPane().add(grossSalaryLabel);

        grossSalaryLabelField = new JTextField();
        grossSalaryLabel.setLabelFor(grossSalaryLabelField);
        grossSalaryLabelField.setEditable(false);
        grossSalaryLabelField.setBounds(913, 78, 123, 26);
        payrollFrame.getContentPane().add(grossSalaryLabelField);
        grossSalaryLabelField.setColumns(10);

        deductionLabel = new JLabel("Deduction :");
        deductionLabel.setHorizontalAlignment(SwingConstants.RIGHT);
        deductionLabel.setBounds(786, 117, 99, 20);
        payrollFrame.getContentPane().add(deductionLabel);

        deductionField = new JTextField();
        deductionLabel.setLabelFor(deductionField);
        deductionField.setEditable(false);
        deductionField.setBounds(913, 114, 123, 26);
        payrollFrame.getContentPane().add(deductionField);
        deductionField.setColumns(10);

        netSalaryLabel = new JLabel("NET SALARY :");
        netSalaryLabel.setHorizontalAlignment(SwingConstants.RIGHT);
        netSalaryLabel.setFont(new Font("Tahoma", Font.BOLD, 21));
        netSalaryLabel.setBounds(751, 230, 159, 20);
        payrollFrame.getContentPane().add(netSalaryLabel);

        netSalaryField = new JTextField();
        netSalaryLabel.setLabelFor(netSalaryField);
        netSalaryField.setEditable(false);
        netSalaryField.setBounds(913, 227, 123, 26);
        payrollFrame.getContentPane().add(netSalaryField);
        netSalaryField.setColumns(10);

        JButton computeButton = new JButton("Compute");
        computeButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent action) {
                int ratePerHour = Integer.valueOf(ratePerHourField.getText());
                int hourPerDay = Integer.valueOf(hourPerDayField.getText());
                int numberOfDaysWorked = Integer.valueOf(numberOfDaysField.getText());
                int grossSalary = ratePerHour * hourPerDay * numberOfDaysWorked;
                double tax = grossSalary * 0.15;
                double philHealth = grossSalary * 0.05;
                double sss = grossSalary * 0.02;
                double deduction = tax + philHealth + sss;
                double netSalary = grossSalary - deduction;
                taxField.setText(String.valueOf((int) tax));
                philHealthField.setText(String.valueOf((int) philHealth));
                sssField.setText(String.valueOf((int) sss));
                grossSalaryField.setText(String.valueOf(grossSalary));
                grossSalaryLabelField.setText(String.valueOf(grossSalary));
                deductionField.setText(String.valueOf((int) deduction));
                totalDeductionField.setText(String.valueOf((int) deduction));
                netSalaryField.setText(String.valueOf((int) netSalary));
            }
        });
        computeButton.setBackground(new Color(47, 79, 79));
        computeButton.setForeground(new Color(255, 255, 255));
        computeButton.setBounds(422, 271, 193, 41);
        payrollFrame.getContentPane().add(computeButton);

        philHealthLabel = new JLabel("Philhealth 5%");
        philHealthLabel.setLabelFor(philHealthField);
        philHealthLabel.setHorizontalAlignment(SwingConstants.RIGHT);
        philHealthLabel.setBounds(476, 137, 99, 20);
        payrollFrame.getContentPane().add(philHealthLabel);

        sssLabel = new JLabel("SSS 2%");
        sssLabel.setLabelFor(sssField);
        sssLabel.setHorizontalAlignment(SwingConstants.RIGHT);
        sssLabel.setBounds(506, 173, 69, 20);
        payrollFrame.getContentPane().add(sssLabel);
    }

     
}
