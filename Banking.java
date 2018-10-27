
import java.util.*;
class Banking
{
Scanner sc=new Scanner(System.in);
double balance,ci;
String name;
int accno;

void createAccount()
{
System.out.println("Enter name");
name=sc.next();
System.out.println("Enter account number");
accno=sc.nextInt();
System.out.println("Enter initial balance");
balance=sc.nextDouble();
System.out.println("Account created successfully");
}
void deposit()
{
double n;
System.out.println("Enter amount to deposit");
n=sc.nextDouble();
balance=balance+n;
System.out.println("Deposited successfully");
}
void withdraw()
{
double n;
System.out.println("Enter amount to withdraw");
n=sc.nextDouble();
if(balance>=n)
{
balance=balance-n;
System.out.println("Withdraw Successful");
}
else
System.out.println("Insufficient balance");
}
void computeInterest()
{
double r=0.05;
ci=balance*(1+r);
System.out.println("Comount interest yearly at 5% per annum is:"+ci);
}
void display()
{
System.out.println("Account details:");
System.out.println("Name:"+name);
System.out.println("Account number:"+accno);
System.out.println("Balance:"+balance);
System.out.println("Interest computed:"+ci);
}

public static void main(String args[])
{
int ch;
Banking b1=new Banking();
Scanner sc=new Scanner(System.in);
do
{
System.out.println("MENU\n1.CreateAccount\n2.Deposit\n3.Withdraw\n4.Interest\n5.Display\n6.Exit");
System.out.println("Enter choice");
ch=sc.nextInt();
switch(ch)
{
case 1:b1.createAccount();
break;
case 2:b1.deposit();
break;
case 3:b1.withdraw();
break;
case 4:b1.computeInterest();
break;
case 5:b1.display();
break;
case 6:break;
}
}while(ch!=6);
}
}