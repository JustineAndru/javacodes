import java.util.*;
class OddAEvenD
{
public static void main(String s[])
{
 int i,n;
 List<Integer>odd=new ArrayList<Integer>();
 List<Integer>even=new ArrayList<Integer>();
 List<Integer>merged=new ArrayList<Integer>();
 Scanner st=new Scanner(System.in);
 n=st.nextInt();
 int num[]=new int[n];
 for(i=0;i<n;i++)
 {
	 num[i]=st.nextInt();
 }
 for(i=0;i<num.length;i++)
 {
	 if(num[i]%2==0)
	 {
		 even.add(num[i]);
	 }
	 else
	 {
		 odd.add(num[i]);
     }

}
Collections.sort(odd);
Collections.sort(even,Collections.reverseOrder());
merged.addAll(odd);
merged.addAll(even);
for(i=0;i<merged.size();i++)
{
	System.out.print(merged.get(i)+" ");
}
}
}