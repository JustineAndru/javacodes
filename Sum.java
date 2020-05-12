import java.util.*;
class Sum
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int k=s.nextInt();
		int a[]=new int[n];
		int c=0;
		for(int i=0;i<n;i++)
		{
			a[i]=s.nextInt();
		}
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(a[i]+a[j]==k)
				{
					c=c+1;
				}
			}
		}
		if(c==0)
		{
			System.out.println("no");
		}
		else
		{
			System.out.println("yessk");
		}
	}
}