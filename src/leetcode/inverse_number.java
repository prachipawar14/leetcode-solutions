package leetcode;


public class inverse_number {

	public static void main(String[] args) {
		
		int n = 32145;
		
		System.out.print(inverse(n));
		
	}
	public static int inverse(int n)
	{
		int sum = 0;
		int pos = 1;
		
		while(n>0)
		{
			int d = n%10;
			sum = (int) (sum+pos*(Math.pow(10, d-1)));
			pos++;
			n/=10;
		}
		
		return sum;
	}

}
