//Constructor Overloading
import java.util.*;
class Const
{
Scanner sc=new Scanner(System.in);
Const()
{
float r,pi=3.14f,area;
System.out.println("Enter radius");
r=sc.nextFloat();
area=r*r*pi;
System.out.println("Area of circle:"+area);
}
Const(int x,int y)
{
int area;
area=x*y;
System.out.println("Area of rectangle is"+area);
}
Const(double b,double h)
{
double area;
area=0.5*x*y;
System.out.println("Area of triangle is:"+area);
}
public static void main(String args[])
{
Const c1=new Const();
Const c2=new Const(10,20);
Const c3=new Const(9,10);
}
}


