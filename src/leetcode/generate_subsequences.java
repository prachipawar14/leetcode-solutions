package leetcode;


public class generate_subsequences {

	public static void main(String[] args) {
		String s = "abc";
		sub(s,"");

		
	}
	public static void sub(String s,String ans)
	{
		
		if(s.length()==0) {
			System.out.println(ans);
			return;
		}
		char ch = s.charAt(0);
		String remain = s.substring(1);
		
		sub(remain , ans);
		sub(remain , ans+ch);
		
	}

}
