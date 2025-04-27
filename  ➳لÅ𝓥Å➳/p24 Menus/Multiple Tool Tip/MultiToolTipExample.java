import javax.swing.*;
import java.awt.*;

public class MultiToolTipExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Multiple ToolTips");
        frame.setLayout(new FlowLayout());
        
        // Button with tooltip
        JButton btn = new JButton("Click Me");
        btn.setToolTipText("This button does something special");
        
        // Text field with tooltip
        JTextField textField = new JTextField(15);
        textField.setToolTipText("Enter your name here");
        
        // Label with tooltip
        JLabel label = new JLabel("Important Information");
        label.setToolTipText("<html>This is <b>HTML-formatted</b><br>tooltip text!</html>");
        
        frame.add(btn);
        frame.add(textField);
        frame.add(label);
        frame.pack();
        frame.setVisible(true);
    }
}