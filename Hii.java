class Student
{
void putmarks()
{
System.out.println("Hello marks");
}
}
class Result extends Student
{
void putmarks()
{
//super.putmarks();
System.out.println("Hello display");
//putmarks();
}
}
class Hii
{
public static void main(String args[])
{
Student s1=new Student();
Result r1=new Result();
s1.putmarks();
s1=r1;
s1.putmarks();

}
}
