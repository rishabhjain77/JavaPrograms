/*<applet code="House.class" height=300 width=400></applet>*/
import java.awt.*;
import java.applet.*;
public class House extends Applet
{
public void paint(Graphics g)
{
g.drawRect(100,100,200,100);
g.drawRect(110,150,40,50);
g.drawLine(100,100,120,20);
g.drawLine(120,20,160,100);
g.drawLine(120,20,270,20);
g.drawLine(270,20,300,100);
g.drawLine(160,100,160,200);
}
}

