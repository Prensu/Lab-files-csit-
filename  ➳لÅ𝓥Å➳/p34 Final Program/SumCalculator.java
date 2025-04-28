import javax.swing.*;
import java.awt.event.*;

public class SumCalculator {
    public static void main(String[] args) {
        // Create a new JFrame (Window)
        JFrame frame = new JFrame("Sum of Two Numbers");

        // Create two input text fields
        JTextField number1Field = new JTextField();
        JTextField number2Field = new JTextField();

        // Create a button
        JButton addButton = new JButton("Add");

        // Create a text field for output
        JTextField resultField = new JTextField();
        resultField.setEditable(false); // Make result field non-editable

        // Set position and size of components (absolute positioning)
        number1Field.setBounds(50, 30, 150, 30);
        number2Field.setBounds(50, 70, 150, 30);
        addButton.setBounds(80, 110, 80, 30);
        resultField.setBounds(50, 150, 150, 30);

        // Add components to frame
        frame.add(number1Field);
        frame.add(number2Field);
        frame.add(addButton);
        frame.add(resultField);

        // When button is clicked, add the two numbers
        addButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    // Get text from fields and parse to integers
                    int num1 = Integer.parseInt(number1Field.getText());
                    int num2 = Integer.parseInt(number2Field.getText());

                    int sum = num1 + num2; // Calculate sum

                    resultField.setText(Integer.toString(sum)); // Show result
                } catch (NumberFormatException ex) {
                    // Show error if input is invalid
                    JOptionPane.showMessageDialog(frame, "Please enter valid numbers");
                }
            }
        });

        // Frame settings
        frame.setSize(280, 250);
        frame.setLayout(null); // No default layout
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
