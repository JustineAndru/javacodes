import java.util.*;
class Allalphabets
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		String k=s.next();
		String l=s.next();
		String q=k+l;
		String m=q.toLowerCase();
		String ch[]=m.split("");
		Set<String> set=new HashSet<>();
		for(int i=0;i<=m.length()-1;++i)
		{
			set.add(ch[i]);
		}
		String arr[]=new String[set.size()];
		int i=0;
		for(String st: set)
		{
			arr[i++]=st;
		}
		int a=arr.length;
		if(a==26)
		{
		   System.out.println("yes");
	   }
	   else
	   {
		   System.out.println("no");
	   }
	}
}