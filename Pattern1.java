import java.util.*;
class Pattern1
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int i,j,c=0;
		String str;
		for(i=n;i>0;i--)
		{
			System.out.print("*");
        }
        System.out.println();
        for(i=n-1;i>0;i--)
        {
			for(j=0;j<=i;j++)
			{
				if(j<i)
				{
				  System.out.print("*");
			    }
			    else
			    {
					str="-";
					c=c+1;
					System.out.print(str.repeat(c));
				}
			}
			System.out.println();
		}
   }
}