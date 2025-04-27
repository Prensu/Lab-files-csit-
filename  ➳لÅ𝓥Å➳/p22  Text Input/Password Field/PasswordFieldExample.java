import javax.swing.*;

public class PasswordFieldExample {
    public static void main(String[] args) {
        // Create a new window
        JFrame frame = new JFrame("Password Field Example");

        // Create a label
        JLabel label = new JLabel("Enter Password:");
        label.setBounds(50, 50, 120, 30);

        // Create a password field
        JPasswordField passwordField = new JPasswordField();
        passwordField.setBounds(180, 50, 150, 30);

        // Add components to the frame
        frame.add(label);
        frame.add(passwordField);

        // Frame settings
        frame.setSize(400, 200);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
