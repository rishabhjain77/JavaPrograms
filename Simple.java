/*<applet code="Simple.class" height=300 width=400></applet>*/


import java.awt.*;
import java.awt.event.*;
import java.applet.*;

public class Simple extends Applet implements ActionListener
{
String name,email,pass,clas;
TextField t1=new TextField(8);
TextField t2=new TextField(8);
TextField t3=new TextField(8);
TextField t4=new TextField(8);
Label l1=new Label("Username");
Label l2=new Label("Email id");
Label l3=new Label("Password");
Label l4=new Label("Class");
Button b1=new Button("Submit");
CheckboxGroup g1=new CheckboxGroup();
Checkbox c1=new Checkbox("First class",g1,true);
Checkbox c2=new Checkbox("Second class",g1,false);
FlowLayout f=new FlowLayout(FlowLayout.LEFT,0,5);
public void init()
{
setLayout(f);
add(l1);
add(t1);
add(l2);
add(t2);
add(l3);
add(t3);
add(l4);
add(c1);
add(c2);
add(b1);
b1.addActionListener(this);
}
public void actionPerformed(ActionEvent e)
{
name=t1.getText();
email=t2.getText();
pass=t3.getText();
clas=g1.getSelectedCheckbox().getLabel();
repaint();
}
public void paint(Graphics g)
{
g.drawString("Name:"+name,100,100);
g.drawString("Email:"+email,100,120);
g.drawString("Password:"+pass,100,130);
g.drawString("Class:"+clas,100,140);
}
}



















































































