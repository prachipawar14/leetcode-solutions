
public class powerofthree_326 {

	public static void main(String[] args) {
		int n = 27;
		System.out.print(power(n,1));
	}
	public static boolean power(int n , int ans)
	{
		if(ans==n) {
			return true;
		}
		if(ans>n || ans<0) {
			return false;
		}
		return power(n,ans*3);
	}

}
