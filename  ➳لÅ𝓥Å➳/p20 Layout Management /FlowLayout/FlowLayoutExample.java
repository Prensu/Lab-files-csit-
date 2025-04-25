import java.awt.*;

public class FlowLayoutExample{
    public static void main(String[] args) {
        Frame frame = new Frame("FlowLayout Example");

        // Set FlowLayout with center alignment and default gaps
        frame.setLayout(new FlowLayout(FlowLayout.CENTER, 20, 10));

        // Add buttons
        frame.add(new Button("Button 1"));
        frame.add(new Button("Button 2"));
        frame.add(new Button("Button 3"));
        frame.add(new Button("Button 4"));
        frame.add(new Button("Button 5"));

        // Frame settings
        frame.setSize(400, 200);
        frame.setVisible(true);
    }
}
