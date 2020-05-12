import java.util.*;
class NumberAlphabetsseparate
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		String str=s.next();
		char ch[]=str.toCharArray();
		char a[]=new char[str.length()];
		char b[]=new char[str.length()];
		int i,j,c=0,d=0;
		for(i=0;i<ch.length;i++)
		{
			if((ch[i]>='a' && ch[i]<='z')||(ch[i]>='A' && ch[i]<='Z'))
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
	    System.out.println(a1+b1);
	}
}
