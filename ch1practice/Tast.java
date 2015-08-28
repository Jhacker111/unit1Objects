import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Tast
{
    public static void main(String[] args) throws Exception
    {
        URL imageLocation = new URL(
            "http://media.giphy.com/media/VEMvkcsQRkPJu/giphy.gif");
        JOptionPane.showMessageDialog(null, "Hello", "Title",
            JOptionPane.PLAIN_MESSAGE, new ImageIcon(imageLocation));
        }
    }