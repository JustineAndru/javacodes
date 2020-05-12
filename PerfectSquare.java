import java.util.*;
class PerfectSquare
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int m=s.nextInt();
		for(int i=n;i<=m;i++)
		{
			if(Math.sqrt(i)==(int)Math.sqrt(i))
			{
				System.out.print(i+" ");
			}
		}
	}
}