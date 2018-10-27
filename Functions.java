import java.util.*;
class Functions
{
void fact(int  n)
{
int f=1,a;
a=n;
while(n>0)
{
f=f*n;
n--;
}
System.out.println("Factorial of:"+a+"is"+f);
}
void reverse(int n)
{
int rev=0,d=0;
while(n>0)
{
d=n%10;
rev=rev*10+d;
n=n/10;
}
System.out.println("Reverse is"+rev);
}
void testArmstrong(int n)
{
int a,sum=0,d;
a=n;
while(n>0)
{
d=n%10;
sum=sum+(d*d*d);
n=n/10;
}
if(a==sum)
System.out.println("Number is armstrong");
else
System.out.println("Number is not armstong");
}

void testPalindrome(int n)
{
int rev=0,d=0,a;
a=n;
while(n>0)
{
d=n%10;
rev=rev*10+d;
n=n/10;
}
if(a==rev)
System.out.println("Number is palindrome");
else
System.out.println("Number is not palindrome");
}
void testPrime(int n)
{
int x=2;
while(n%x!=0)
x++;
if(n==x)
System.out.println("Number is prime");
else
System.out.println("Not prime");
}

void fibonacci(int n)
{
int a=0,b=1,c,i;
System.out.print(a+" ");
System.out.print(b+" ");
for(i=0;i<n-2;i++)
{
c=a+b;
System.out.print(c+" ");
a=b;
b=c;
}
}

public static void main(String args[])
{
int n,n1,n2,n3,n4,n5,ch;
Functions f1=new Functions();
Scanner sc=new Scanner(System.in);
do
{
System.out.println("Menu\n1.Factorial\n2.Reverse\n3.Armstrong\n4.Palindrome\n5.Prime\n6.Fibonacci\n7.Exit");
System.out.println("Enter choice");
ch=sc.nextInt();
switch(ch)
{
case 1:System.out.println("Enter n");
n=sc.nextInt();
f1.fact(n);
break;
case 2:System.out.println("Enter n");
n1=sc.nextInt();
f1.reverse(n1);
break;
case 3:System.out.println("Enter n");
n2=sc.nextInt();
f1.testArmstrong(n2);
break;
case 4:System.out.println("Enter n");
n3=sc.nextInt();
f1.testPalindrome(n3);
break;
case 5:System.out.println("Enter n");
n4=sc.nextInt();
f1.testPrime(n4);
break;
case 6:System.out.println("Enter limit");
n5=sc.nextInt();
f1.fibonacci(n5);
break;
case 7:break;
}
}while(ch!=7);
}
}


