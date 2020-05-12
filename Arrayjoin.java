import java.util.*;
class Arrayjoin
{
	public static void merge(int num1[],int num2[],int n1,int n2,int num3[])
	{
	        int i=0,j=0,k=0;
	        while(i<n1 && j<n2)
	        {
				if(num1[i]<num2[j])
				{
					num3[k++]=num1[i++];
				}
				else
				{
					num3[k++]=num2[j++];
				}
				while(i<n1)
				{
					num3[k++]=num1[i++];
				}
				while(j<n2)
				{
					num3[k++]=num2[j++];
				}
			}
		}
	static int remove(int num3[],int a)
	{
		if(a==0 || a==1)
		{
			return a;
	}
		int j=0;
		for(int i=0;i<a-1;i++)

			if(num3[i]!=num3[i+1])

			  num3[j++]=num3[i];
		num3[j++]=num3[a-1];

	return j;
}
	public static void main(String s[])
	{
		Scanner st=new Scanner(System.in);
        int num1[]={2,4,5,6,7,9,10,13};
        int n1=num1.length;
        int num2[]={2,3,4,5,6,7,8,9,11,15};
        int n2=num2.length;
        int num3[]=new int[n1+n2];
        merge(num1,num2,n1,n2,num3);
        //for(int j=0;j<n1+n2;j++)
        //{
		//	System.out.println(num3[j]+" ");
		//}
		int h=num3.length;
		h=remove(num3,h);
		for(int i=0;i<h;i++)
		{
			System.out.println(num3[i]+" ");
		}

}
}