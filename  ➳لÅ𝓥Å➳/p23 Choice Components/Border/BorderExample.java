import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class BorderExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Border Example");

        JButton button = new JButton("Click Me");

        Border border = BorderFactory.createLineBorder(Color.blue, 5);
        button.setBorder(border);

        frame.add(button);

        frame.setSize(300, 300);
        frame.setLayout(new FlowLayout());
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
