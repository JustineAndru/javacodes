import java.util.*;
class Pattern
{
	static void pattern(String str,int len){
		int i=0,k,j;
		for (i=0;i<len;i++)
		{
			j=len-1-i;
			for(k=0;k<len;k++)
			{
				if(k==i  k==j)
				{
					System.out.println(str.charAt(k));
				}
				else
				{
					System.out.println(" ");
				}
			}
			System.out.println("");
		}
}
public static void main(String s[])
{
Scanner sc=new Scanner(System.in);
int i,len;
String str=sc.next();
len=str.length();
pattern(str,len);
}

}
