import java.util.*;
class Countdigits
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int arr[]=new int[10];
		String st=Integer.toString(n);

		while(n>0)
		{
			int x=n%10;
			arr[x]=arr[x]+1;
			n=n/10;
		}
		System.out.println(arr.length);


	}
}