import javax.swing.*;
import java.awt.event.*;

public class KeyEventExample extends JFrame implements KeyListener {
    JTextField textField;

    KeyEventExample() {
        textField = new JTextField();
        textField.setBounds(50, 50, 200, 30);
        textField.addKeyListener(this);

        add(textField);
        setSize(300, 200);
        setLayout(null);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public void keyPressed(KeyEvent e) {
        textField.setText("Key Pressed");
    }

    public void keyReleased(KeyEvent e) {
        textField.setText("Key Released");
    }

    public void keyTyped(KeyEvent e) {
        textField.setText("Key Typed");
    }

    public static void main(String[] args) {
        new KeyEventExample();
    }
}
