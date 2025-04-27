import javax.swing.*;

public class ToolTipExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("ToolTip Demo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);
        
        JButton button = new JButton("Hover Over Me");
        button.setToolTipText("This is a button tooltip!"); // Set tooltip text
        
        frame.add(button);
        frame.setVisible(true);
    }
}