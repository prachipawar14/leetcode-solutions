package leetcode;
public class sum_of_odd_even_placed_digits {

	public static void main(String[] args) {
		
		int n = 2357;
		
		int evensum  = 0;
		int oddsum = 0;
		int idx = 1;
		int c = 0;
		while(n>0)
		{
			int d = n%10;
			
			if(idx%2==0)
			{
				int sum = evensum+d;
				evensum=sum;
			}
			else {
				oddsum+=d;
			}
			n/=10;
			idx++;
		}
		
		System.out.println("even sum : "+evensum);
		System.out.print("opdd sum : "+oddsum);
		

	}

}
