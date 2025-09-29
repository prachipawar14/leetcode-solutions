package contest_2883;

import java.util.*;
public class playing_with_bits {
    public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int Q = sc.nextInt();
		while(Q-->0){
			int a = sc.nextInt();
			int b = sc.nextInt();
			count(a,b);
		}
    }
	public static void count(int a , int b )
	{
		int result=0;
		for(int i=a;i<=b;i++)
		{
			int mul=1;
			int sum=0;
			int num=i;
			while(num>0)
			{
				int rem = num%2;
				if(rem==1){
					result+=rem;
				}
				sum = sum+rem*mul;
				mul = mul*10;
				num=num/2;
			}
		}
		System.out.println(result);
	}
}
