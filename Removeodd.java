import java.util.*;
class Removeodd
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		String b="";
		int n=s.nextInt();
        int j=0,len,c=0;
        len=Integer.toString(n).length();
        int a[]=new int[len];
        while(n!=0)
        {
			a[len-j-1]=n%10;
			n=n/10;
			j++;
		}
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2==0)
			{
				b=b+a[i];
			}
			else
			{
				c=c+1;
			}
		}
		if(c==0)
		{
			System.out.println("-1");
		}
		else
		{
		    System.out.println(b);
		}

}
}

