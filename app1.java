import java.applet.Applet;
import java.awt.Graphics;

public class HelloWorldApplet extends Applet {
    public void paint(Graphics g) {
        g.drawString("Hello World", 20, 20);
    }
}

html embedded file-
<!DOCTYPE html>
<html>
<head>
    <title>Hello World Applet</title>
</head>
<body>
    <h1>Hello World Applet Example</h1>
    <applet code="HelloWorldApplet.class" width="300" height="300">
        Your browser does not support applets.
    </applet>
</body>
</html>

output
Hello World
