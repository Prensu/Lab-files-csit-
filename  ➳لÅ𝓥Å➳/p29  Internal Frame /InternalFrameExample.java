import javax.swing.*;

public class InternalFrameExample {
    public static void main(String[] args) {
        JFrame mainFrame = new JFrame("Internal Frame Example");
        mainFrame.setSize(500, 400);
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create a desktop pane
        JDesktopPane desktopPane = new JDesktopPane();

        // Create an internal frame
        JInternalFrame internalFrame = new JInternalFrame("Mini Window", true, true, true, true);
        internalFrame.setSize(200, 150);
        internalFrame.setVisible(true);

        // Add the internal frame to the desktop pane
        desktopPane.add(internalFrame);

        // Add the desktop pane to the main frame
        mainFrame.add(desktopPane);
        mainFrame.setVisible(true);
    }
}
