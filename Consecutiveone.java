import java.util.*;
class Consecutiveone
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		String st=s.next();
		int a[]=new int[st.length()];
		char ch[]=st.toCharArray();
		for(int i=0;i<st.length();i++)
		{
			a[i]=st.charAt(i)-'0';
		}
		int c=0,result=0;
		for(int i=0;i<st.length();i++)
		{
			if(a[i]==0)
			{
				c=0;
			}

			else
			{
				c=c+1;
				result=Math.max(result,c);
			}
		}
		if(result>1)
		{
			System.out.println(result);
		}
		else
		{
			System.out.println("-1");
		}
	}
}