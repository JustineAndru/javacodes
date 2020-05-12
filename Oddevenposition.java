import java.util.*;
class Oddevenposition
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int a[]=new int[n];
		int c=0;
		for(int i=0;i<n;i++)
		{
			a[i]=s.nextInt();
		}
		for(int i=0;i<n;i++)
		{
			if(a[i]%2==0 && i%2==0)
			{
				System.out.println(a[i]);
			}
			else if(a[i]%2!=0 && i%2!=0)
			{
				System.out.println(a[i]);
			}
			else
			{
			c=c+1;
		}
		}
		if(c==n)
		{
			System.out.println("-1");
		}
	}
}