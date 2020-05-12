import java.util.*;
class Lastoccurance
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int a[]=new int[n];
		int b[]=new int[n];
		int c=0,w=0;
		for(int i=0;i<n;i++)
		{
			a[i]=s.nextInt();
		}
		int k=s.nextInt();
		for(int i=0;i<n;i++)
		{
			if(a[i]==k)
			{
				c=i;
				w=w+1;
		    }
	    }
		for(int i=0,e=0;i<a.length;i++)
		{
			if(i==c)
			{
				continue;
			}
			b[e++]=a[i];
		}
		if(w>=1)
		{
		   for(int i=0;i<b.length-1;i++)
		   {
		    	System.out.println(b[i]);
		   }
	     }
	   else
	   {
		   for(int i=0;i<n;i++)
		   {
			   System.out.println(a[i]);
		   }
}
	}
}
