package leetcode;
public class print_subsequence_and_count {

	public static void main(String[] args) {
		String s = "abc";
		System.out.print(sub(s,""));

	}
	public static int sub(String s,String ans)
	{
		
		if(s.length()==0) {
			System.out.println(ans);
			return 1;
		}
		char ch = s.charAt(0);
		String remain = s.substring(1);
		
		int a = sub(remain , ans);
		int b = sub(remain , ans+ch);
		return a+b;
		
	}


}
