// Option Dialog Box is used to ask question or show messages to users.
// It appears in a small popup windows and can be used to get user input or show information.
// Swing provides a class called JOptionPane to create dialog boxes.


import javax.swing.*;

public class OptionDialogExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Option Dialog Example");

        // Simple Information Dialog
        JOptionPane.showMessageDialog(frame, "This is a simple message!");

        // Confirmation Dialog
        int result = JOptionPane.showConfirmDialog(frame, "Do you want to continue?");
        
        if (result == JOptionPane.YES_OPTION) {
            JOptionPane.showMessageDialog(frame, "You chose YES!");
        } else if (result == JOptionPane.NO_OPTION) {
            JOptionPane.showMessageDialog(frame, "You chose NO!");
        } else {
            JOptionPane.showMessageDialog(frame, "You canceled!");
        }

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
