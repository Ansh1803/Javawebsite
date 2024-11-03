import java.applet.Applet;
import java.awt.Graphics;

public class SmilingFaceApplet extends Applet {
    public void paint(Graphics g) {
        g.drawOval(50, 50, 200, 200);
        g.fillOval(100, 100, 20, 20);
        g.fillOval(180, 100, 20, 20);
        g.drawArc(100, 150, 100, 50, 0, -180);
    }
}
/*
Output:
(Displays a smiling face)
*/
