import java.applet.*;
import java.awt.*;

public class Snowman extends Applet
{
public void paint(Graphics g) 
{		

g.setColor(Color.blue);
g.fillOval(130, 50, 40, 40);
g.fillOval(115, 85, 70, 50);
g.fillOval(100, 130, 100, 60);

g.setColor(Color.black);
g.fillOval(140, 60, 5, 5);
g.fillOval(155, 60, 5, 5);
g.drawArc(140, 70, 20, 10, 190, 160);
}
}

/*
<applet code="Snowman.class" width="300" height="300">
</applet>
*/