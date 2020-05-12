import java.util.*;
class DescendingCheck
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int a[]=new int[n];
		int i,j,c=0;
		for(i=0;i<n;i++)
		{
			a[i]=s.nextInt();
		}
		for(i=0;i<n;i++)
		{
			for(j=i+1;j<n;j++)
			{
				if(a[i]>=a[j])
			    {
				   c=c+1;
			    }
			    break;
		    }
		}
		if(c==n-1)
		{
		  System.out.println("yes");
	  }
	   else
	   {
		   System.out.println("no");
	   }
	}
}