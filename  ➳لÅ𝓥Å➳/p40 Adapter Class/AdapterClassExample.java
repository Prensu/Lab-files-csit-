// In java , ,any event listeners have many methods that need to be implemented ,even if you need only one of them.
// An adapter class gives empty implementations of all methods so that you can override only the method you care about
// It helps to reduce the amount of code you have to write.or unnecessary code.

import javax.swing.*;
import java.awt.event.*;

public class AdapterClassExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Adapter Example");

        JLabel label = new JLabel("Click anywhere...");
        label.setBounds(50, 50, 200, 30);

        frame.addMouseListener(new MouseAdapter() {  // Using Adapter class
            public void mouseClicked(MouseEvent e) {
                label.setText("Mouse Clicked at (" + e.getX() + ", " + e.getY() + ")");
            }
        });

        frame.add(label);
        frame.setSize(300, 300);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

