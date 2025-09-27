package monubhaiya_2883;
import java.util.*;

public class alexagoestoshopping_1094 {
	
	    public static void main(String args[]) {

			Scanner sc = new Scanner(System.in);
			int n = sc.nextInt();
			int prices[] = new int[n];
			for(int i=0;i<n;i++)
			{
				prices[i] = sc.nextInt();
			}

			int q = sc.nextInt();
			while(q-->0)
			{
				int A = sc.nextInt();
				int K = sc.nextInt();

				if(correct(prices,A,K) == true)
				{
					System.out.println("Yes");
				}
				else{
					System.out.println("No");
				}

				
			}

			
	    }
		public static boolean correct(int prices[] , int A , int K)
		{
			
			int cnt=0;
			for(int i=0;i<prices.length;i++)
			{
				if(A%prices[i] == 0)
				{
					cnt++;
				}
			}
			if(cnt>=K){
				return true;
			}
			else{
				return false;
			}
			
		}
	}

