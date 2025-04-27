import javax.swing.*;

public class ScrollPaneExample {
    public static void main(String[] args) {
        // Create a new window (frame)
        JFrame frame = new JFrame("ScrollPane Example");

        // Create a big text area
        JTextArea textArea = new JTextArea(20, 30); // 20 rows, 30 columns

        // Add the text area inside a scroll pane
        JScrollPane scrollPane = new JScrollPane(textArea);

        // Add scroll pane to frame
        frame.add(scrollPane);

        // Frame settings
        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
