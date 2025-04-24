//Applets are small java programs that were designed to be embedded in web pages and run in browser .
//They were popular in early days of web but not used now because from java9 its depreciated!!

import java.applet.Applet;
import java.awt.Graphics;

public class MyApplet extends Applet {
    public void paint(Graphics g) {
        g.drawString("Hello, Applet!", 50, 50);
    }
}
