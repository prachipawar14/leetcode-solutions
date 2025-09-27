
public class replace_0_with_5 {

	public static void main(String[] args) {
		
		int n = 1020;
		System.out.print(replace(n));
	}
	public static int replace(int n)
	{
		 int pos = 1;
		 int ans = 0;
		 
		 while(n>0)
		 {
			 int d = n%10;
			 if(d==0)
			 {
				 d=5;
			 }
			 ans = ans+d*pos;
			 pos*=10;
			 n/=10;
		 }
		 return ans;
	}

}
