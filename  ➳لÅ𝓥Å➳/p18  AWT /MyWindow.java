// AWT package is abstract windows Toolkit GUI used to create windows applications like buttons, menus ,windows , and other graphical components


import java.awt.*;  // AWT package

public class MyWindow {
    public static void main(String[] args) {
        Frame f = new Frame("AWT Example");  // Create a window
        Label l = new Label("Hello from AWT");  // Add a label
        l.setBounds(50, 100, 150, 30);  // Set label position

        f.add(l);               // Add label to frame
        f.setSize(300, 200);    // Set size of window
        f.setLayout(null);      // Use no layout manager
        f.setVisible(true);     // Show the window
    }
}
