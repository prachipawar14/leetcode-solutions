package contest_2883;

import java.util.*;
public class pair_of_roses {
    public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0)
		{
			int N = sc.nextInt();
			int price[] = new int[N];
			for(int i=0;i<N;i++)
			{
				price[i] = sc.nextInt();
			}
			int M = sc.nextInt();

			buy(price,M);
		}
    }
	public static void buy(int price[] , int m)
	{
		Arrays.sort(price);
		int l = 0;
		int r = price.length-1;
		int diff = Integer.MAX_VALUE;
		int ans1 = 0;
		int ans2 = 0;

		while(l < r)
		{
			int sum = price[l]+price[r];
			if(sum==m)
			{
				int cdiff = price[r]-price[l];
				if(cdiff < diff)
				{
					diff = cdiff;
					ans1 = price[l];
					ans2 = price[r];
				}
				l++;
				r--;
			}
			else if(sum< m){
				l++;
			}
			else{
				r--;
			}
		}

		System.out.println("Deepak should buy roses whose prices are "+ans1+" and "+ans2+".");

	}
}
