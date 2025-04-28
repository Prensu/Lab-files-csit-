// A color chooser allows the user to select a color from the palette.
// In Swing, the JColorChooser class is used to create a color chooser dialog box.


import javax.swing.*;
import java.awt.*;

public class ColorChooserExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Color Chooser Example");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());

        JButton button = new JButton("Choose Color");
        JLabel label = new JLabel("Background Color will change");

        button.addActionListener(e -> {
            Color color = JColorChooser.showDialog(null, "Pick a Color", Color.white);

            if (color != null) {
                frame.getContentPane().setBackground(color); // Change background
            }
        });

        frame.add(button);
        frame.add(label);
        frame.setVisible(true);
    }
}
