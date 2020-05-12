import java.util.*;
class Nposition
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int x=s.nextInt();
	    int arr[]=new int[n];
	    int i,j,t,temp=0;

	    for(i=0;i<n;i++)
	    {
			arr[i]=s.nextInt();
		}
		for(i=0;i<n;i++)
		{
			for(j=i+1;j<n;j++)
			{
			   if(arr[i]>arr[j])
			   {
				   temp=arr[i];
			   }
			}
		}
		for(i=0;i<n;i++)
		{
			for(j=i+1;j<n;j++)
			{
		        if(arr[i]<arr[j])
				{

					t=arr[i];
				  	arr[i]=arr[j];
					arr[j]=t;
				}
			}
		}
        arr[x-1]=temp;
		for(i=0;i<n;i++)
		{
			System.out.println(arr[i]);
		}
	}
}