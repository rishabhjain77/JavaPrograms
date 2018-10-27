/*<applet code="Form.class" height=300 width=400></applet>*/
import java.awt.*;
import java.applet.*;
import java.awt.event.*;
public class Form extends Applet implements ActionListener
{
String name,email,pass,gender;
int age;
TextField t1=new TextField(8);
TextField t2=new TextField(8);
TextField t3=new TextField(8);
TextField t4=new TextField(8);
Label l1=new Label("Name");
Label l2=new Label("Email");
Label l3=new Label("Password");
Label l4=new Label("Gender");
Label l5=new Label("Age");
CheckboxGroup g1=new CheckboxGroup();
Checkbox c1=new Checkbox("Male",g1,true);
Checkbox c2=new Checkbox("Female",g1,false);
Choice ch=new Choice();
Button b1=new Button("Submit");
Button b2=new Button("Quit");
FlowLayout f1=new FlowLayout(FlowLayout.LEFT,0,10);
Frame f=new Frame("Hello");

public void init()
{
setLayout(f1);
add(l1);
add(t1);
add(l2);
add(t2);
add(l3);
add(t3);
add(l4);
add(c1);
add(c2);
ch.add("18");
ch.add("19");
ch.add("20");
ch.add("21");
add(ch);
add(b1);
add(b2);
b1.addActionListener(this);
b2.addActionListener(this);
}
public void actionPerformed(ActionEvent e)
{
if(e.getSource()==b1)
{
name=t1.getText();
email=t2.getText();
pass=t3.getText();
gender=g1.getSelectedCheckbox().getLabel();
age=Integer.parseInt(ch.getSelectedItem());
repaint();
}
}
/*f.addWindowListener(new WindowAdapter()
{
public void windowClosing(WindowEvent e)
{
if(e.getSource()==b2)
System.exit(0);
dispose();
}
});*/
public void paint(Graphics g)
{
g.drawString("Name:"+name,170,170);
}


}






























