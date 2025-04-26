import javax.swing.*;
import java.awt.*;

public class GridBagLayoutExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("GridBagLayout Example"); // Create frame
        frame.setLayout(new GridBagLayout()); // Set layout to GridBagLayout
        GridBagConstraints gbc = new GridBagConstraints(); // Create constraints object
        
        JButton btn1 = new JButton("Button 1");
        gbc.gridx = 0; // Set column 0
        gbc.gridy = 0; // Set row 0
        frame.add(btn1, gbc); // Add button with constraints

        JButton btn2 = new JButton("Button 2");
        gbc.gridx = 1; // Move to column 1
        gbc.gridy = 0; // Stay at row 0
        frame.add(btn2, gbc);

        JButton btn3 = new JButton("Button 3");
        gbc.gridx = 0; // Go back to column 0
        gbc.gridy = 1; // Move to next row
        frame.add(btn3, gbc);

        JButton btn4 = new JButton("Button 4");
        gbc.gridx = 1; // Column 1
        gbc.gridy = 1; // Row 1
        frame.add(btn4, gbc);

        frame.setSize(300, 200); // Set frame size
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Exit on close
        frame.setVisible(true); // Make frame visible
    }
}
