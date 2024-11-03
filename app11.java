import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;

public class BackgroundColorApplet extends Applet {
    public void init() {
        setBackground(Color.CYAN);
    }
    
    public void paint(Graphics g) {
        g.drawString("Background Color Changed", 20, 20);
    }
}
/*
Output:
(Displays text with a cyan background)
*/
