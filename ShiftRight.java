import java.util.*;
class ShiftRight
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int a[]=new int[n];
		int b[]=new int[n];
		int j;
		for(int i=0;i<n;i++)
		{
			a[i]=s.nextInt();
		}
		b[0]=a[n-1];
		for(int i=0;i<n-1;i++)
		{
			for(j=i+1;j<n;j++)
			{
			   b[j]=a[i];
		   }
	    }
	    for(int i=0;i<b.length;i++)
	    {
			System.out.println(b[i]);
		}
	}
}