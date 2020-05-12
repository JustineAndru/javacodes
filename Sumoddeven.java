import java.util.*;
class Sumoddeven
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int a=0,sum=0,sum1=0;
		while(n>0)
		{
			a=n%10;
			if(a%2==0)
			{
				sum=sum+a;
			}
			else
			{
				sum1=sum1+a;
			}
			n=n/10;
		}
		System.out.println(sum1-sum);
	}
}
