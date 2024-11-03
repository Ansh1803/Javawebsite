import java.applet.Applet;
import java.awt.Graphics;

public class PolygonApplet extends Applet {
    public void paint(Graphics g) {
        int[] xPoints = {50, 100, 150};
        int[] yPoints = {150, 50, 150};
        g.drawPolygon(xPoints, yPoints, 3);
    }
}
/*
Output:
(Displays a triangle)
*/
