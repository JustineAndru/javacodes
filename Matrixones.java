import java.util.*;
class Matrixones
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int m=s.nextInt();
		int mat[][]=new int[n][m];
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<m;j++)
			{
				mat[i][j]=s.nextInt();
			}
		}
		int row=0,result=0,i,j;
		for(i=0;i<n;i++)
		{
			row=0;
			for(j=0;j<m;j++)
			{
		        if(mat[i][j]==1)
				{
			     	row=row+1;
			     	result=Math.max(result,row);
			    }
			    else
			    {
					continue;
				}
			}
		}
		System.out.println(result);
	}
}