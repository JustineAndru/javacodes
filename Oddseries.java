import java.util.*;
class Oddseries
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int st[]=new int[n];
		int i,sum=0;
		for(i=1;i<=st.length;i++)
		{
		   sum=i*i+1;
		   System.out.print(sum+" ");
		}
	}
}