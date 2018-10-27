import java.util.*;
class Matrix
{
void add(int a[][],int b[][],int m,int n)
{
int i,j;
int c[][]=new int[m][n];
for(i=0;i<m;i++)
{
 for(j=0;j<n;j++)
  {
    c[i][j]=0;
    c[i][j]=a[i][j]+b[i][j];
  }
}
for(i=0;i<m;i++)
{
 for(j=0;j<n;j++)
  {
    System.out.print(c[i][j]+"\t");
  }
System.out.print("\n");
}
}
void mul(int a[][],int b[][],int m,int n,int p,int q)
{
int k,i,j;
if(n!=p)
System.out.println("Multiplication not possible");
else
{
int c[][]=new int[m][q];
for(i=0;i<m;i++)
{ 
 for(j=0;j<q;j++)
 {
   c[i][j]=0;
  for(k=0;k<n;k++)
  {
   c[i][j]=c[i][j]+a[i][k]*b[k][j];
  }
 }
}
for(i=0;i<m;i++)
{
 for(j=0;j<q;j++)
  {
    System.out.print(c[i][j]+"\t");
  }
System.out.print("\n");
}
}
}
void transpose(int a[][],int m,int n)
{
int b[][]=new int[n][m];
int i,j;
for(i=0;i<n;i++)
{
  for(j=0;j<m;j++)
  {
   b[i][j]=a[j][i];
  }
}
for(i=0;i<n;i++)
{
 for(j=0;j<m;j++)
  {
    System.out.print(b[i][j]+"\t");
  }
System.out.print("\n");
}
}
public static void main(String args[])
{
int ch,i,j,m,n,p,q;
Scanner sc=new Scanner(System.in);
Matrix m1=new Matrix();
do
{
System.out.println("1.Addition\n2.Multiplication\n3.Transpose\n4.Exit");
System.out.println("Enter choice");
ch=sc.nextInt();
switch(ch)
{
case 1:System.out.println("Enter m and n for matrix A");
m=sc.nextInt();
n=sc.nextInt();
int a[][]=new int[m][n];
int b[][]=new int[m][n];
System.out.println("Enter elements of A");
for(i=0;i<m;i++)
{
 for(j=0;j<n;j++)
 {
  a[i][j]=sc.nextInt();
 }
}
System.out.println("Enter elements of B");
for(i=0;i<m;i++)
{
 for(j=0;j<n;j++)
 {
  b[i][j]=sc.nextInt();
 }
}
m1.add(a,b,m,n);
break;

case 2:System.out.println("Enter m and n for matrix A");
m=sc.nextInt();
n=sc.nextInt();
System.out.println("Enter p and q for matrix B");
p=sc.nextInt();
q=sc.nextInt();
int e[][]=new int[m][n];
int d[][]=new int[p][q];
System.out.println("Enter elements of A");
for(i=0;i<m;i++)
{
 for(j=0;j<n;j++)
 {
  e[i][j]=sc.nextInt();
 }
}
System.out.println("Enter elements of B");
for(i=0;i<p;i++)
{
 for(j=0;j<q;j++)
 {
  d[i][j]=sc.nextInt();
 }
}
m1.mul(e,d,m,n,p,q);
break;

case 3:System.out.println("Enter m and n for matrix A");
m=sc.nextInt();
n=sc.nextInt();
int f[][]=new int[m][n];
System.out.println("Enter elements");
for(i=0;i<m;i++)
{
 for(j=0;j<n;j++)
 {
  f[i][j]=sc.nextInt();
 }
}
m1.transpose(f,m,n);
break;
case 4:break;
}
}while(ch!=4);
}
}