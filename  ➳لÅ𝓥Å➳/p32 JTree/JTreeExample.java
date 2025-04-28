// JTree is used to display a hierarchical tree of data..Hierachical data is data that is organized in a tree structure, where each item has a parent and can have multiple children
// example:Folder and file structure




import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode;

public class JTreeExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("JTree Example");
        frame.setSize(300, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        DefaultMutableTreeNode root = new DefaultMutableTreeNode("Animals");
        DefaultMutableTreeNode mammal = new DefaultMutableTreeNode("Mammals");
        DefaultMutableTreeNode reptile = new DefaultMutableTreeNode("Reptiles");

        root.add(mammal);
        root.add(reptile);

        mammal.add(new DefaultMutableTreeNode("Dog"));
        mammal.add(new DefaultMutableTreeNode("Cat"));
        reptile.add(new DefaultMutableTreeNode("Snake"));
        reptile.add(new DefaultMutableTreeNode("Lizard"));

        JTree tree = new JTree(root);
        frame.add(new JScrollPane(tree));
        frame.setVisible(true);
    }
}
