//Hierarchical Inheritance
import java.util.*;
class Room 
{
int length,breath;
Scanner sc=new Scanner(System.in);
void area()
{
int area;
System.out.println("Inside Room class");
System.out.println("Enter minimum length and breath of a room");
length=sc.nextInt();
breath=sc.nextInt();
area=length*breath;
System.out.println("Area of basic room:"+area);
}
}
class Bedroom extends Room
{
int height;
void volume()
{
int vol;
super.area();
System.out.println("Inside bedroom");
System.out.println("Enter height for bedroom");
height=sc.nextInt();
vol=length*breath*height;
System.out.println("Volume of bedroom:"+vol);
}
}
class Hall extends Room
{
int height;
void volume()
{
int vol;
super.area();
System.out.println("Inside Hall");
System.out.println("Enter height for Hall");
height=sc.nextInt();
vol=length*breath*height;
System.out.println("Volume of Hall is:"+vol);
}
}
class InheritanceTest
{
public static void main(String args[])
{
Room r1=new Room();
Bedroom b1=new Bedroom();
Hall h1=new Hall();
System.out.println("Calling bedroom volume");
b1.volume();
System.out.println("Calling hall volume");
h1.volume();
}
}