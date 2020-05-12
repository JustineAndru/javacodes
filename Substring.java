import java.util.*;
class Substring
{
public static void main(String s[])
{
Scanner sc=new Scanner(System.in);
String str1=sc.next();
String str2=sc.next();
int i,j;
char ch=0;
for(i=0;i<str2.length();i++)
{
	for(j=0;j<str1.length();j++)
	{
		if(str2.charAt(i)==str1.charAt(j))
		{
			//System.out.println(str1.charAt(j));
			ch=str1.charAt(j);
		    break;
	    }
    }
}
System.out.println((str1.indexOf(ch)-str2.length())+1);
}
}
