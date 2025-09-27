
public class toss_coin {

	public static void main(String[] args) {
		
		int n=2;
		toss(n,"");
	}
	public static void toss(int n , String ans)
	{
		if(n==0) {
			System.out.println(ans);
			return;
		}
		toss(n-1,ans+'H');
		toss(n-1,ans+'T');
	}

}
