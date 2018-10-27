//Multithreading
class Table5 extends Thread
{
public void run()
{
table();
}
public  synchronized void table()
{
int i;
for(i=0;i<=5;i++)
{
System.out.println("5*"+i+"="+(5*i));
}
}
}
class Table7 extends Thread
{
public void table1()
{
int i;
for(i=0;i<=5;i++)
{
System.out.println("7*"+i+"="+(7*i));
}
}
}
class TestThread 
{

public static void main(String args[]) throws Exception
{
Table5 t1=new Table5();
Table5 t2=new Table5();
//Table7 t2=new Table7();

t1.start();
t2.start();
//t1.sleep(500);
//t2.start();
}
}
