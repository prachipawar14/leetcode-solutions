import java.util.*;
public class LCM {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		lcm(a,b);
	}
	public static void lcm(int a , int b)
	{
		int max = Math.max(a, b);
		int ans = 0;
		for(int i=1;i<=max;i++)
		{
			if(a%i == 0 && b%i ==0)
			{
				ans = i;
			}
		}
		
		System.out.print((a*b)/ans);
	}

}
