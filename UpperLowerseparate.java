import java.util.*;
class UpperLowerseparate
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		String str=s.next();
		char ch[]=str.toCharArray();
		char a[]=new char[str.length()];
	    char b[]=new char[str.length()];
		int i,j,c=0,d=0,l1,l2;
		for(i=0;i<ch.length;i++)
		{
			if(ch[i]>='a' && ch[i]<='z')
			{
				a[c]=ch[i];
				c=c+1;
			}
			else
			{
				b[d]=ch[i];
			    d=d+1;
			}
		}
		String a1=new String(a);
		String b1=new String(b);
		a1=a1.trim();
		b1=b1.trim();
		l1=a1.length();
		l2=b1.length();
		if(l1<=l2)
		{
		  System.out.println(a1+b1);
	    }
	    else
	    {
			System.out.println(b1+a1);
		}
	}
}
