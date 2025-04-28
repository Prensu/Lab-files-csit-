// A file chooser lets the user open or save file using a Gui dialog box .
// In swing, the JFileChooser class is used to create a file chooser dialog box.

import javax.swing.*;
import java.io.File;

public class FileChooserExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("File Chooser Example");
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton button = new JButton("Open File");

        button.addActionListener(e -> {
            JFileChooser fileChooser = new JFileChooser();
            int response = fileChooser.showOpenDialog(null); // Open file dialog

            if (response == JFileChooser.APPROVE_OPTION) {
                File file = fileChooser.getSelectedFile(); // Get selected file
                System.out.println("Selected File: " + file.getAbsolutePath());
            }
        });

        frame.add(button);
        frame.setVisible(true);
    }
}
