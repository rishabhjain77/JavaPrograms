//inheritance
import java.util.*;
class Student
{
void display()
{
//Scanner sc=new Scanner(system.in);
String name="rishabh";
int rno=1;
System.out.println("Name:"+name);
//name=sc.next();
System.out.println("Roll no:"+rno);
//rno=sc.nexInt();
}
}
class Marks extends Student
{
void display()
{
super.display();
int marks=90;
System.out.println("Marks is:"+marks);
}
}
class Details extends Student
{
void display()
{
super.display();
int age=19,div=1;
String branch="INFT";
System.out.println("Details are:");
System.out.println("Age is:"+age);
System.out.println("Division is:"+div);
System.out.println("Branch is:"+branch);
}
}
class Test
{
public static void main(String args[])
{
Student s1=new Student();
Marks m1=new Marks();
//s1.display();
//s1=m1;
//s1.display();
Details d1=new Details();
//s1=d1;
m1.display();
d1.display();
}
}