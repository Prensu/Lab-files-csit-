// Jlist is used to display a list of items in a scrollable view. It allows users to select one or more items from the list.
// Users can select one or multiple items 
// Its like vertical menu with scroll bar.

import javax.swing.*;

public class JListExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("JList Example");
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        String[] cities = {"New York", "London", "Paris", "Tokyo", "Delhi"};
        JList<String> cityList = new JList<>(cities);
        cityList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

        frame.add(new JScrollPane(cityList));
        frame.setVisible(true);
    }
}
