import java.util.*;
class Hcf
{
	public static void main(String s[])
	{
		Scanner st=new Scanner(System.in);
		int a=st.nextInt();
		int i,c=0;
		int b=st.nextInt();
		for(i=1;i<100;i++)
		{
			if(a%i==0 && b%i==0)
			{
				c=i;
			}
		}
		System.out.println(c);
	}
}