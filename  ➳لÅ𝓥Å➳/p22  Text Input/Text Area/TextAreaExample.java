import javax.swing.*;

public class TextAreaExample {
    public static void main(String[] args) {
        // Create a new window (frame)
        JFrame frame = new JFrame("TextArea Example");

        // Create a TextArea (5 rows, 20 columns)
        JTextArea textArea = new JTextArea(5, 20);

        // Set the text inside TextArea
        textArea.setText("Write your feedback here...");

        // Add the TextArea inside a ScrollPane (optional, for scrollbars)
        JScrollPane scrollPane = new JScrollPane(textArea);

        // Set position and size (x, y, width, height)
        scrollPane.setBounds(50, 50, 300, 150);

        // Add the scrollPane (which has the textArea) to the frame
        frame.add(scrollPane);

        // Frame settings
        frame.setSize(450, 300);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
