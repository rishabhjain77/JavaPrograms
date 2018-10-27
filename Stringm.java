//String methods
class Stringm
{
public static void main(String args[])
{
String str1="RISHABH";
String str2="jain";
String str3;
String str4;
int n;
//n=str2.compareToIgnoreCase(str1);
System.out.println("To lower case:"+str1.toLowerCase());
System.out.println("To Upper case:"+str2.toUpperCase());
str3=str1.replace('R','k');
System.out.println("replaced"+str3);
System.out.println("Char at 2"+str2.charAt(2));
//System.out.println(n);
System.out.println("Comparing strings:"+str1.compareTo(str2));
str4="        "+str1+str3;
System.out.println(str4);
System.out.println("triming string "+str4.trim());

}
}