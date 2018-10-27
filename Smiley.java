/*<applet code="Smiley.class" height=300 width=400></applet>*/
import java.applet.*;
import java.awt.*;
public class Smiley extends Applet
{
public void paint(Graphics g)
{
/*Concentric circles
g.drawOval(100,100,100,100);
g.drawOval(110,110,80,80);
*/
//g.drawOval(100,100,100,100);
g.setColor(Color.yellow);
g.fillOval(100,100,100,100);//face

g.setColor(Color.black);
g.fillOval(115,130,15,15);
//g.drawOval(115,130,15,15); //LE

g.setColor(Color.black);
g.fillOval(170,130,15,15);//RE
//g.drawOval(170,130,15,15);

g.setColor(Color.red);
g.fillOval(140,150,15,10);//Nose
//g.drawOval(140,150,15,10);
g.setColor(Color.pink);
//g.drawArc(135,170,30,10,180,180);
g.fillArc(135,170,30,10,180,180);
}
}
