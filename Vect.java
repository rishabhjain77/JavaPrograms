//frequency of element
import java.util.*;
class Vect
{
public static void main(String args[])
{
int n,j=0,i;
String temp,t1;
Vector v=new Vector();
Scanner sc=new Scanner(System.in);
System.out.println("Enter n");
n=sc.nextInt();
System.out.println("Enter anything");
for(i=0;i<n;i++)
{
temp=sc.next();
v.insertElementAt(temp,i);
}
System.out.println("Enter element for its frequency");
t1=sc.next();
if(v.contains(t1))
{
j++;
}

System.out.println("Frequency of"+t1+"is"+j);
}
}

