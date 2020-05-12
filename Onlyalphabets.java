import java.util.*;
class Onlyalphabets
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		String str=s.next();
		str=str.replaceAll("[^a-zA-Z]","");
		System.out.println(str);
	}
}