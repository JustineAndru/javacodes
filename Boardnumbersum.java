import java.util.*;
class Boardnumbersum
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		String str=s.nextLine();
		int sum=0;
		for(int i=0;i<str.length();i++)
		{
			if(Character.isDigit(str.charAt(i)))
			{
				String t=str.substring(i,i+1);
				sum+=Integer.parseInt(t);
			}
		}
		System.out.println(sum);
	}
}