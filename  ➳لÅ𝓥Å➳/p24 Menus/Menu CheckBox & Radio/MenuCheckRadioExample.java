import javax.swing.*;
import java.awt.event.*;

public class MenuCheckRadioExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Menu CheckBox and RadioButton Example");

        JMenuBar menuBar = new JMenuBar();
        JMenu menu = new JMenu("Options");

        // CheckBox Menu Items
        JCheckBoxMenuItem cb1 = new JCheckBoxMenuItem("Show Toolbar");
        JCheckBoxMenuItem cb2 = new JCheckBoxMenuItem("Show Status Bar");

        // RadioButton Menu Items
        JRadioButtonMenuItem rb1 = new JRadioButtonMenuItem("Dark Mode");
        JRadioButtonMenuItem rb2 = new JRadioButtonMenuItem("Light Mode");

        // Group the radio buttons -> only one can be selected
        ButtonGroup bg = new ButtonGroup();
        bg.add(rb1);
        bg.add(rb2);

        // Add menu items
        menu.add(cb1);
        menu.add(cb2);
        menu.addSeparator();  // separator line
        menu.add(rb1);
        menu.add(rb2);

        menuBar.add(menu);
        frame.setJMenuBar(menuBar);

        frame.setSize(400, 400);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
