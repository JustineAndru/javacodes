import java.util.*;
class Characterreach
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		char c=sc.next().charAt(0);
		char r[]=new char[s.length()];
		for(int i=0;i<s.length();i++)
		{
		if(s.charAt(i)!=c)
		{
		   r[i]=s.charAt(i);
		}
		else if(s.charAt(i)==c)
		{
			r[i]=s.charAt(i);

			break;
		}
	}
    String cd=new String(r);
    cd=cd.trim();
    System.out.println(cd);
}
}