import javax.swing.*;

public class ComboBoxExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("ComboBox Example");

        String languages[] = {"Java", "Python", "C++", "JavaScript"};

        JComboBox<String> comboBox = new JComboBox<>(languages);

        comboBox.setBounds(100, 100, 150, 30);

        frame.add(comboBox);

        frame.setSize(300, 300);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
