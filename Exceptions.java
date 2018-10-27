import java.util.*;
class Exceptions
{
void sum() throws InputMismatchException
{
Scanner sc=new Scanner(System.in);
int sum=0,i,n;
System.out.println("Enter n for limit");
n=sc.nextInt();
if(n==-1)
throw new ArithmeticException("Negative number!!");
else
{
for(i=0;i<=n;i++)
sum=sum+i;
System.out.println("Summation is"+sum);
}
}
public static void main(String args[])
{

Exceptions e1=new Exceptions();
try
{
e1.sum();
}
catch(ArithmeticException e)
{
System.out.println("Error:"+e.getMessage());
}
catch(InputMismatchException ae)
{
System.out.println("Error:"+ae);
}
finally
{
e1.sum();
}
}
}
