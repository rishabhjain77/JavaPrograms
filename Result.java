//ExceptionHandling
import java.util.*;
class  MarksOutOfBoundException extends Exception
{
 public  MarksOutOfBoundException(String s)
 {
  super(s);
 }
}


public class Result 
{
 void check(String name,int seatno,int marks)throws MarksOutOfBoundException
 {
  if(marks>100 || marks<0)
  {
    throw new MarksOutOfBoundException("Invalid Marks");
  }
  else
  { 
   System.out.println("Name:"+name+"Seat number:"+seatno+"Marks:"+marks);
  }
 }

public static void main(String args[])
{
 String name;
int marks,seatno;
Scanner sc=new Scanner(System.in); 
Result r1=new Result();
 try
 {
 System.out.println("Enter name");
 name=sc.next();
 System.out.println("Enter seatNumber");
 seatno=sc.nextInt();
 System.out.println("Enter total marks of three sem");
marks=sc.nextInt();
r1.check(name,seatno,marks);
 }
catch(MarksOutOfBoundException e)
{
System.out.println("Exception occured");
System.out.println(e.getMessage());
}
}
}
