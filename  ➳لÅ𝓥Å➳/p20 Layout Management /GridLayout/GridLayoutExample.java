import javax.swing.*;
import java.awt.*;

public class GridLayoutExample {
    public static void main(String[] args) {
        // Create a new JFrame (main window)
        JFrame frame = new JFrame("GridLayout Example");

        // Set layout manager: 2 rows, 3 columns
        frame.setLayout(new GridLayout(2, 3));

        // Add buttons to the frame (6 buttons total for 2x3 grid)
        frame.add(new JButton("Button 1"));
        frame.add(new JButton("Button 2"));
        frame.add(new JButton("Button 3"));
        frame.add(new JButton("Button 4"));
        frame.add(new JButton("Button 5"));
        frame.add(new JButton("Button 6"));

        // Set basic frame properties
        frame.setSize(400, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
