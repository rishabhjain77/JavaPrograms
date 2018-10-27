//string counts
import java.util.*;
class Counting
{
public static void main(String args[])
{
String in;
int n,con=0,blank=0,digits=0,vow=0,spcl=0;
Scanner sc=new Scanner(System.in);
System.out.println("Enter a line");
in=sc.nextLine();
n=in.length();
for(int i=0;i<n;i++)
{
if(in.charAt(i)==' ')
blank++;
else if(in.charAt(i)=='a'||in.charAt(i)=='e'||in.charAt(i)=='i'||in.charAt(i)=='o'||in.charAt(i)=='u')
vow++;
else if(in.charAt(i)>='a'&&in.charAt(i)<='z')
con++;
else if(in.charAt(i)>='0'&&in.charAt(i)<='9')
digits++;
else
spcl++;
}
System.out.println("Vowels are:"+vow);
System.out.println("Consonants are:"+con);
System.out.println("Digits are:"+digits);
System.out.println("Spaces are:"+blank);
System.out.println("Special symbols are:"+spcl);
}
}