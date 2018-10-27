//interface
import java.util.*;
interface Form
{
void details();
}
class Student implements Form
{
String name,branch;
int div,rn;
Scanner sc=new Scanner(System.in);
public void details()
{
System.out.println("Enter your name");
name=sc.next();
System.out.println("Enter your Roll number");
rn=sc.nextInt();
System.out.println("Enter your branch and division");
branch=sc.next();
div=sc.nextInt();
System.out.println("Form registered successfully");
}
public void display()
{
System.out.println("DETAILS");
System.out.println("Name:"+name);
System.out.println("RollNo:"+rn);
System.out.println("Branch and division:"+branch+div);
}
}
class InterfaceTest
{
public static void main(String args[])
{
//Form s1=new Student();
Student s1=new Student();
s1.details();
s1.display();
}
}
//Cannot call display method my reference of interface since it doesnt belong to interface
//to call display create obj of student and call 