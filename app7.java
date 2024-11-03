import java.applet.Applet;
import java.awt.Graphics;

public class ConcentricCirclesApplet extends Applet {
    public void paint(Graphics g) {
        for (int i = 0; i < 4; i++) {
            g.drawOval(50 - (i * 20), 50 - (i * 20), 100 + (i * 40), 100 + (i * 40));
        }
    }
}
/*
Output:
(Displays 4 concentric circles)
*/
