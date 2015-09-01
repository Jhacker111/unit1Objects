import java.awt.Color;
import javax.swing.JFrame;
import java.util.Random;

public class BrightDemo
{
    public static void main(String[] args)
    {
        JFrame frame = new JFrame();
        frame.setSize(200,200);
        int rand1 = generator.nextInt(256);
        Color myColor = new Color(148,200,100);
        frame.getContentPane().setBackground(myColor);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}