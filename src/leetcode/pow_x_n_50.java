package leetcode;
public class pow_x_n_50 {

	public static void main(String[] args) {
		float x = 2.0000f;
		int n = 10;
		pow(x,n,1);
	}
	public static void pow(float x , int n,float ans)
	{
		if(n==0) {
			System.out.print(ans);
			return;
		}
		pow(x,n-1,ans*x);
	}

}
