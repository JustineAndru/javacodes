import java.util.*;
class Largestinposition
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		Set<Integer> set=new HashSet<>();
		int n=s.nextInt();
		int k=s.nextInt();
		int t=0;
		int a[]=new int[n];
		int b[]=new int[set.size()];
	    for(int i=0;i<n;i++)
	    {
			a[i]=s.nextInt();
		}
	    for(int i=0;i<n;i++)
	    {
			set.add(a[i]);
		}

		int j=0;
		for(int i: set)
		{
			b[j++]=i;
	    }
	    for(int i=0;i<b.length;i++)
	    {
			for(j=i+1;j<b.length;j++)
			{
				if(b[i]<b[j])
				{
					t=b[i];
					b[i]=b[j];
					b[j]=t;
				}
			}
		}
		int m=b.length;
		if(k>=m)
		{
		    System.out.println(b[m-1]);
		}
		else
		{
			System.out.println(b[k-1]);
		}
	}
}
