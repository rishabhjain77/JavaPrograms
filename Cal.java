//Try,catch,fianlly
import java.util.*;
class Cal
{
void sum(int n) throws InputMismatchException
{
int s=0,i;
if(n<0)
{
throw new ArithmeticException("Negative number!!");
}
else
{
for(i=1;i<=n;i++)
s=s+i;
System.out.println("Summation is:"+s);
}
}
public static void main(String args[])
{
int n;
Scanner sc=new Scanner(System.in);
Cal c1=new Cal();
try
{
System.out.println("Enter limit of series");
n=sc.nextInt();
c1.sum(n);
}
catch(InputMismatchException e)
{
System.out.println("Error:Wrong input:"+e);
}
catch(ArithmeticException e)
{
System.out.println("Error:"+e.getMessage());
}
finally
{
System.out.println("Enter limit of series");
n=sc.nextInt();
c1.sum(n);
}



}
}