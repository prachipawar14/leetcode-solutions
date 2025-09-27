
public class chewbacca_and_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n = 4445;
		
		System.out.print(chewbaco(n));

	}
	
	public static int chewbaco(int n)
	{
		int pos = 1;
		int result = 0;
		
		while(n>0)
		{
			int d = n%10;
			int ans = (9-d) < d ? (9-d) : d;
			result = ans*pos+result;
			pos*=10;
			n/=10;
		}
		return result;
	}

}
