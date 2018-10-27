//Exception handilng
import java.util.*;
class TestException
{
static void cal() throws ArithmeticException
{
float a,b;
Scanner sc=new Scanner(System.in);
System.out.println("Enter a and b");
a=sc.nextFloat();
b=sc.nextFloat();
float c;
try
{
c=(a/b);
System.out.println(c);
throw new ArithmeticException("Divide by zero");
}
catch(ArithmeticException e)
{
System.out.println(e);
throw e;
}
}
public static void main(String args[])
{
try
{
cal();
}
catch(ArithmeticException e)
{
System.out.println("Dumb ass"+e);
}
}
}
