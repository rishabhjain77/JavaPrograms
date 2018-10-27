//vectors
import java.util.*;
class Vectors
{
public static void main(String args[])
{
int n,i,l,flag=1;
String str,str1;
Scanner sc=new Scanner(System.in);
Vector v=new Vector();
System.out.println("Enter number of strings");
n=sc.nextInt();
System.out.println("Enter strings");
for(i=0;i<n;i++)
{
str=sc.next();
v.insertElementAt(str,i);
}
System.out.println("Enter a new String");
str1=sc.next();
l=v.size();
for(i=0;i<v.size();i++)
{
if(v.contains(str1))
{
v.removeElement(str1);
flag=0;
}
}
if(flag==1)
v.addElement(str1);
System.out.println("Vector is:");
for(i=0;i<v.size();i++)
{
System.out.println(v.elementAt(i));
}
}
}