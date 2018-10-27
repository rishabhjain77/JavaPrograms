//Using runnable

class Display implements Runnable
{
public void run() 
{

int i;
System.out.println("Inside run method");
for(i=0;i<=10;i++)
{
try{Thread.sleep(1000);} catch(Exception e){};
System.out.print(i+" ");
}
}
}
class Display2 extends Thread
{
public void run() 
{
int i;
System.out.println("Inside Display 1 run");
for(i=0;i<=10;i++)
{
try{Thread.sleep(1000);} catch(Exception e){};
System.out.println(i+" ");
}
}
}
class Threading
{
public static void main(String args[]) throws Exception
{
System.out.println("Main thread");
Display d1=new Display();
Thread t1=new Thread(d1);
Display2 t2=new Display2();
t1.start();
//t2.sleep(1000);
t2.start();

}
}