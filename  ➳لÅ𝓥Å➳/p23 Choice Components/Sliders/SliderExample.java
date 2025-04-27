import javax.swing.*;

public class SliderExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Slider Example");

        JSlider slider = new JSlider(0, 100, 50); // min 0, max 100, starting at 50

        slider.setBounds(50, 100, 200, 50);

        frame.add(slider);

        frame.setSize(300, 300);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
