import javax.swing.*;
import java.awt.event.*;

public class KeyboardMnemonicsAndAccelerators{
    public static void main(String[] args) {
        JFrame frame = new JFrame("Shortcut Demo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // 1. Button with mnemonic
        JButton button = new JButton("Click Me (_C)");
        button.setMnemonic('C');  // Alt+C
        
        // 2. Menu with both features
        JMenuBar menuBar = new JMenuBar();
        JMenu fileMenu = new JMenu("_File");
        fileMenu.setMnemonic('F');  // Alt+F
        
        JMenuItem newItem = new JMenuItem("_New");
        newItem.setMnemonic('N');  // Alt+N (when menu open)
        newItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N, InputEvent.CTRL_DOWN_MASK));
        
        fileMenu.add(newItem);
        menuBar.add(fileMenu);
        frame.setJMenuBar(menuBar);
        
        frame.add(button);
        frame.pack();
        frame.setVisible(true);
    }
}