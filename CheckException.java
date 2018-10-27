//Exception handling
class CheckException
{
public static void main(String args[])
{
int i,k,invalid=0;
for(i=0;i<args.length;i++)
{
try
{
k=Integer.parseInt(args[i]);
}
catch(NumberFormatException e)
{
invalid++;
}
}
System.out.println("Valid integers are"+(args.length-invalid)+"Invalid integer are"+invalid);
}
}