import java.util.*;
class Large{
public static int getSecondLargestDigit(int n)
{
	int large=-1;
	while(n>0)
	{
	    int unit=n%10;
	    if(unit>large)
	    {
			large=unit;
		}
		n=n/10;
	}

return large;
}

public static void main(String s[])
{
	Scanner st=new Scanner(System.in);
	int n=st.nextInt();
	int a=getSecondLargestDigit(n);
	System.out.println(a);
}
}
