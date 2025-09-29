package leetcode;
public class valid_palindrome_125 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "A man, a plan, a canal: Panama";
		System.out.print(valid(s));

	}
	public static boolean valid(String s)
	{
		String a =  s.trim().toLowerCase().replaceAll("[^a-z0-9]","");
        
        int i=0;
        int j=a.length()-1;

        while(i<j)
        {
            if(a.charAt(i) != a.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
	}

}
