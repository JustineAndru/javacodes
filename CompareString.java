import java.util.*;
public class CompareString {

    public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String n=s.next();
		int st=(int)n.charAt(n.length()-1);
		int count=0;
		int b;
		for(int i=0;i<n.length()-1;i++)
		{
			b=(int)n.charAt(i);
			if(b==st)
			{
				break;
			}
			else if(b!=st)
			{
				count=count+1;
		    }

		}
		for(int i=count+1;i<n.length();i++)
		{
			System.out.print(n.charAt(i));
		}

	}
}