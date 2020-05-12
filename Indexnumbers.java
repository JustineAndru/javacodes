import java.util.*;
class Indexnumbers
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int a[]=new int[n];
		int i,c=0;
		for(i=0;i<n;i++)
		{
			a[i]=s.nextInt();
		}
		for(i=0;i<n;i++)
		{
			if(a[i]==i)
			{
				System.out.print(a[i]+" ");
			}
			else
			{
				c=c+1;
			}
		}
		if(c>=n)
		{
			System.out.println("-1");
		}
	}
}