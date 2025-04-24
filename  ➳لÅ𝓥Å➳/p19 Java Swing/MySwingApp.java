import javax.swing.*;  // Import Swing components

public class MySwingApp {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Swing Example");  // Create a window
        JLabel label = new JLabel("Hello, Swing!");  // Create a label

        label.setBounds(100, 50, 150, 30);            // Set label position

        frame.add(label);                             // Add label to frame
        frame.setSize(300, 200);                      // Set frame size
        frame.setLayout(null);                        // No layout manager
        frame.setVisible(true);                       // Make it visible
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Close on exit
    }
}
