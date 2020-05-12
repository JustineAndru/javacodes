import java.util.*;
class Identify
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		String n=s.next();
		String str[]=new String[10];
		int i,j;
		for(i=0;i<10;i++)
		{
			str[i]=s.next();
		}
		for(i=0;i<n.length();i++)
		{
			char a=n.charAt(i);
			int b=Integer.parseInt(String.valueOf(a));
		    System.out.print(str[b]+" ");

		}
	}
}