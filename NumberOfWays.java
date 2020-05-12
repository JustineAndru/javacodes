import java.util.*;
class NumberOfWays
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int flag,j,c=0,d=0;
		int a[]=new int[n];
		for(int i=1;i<=n;i++)
		{
			flag=1;
			for(j=2;j<=i/2;++j)
			{
				if(i%j==0)
			    {
					flag=0;
					break;
				}
			}
			if(flag==1)
			{
				a[c]=i;
				c=c+1;
			}
	    }
		int b[]=new int[c];
		for(int i=0;i<b.length;i++)
		{
			b[i]=a[i];
		}
		for(int i=0;i<b.length;i++)
		{
			for(j=i;j<b.length;++j)
			{
				if(b[j]+b[i]==n)
				{
					d=d+1;
				}
			}
	   }
	   System.out.println(d);
	}
}

