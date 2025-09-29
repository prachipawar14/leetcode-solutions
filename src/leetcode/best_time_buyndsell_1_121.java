package leetcode;


public class best_time_buyndsell_1_121 {

	public static void main(String[] args) {
		
		int arr[] = {7,1,5,3,6,4};
		System.out.print(profit(arr));
	}
	public static int profit(int arr[])
	{
		int i =0;
		int j=i+1;
		int ans =0;
		
		while(i<arr.length && j<arr.length) {
			if(arr[i] > arr[j]) {
				i++;
			}
			else {
				int diff = arr[j]-arr[i];
				ans = Math.max(ans, diff);
				j++;
			}
		}
		return ans;
	}

}
