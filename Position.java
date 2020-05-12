import java.util.*;
class Position
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=s.nextInt();
		}
		int t=0;
		for(int i=1;i<a.length;i++)
		{
			if(a[i]<a[t])
			{
				t=i;
			}
		}
		int e=0;
		for(int i=1;i<a.length;i++)
		{
			if(a[i]>a[e])
			{
				e=i;
			}
	}
		System.out.println((t+1)+" "+(e+1));
	}
}
