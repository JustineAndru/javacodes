import java.util.*;
class Oldest
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		int b=0;
		int a[]=new int[5];
		for(int i=0;i<5;i++)
		{
			a[i]=s.nextInt();
		}
		for(int i=0;i<5;i++)
		{
			for(int j=i+1;j<5;j++)
			{
				if(a[i]<a[j])
				{
					b=a[i];
					a[i]=a[j];
					a[j]=b;
			    }
			}
		}
		System.out.println(a[0]);
	}
}
