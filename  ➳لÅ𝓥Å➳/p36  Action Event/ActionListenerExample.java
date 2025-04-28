import javax.swing.*;
import java.awt.event.*;

public class ActionListenerExample { // Corrected class name
    public static void main(String[] args) {
        JFrame frame = new JFrame("ActionListener Example");

        JButton button = new JButton("Click Me"); // Create button
        button.setBounds(100, 100, 120, 40);

        // Add ActionListener to the button
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Action to perform when button is clicked
                JOptionPane.showMessageDialog(frame, "Button Clicked!");
            }
        });

        frame.add(button); // Add button to frame
        frame.setSize(300, 300); // Set frame size
        frame.setLayout(null); // No layout manager
        frame.setVisible(true); // Make frame visible
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Close properly
    }
}
