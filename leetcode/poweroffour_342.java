
public class poweroffour_342 {

	public static void main(String[] args) {
		int n = 64;
		System.out.print(power(n,1));

	}
	public static boolean power(int n , int ans)
	{
		if(ans==n) {
			return true;
		}
		if(ans>n) {
			return false;
		}
        if(ans>Integer.MAX_VALUE/4) return false;
		return power(n,ans*4);
	}

}
