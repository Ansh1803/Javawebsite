import java.applet.Applet;
import java.awt.Graphics;

public class RoundedRectangleApplet extends Applet {
    public void paint(Graphics g) {
        g.drawRoundRect(50, 50, 150, 100, 20, 20);
    }
}
/*
Output:
(Displays a rounded rectangle)
*/
