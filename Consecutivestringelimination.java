import java.util.*;
class Consecutivestringelimination
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		String str="dkasjfgkd";
		char ch[]=str.toCharArray();
		int i=0;
		String res[]=new String[100];
		while(ch[i]!='\0')
        {
			if(ch[i]!=ch[i+1])
		        res[i]+=ch[i];
				i++;
		    if(ch[i+1]!='\0' && ch[i]==ch[i+1])

				while(ch[i+1]!='\0' && ch[i]==ch[i+1])

					i++;
				i++;
	   }

	 System.out.println(res);
	}
}
