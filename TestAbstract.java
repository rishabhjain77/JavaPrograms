import java.util.*;
abstract class Details
{
void show()
{
System.out.println("Abstract class of details");
}
abstract void form();
}

class TestAbstract extends Details
{
String name,email;
char gender;
int age;
public void form()
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter name");
name=sc.next();
System.out.println("Enter gender");
gender=sc.next().charAt(0);
System.out.println("Enter age");
age=sc.nextInt();
System.out.println("Enter email");
email=sc.next();
}
void display()
{
System.out.println("Details are:");
System.out.println(age);
System.out.println(name);
System.out.println(email);
System.out.println(gender);
}
public static void main(String args[])
{
Details d1=new TestAbstract();
TestAbstract t1=new TestAbstract();
d1.show();
d1.form();
t1.display();
}
}
