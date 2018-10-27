interface Form
{
public void form();
}
interface Display extends Form
{
public void show(String name,int age);
}
class DemoInterface implements Display
{
public void form()
{
String name="Rishabh";
int age=13;
show(name,age);
}
public void show(String name,int age)
{
System.out.println("Name:"+name+"age:"+age);
}
public static void main(String args[])
{
DemoInterface d=new DemoInterface();
d.form();
}
} 