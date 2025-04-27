import javax.swing.*;

public class TextFieldExample {
    public static void main(String[] args) {
        // Create a new window (frame)
        JFrame frame = new JFrame("TextField Example");

        // Create a TextField
        JTextField textField = new JTextField("Type something here...");

        // Set position and size: (x, y, width, height)
        textField.setBounds(50, 50, 200, 30);

        // Add the TextField into the frame
        frame.add(textField);

        // Frame settings
        frame.setSize(400, 200); // window size
        frame.setLayout(null); // no layout manager
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // close properly
        frame.setVisible(true); // show the window
    }
}
