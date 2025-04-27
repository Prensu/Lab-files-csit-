import javax.swing.*;
import java.awt.*;

public class GroupLayoutExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("GroupLayout Example"); // Create a frame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Exit on close

        JPanel panel = new JPanel(); // Create a panel
        GroupLayout layout = new GroupLayout(panel); // Create GroupLayout object
        panel.setLayout(layout); // Set panel layout

        layout.setAutoCreateGaps(true); // Create gaps between components
        layout.setAutoCreateContainerGaps(true); // Create gaps between container edges

        JLabel label = new JLabel("Username:");
        JTextField textField = new JTextField(15);

        // Horizontal Group
        layout.setHorizontalGroup(
            layout.createSequentialGroup() // One after another
                .addComponent(label) // Add label first
                .addComponent(textField) // Then text field
        );

        // Vertical Group
        layout.setVerticalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.BASELINE) // Align label and text field baseline
                .addComponent(label)
                .addComponent(textField)
        );

        frame.add(panel); // Add panel to frame
        frame.pack(); // Size frame to fit components
        frame.setVisible(true); // Make frame visible
    }
}
