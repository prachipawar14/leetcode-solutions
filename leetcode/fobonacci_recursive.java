import java.util.*;
public class fobonacci_recursive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		System.out.print(fibo(n));
	}
	public static int fibo(int n)
	{
		if(n==0) return 0;
		if(n==1) return 1;
		int n1 = fibo(n-1);
		int n2 = fibo(n-2);
		return n1+n2;
	}

}
