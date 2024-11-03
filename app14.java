import java.applet.Applet;
import java.awt.Graphics;
import java.util.Calendar;

public class DigitalClockApplet extends Applet {
    public void paint(Graphics g) {
        Calendar now = Calendar.getInstance();
        String time = String.format("%02d:%02d:%02d", now.get(Calendar.HOUR_OF_DAY), now.get(Calendar.MINUTE), now.get(Calendar.SECOND));
        g.drawString(time, 20, 20);
    }
}
/*
Output:
(Displays the current time)
*/
