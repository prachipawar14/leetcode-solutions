package contest_2883;
import java.util.*;
public class Ultra_fast_Mathematicians {
	
	public static void main(String[]args)
	{

		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0){
			String s1 = sc.next();
		String s2 = sc.next();
		System.out.println(ans(s1,s2));
		}
    }
	public static String ans(String s1 , String s2 )
	{
		if(s1.length() != s2.length()){
			return "0";
		}
		StringBuilder s = new StringBuilder();
		for(int i=0;i<s1.length();i++)
		{
			if(s1.charAt(i) == s2.charAt(i))
			{
				s.append('0');
			}
			else{
				s.append('1');
			}
		}

		return s.toString();
	}
}
