package leetcode;
public class sum_of_two_numbers {

	public static void main(String[] args) {
		
		int n1 = 2357;
		int n2 = 2653;
		
		add(n1,n2);

	}
	public static void add(int n1,int n2)
	{
		
		int sum = 0;
		int c = 0;
		int pos = 1;
		int result=0;
		
		while(n1>0 || n2>0 || c>0)
		{
			int a = n1%10;
			int b = n2%10;
			
			sum = a+b+c;
			result = result+ (sum%10)*pos;
			c = sum/10;
			
			pos*=10;
			n1/=10;
			n2/=10;
		}
		
		
		
		
		System.out.print(result);
	}

}
