import javax.swing.*;

public class MenuExample {
    public static void main(String[] args) {
        // Create a new frame
        JFrame frame = new JFrame("Menu Example");

        // Create a menubar
        JMenuBar menuBar = new JMenuBar();

        // Create a menu
        JMenu fileMenu = new JMenu("File");

        // Create menu items
        JMenuItem openItem = new JMenuItem("Open");
        JMenuItem saveItem = new JMenuItem("Save");
        JMenuItem exitItem = new JMenuItem("Exit");

        // Add menu items to menu
        fileMenu.add(openItem);
        fileMenu.add(saveItem);
        fileMenu.add(exitItem);

        // Add menu to menubar
        menuBar.add(fileMenu);

        // Set menubar to the frame
        frame.setJMenuBar(menuBar);

        // Frame settings
        frame.setSize(400, 400);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
