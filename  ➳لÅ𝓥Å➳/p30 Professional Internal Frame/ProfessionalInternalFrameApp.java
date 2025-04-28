import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ProfessionalInternalFrameApp {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new ProfessionalInternalFrameApp().createGUI());
    }

    private void createGUI() {
        // Main Frame
        JFrame frame = new JFrame("Dashboard - Internal Frames Example");
        frame.setSize(800, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Desktop Pane
        JDesktopPane desktopPane = new JDesktopPane();
        frame.add(desktopPane);

        // Menu Bar
        JMenuBar menuBar = new JMenuBar();
        JMenu menu = new JMenu("Options");
        JMenuItem newWindowItem = new JMenuItem("Open New Window");
        menu.add(newWindowItem);
        menuBar.add(menu);
        frame.setJMenuBar(menuBar);

        // Action: Create new internal frame when menu item clicked
        newWindowItem.addActionListener(e -> createInternalFrame(desktopPane));

        frame.setVisible(true);
    }

    private void createInternalFrame(JDesktopPane desktopPane) {
        // Create a new Internal Frame
        JInternalFrame internalFrame = new JInternalFrame(
            "Window " + (desktopPane.getAllFrames().length + 1), 
            true, true, true, true
        );
        internalFrame.setSize(300, 200);
        internalFrame.setLocation(
            30 * desktopPane.getAllFrames().length, 
            30 * desktopPane.getAllFrames().length
        );
        
        // Random background color
        JPanel panel = new JPanel();
        panel.setBackground(new Color(
            (int)(Math.random() * 255), 
            (int)(Math.random() * 255), 
            (int)(Math.random() * 255)
        ));
        internalFrame.add(panel);

        desktopPane.add(internalFrame);
        internalFrame.setVisible(true);
    }
}
