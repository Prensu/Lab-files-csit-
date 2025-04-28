import javax.swing.*;
import java.awt.event.*;

public class MouseEventExample extends JFrame implements MouseListener {
    JLabel label;

    MouseEventExample() {
        label = new JLabel();
        label.setBounds(100, 100, 150, 30);
        add(label);

        addMouseListener(this);

        setSize(400, 400);
        setLayout(null);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public void mouseClicked(MouseEvent e) {
        label.setText("Mouse Clicked");
    }

    public void mouseEntered(MouseEvent e) {
        label.setText("Mouse Entered");
    }

    public void mouseExited(MouseEvent e) {
        label.setText("Mouse Exited");
    }

    public void mousePressed(MouseEvent e) {
        label.setText("Mouse Pressed");
    }

    public void mouseReleased(MouseEvent e) {
        label.setText("Mouse Released");
    }

    public static void main(String[] args) {
        new MouseEventExample();
    }
}
