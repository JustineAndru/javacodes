import java.util.*;
class Matrixdiagonals
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int mat[][]=new int[n][n];
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				mat[i][j]=s.nextInt();
			}
		}
		int p=0,se=0;
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(i==j)
				{
					p+=mat[i][j];
				}
				if((i+j)==(n-1))
				{
					se+=mat[i][j];
				}
			}
		}
		System.out.println(p*se);
	}
}