import java.util.*;
class SortAscending
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		String str=null;
		while(str==null || str.length()!=n)
		{
			str=s.next();
		}
		char ch[]=str.toCharArray();
		Arrays.sort(ch);
		String st=new String(ch);
		System.out.println(st);
	}
}