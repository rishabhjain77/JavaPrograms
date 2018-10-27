//Method Overloading//
import java.util.*;
class Method
{
void disp(int id,String name,char grade)
{
System.out.println("Call to display 1");
System.out.println("Student name:"+" "+name+"\n"+"Student ID:"+" "+id+"\n"+"Student grade:"+grade);
}
void disp(String name,String branch)
{
System.out.println("Call to display 2");
System.out.println("Student name:"+" "+name+"\n"+"Student branch:"+" "+branch);
}
public static void main(String arges[])
{
String name,branch;
char grade;
int id;
Scanner sc=new Scanner(System.in);
Method m1=new Method();
System.out.println("Enter name");
name=sc.next();
System.out.println("Enter id");
id=sc.nextInt();
System.out.println("Enter grade");
grade=sc.next().charAt(0);
System.out.println("Enter branch");
branch=sc.next();
m1.disp(id,name,grade);
m1.disp(name,branch);
}
}
