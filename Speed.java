import java.util.*;
import java.text.DecimalFormat;
class Speed
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		double n=s.nextInt();
		double m=n*1000/3600;
		String st=Double.toString(m);
		System.out.println(Double.valueOf(String.valueOf(st).substring(0,2)));

	}
}
