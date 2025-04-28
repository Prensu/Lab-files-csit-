import javax.swing.*;
import java.awt.event.*;

public class WindowEventExample extends JFrame implements WindowListener {

    WindowEventExample() {
        addWindowListener(this);

        setSize(400, 400);
        setLayout(null);
        setVisible(true);
    }

    public void windowOpened(WindowEvent e) {
        System.out.println("Window Opened");
    }

    public void windowClosing(WindowEvent e) {
        System.out.println("Window Closing");
        dispose();  // Close window
    }

    public void windowClosed(WindowEvent e) {
        System.out.println("Window Closed");
    }

    public void windowActivated(WindowEvent e) {
        System.out.println("Window Activated");
    }

    public void windowDeactivated(WindowEvent e) {
        System.out.println("Window Deactivated");
    }

    public void windowIconified(WindowEvent e) {}
    public void windowDeiconified(WindowEvent e) {}

    public static void main(String[] args) {
        new WindowEventExample();
    }
}
