import javax.swing.*;
import java.awt.*;

public class Gui {

           public Gui() {
            JFrame frame = new JFrame();
            JPanel panel = new JPanel();
            panel.setBorder(BorderFactory.createEmptyBorder(30, 30, 10, 10));
            panel.setLayout(new GridLayout(0, 1));
            frame.add(panel, BorderLayout.CENTER);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setTitle("Gui");
            frame.pack();
            frame.setVisible(true);
        }
    public static void main(String[] args) {
        new Gui();
    }
}