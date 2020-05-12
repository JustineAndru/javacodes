import java.util.*;
class Median
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		int i,j,r,c;
		r=s.nextInt();
		c=s.nextInt();
		int arr[]=new int[10];
		int mat[][]=new int[r][c];
		for(i=0;i<r;i++)
		{
			for(j=0;j<c;j++)
			{
				mat[i][j]=s.nextInt();
			}
		}
		for(i=0;i<r;i++)
		{
			for(j=0;j<c;j++)
			{
				arr[j]=mat[i][j];
				System.out.print(arr[2]+" ");
			}
			System.out.println();
		}

	}
}

