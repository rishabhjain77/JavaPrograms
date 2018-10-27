//String palindrome
import java.util.*;
class Palin
{
public static void main(String args[])
{
String p,r="";
int i,flag=0;
Scanner sc=new Scanner(System.in);
System.out.println("Enter a String");
p=sc.next();
for(i=p.length()-1;i>=0;i--)
{
r=r+p.charAt(i);
}
System.out.println(r);
for(i=0;i<p.length();i++)
{
if(r.charAt(i)==p.charAt(i))
{
flag=0;
}
else 
{
flag=1;
break;
}
}
if(flag==1)
{
System.out.println("Not palindrome");
}
else
System.out.println("palindrome");
}
}