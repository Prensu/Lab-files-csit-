// JTable is used to display tabular data in a grid format. It allows users to view and edit data in rows and columns.

//Its like a spreadsheet or a database table. 

import javax.swing.*;

public class JTableExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("JTable Example");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        String[][] data = {
            {"101", "Amit", "670000"},
            {"102", "Jai", "780000"},
            {"103", "Sachin", "700000"}
        };

        String[] column = {"ID", "NAME", "SALARY"};
        JTable table = new JTable(data, column);

        frame.add(new JScrollPane(table));
        frame.setVisible(true);
    }
}
