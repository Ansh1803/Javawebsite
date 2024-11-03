import java.applet.Applet;
import java.awt.Graphics;

public class ArcApplet extends Applet {
    public void paint(Graphics g) {
        g.drawArc(50, 50, 150, 100, 0, 90);
    }
}
/*
Output:
(Displays an arc)
*/
