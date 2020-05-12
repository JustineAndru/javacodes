import java.util.*;
class SumProduct
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int sum=0,p=1,a;
		int w=n;
		while(n>0)
		{
			a=n%10;
			sum=sum+a;
			p=p*a;
			n=n/10;
		}
	    int x=sum+p;
		if(x == w)
		{
		   System.out.println("yes");
	   }
	   else
	   {
		   System.out.println("no");
	   }
	}
}