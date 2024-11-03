import java.applet.Applet;
import java.awt.Font;
import java.awt.Graphics;

public class FontApplet extends Applet {
    public void paint(Graphics g) {
        g.setFont(new Font("Arial", Font.BOLD, 20));
        g.drawString("Custom Font", 20, 20);
    }
}
/*
Output:
(Displays "Custom Font" with a specific font style)
*/
