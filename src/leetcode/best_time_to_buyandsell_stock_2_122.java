package leetcode;
public class best_time_to_buyandsell_stock_2_122 {

	public static void main(String[] args) {
		
		int arr[] = {7,1,5,3,6,4};
		
		profit(arr);
	}
	public static void profit(int arr[])
	{
		int i = 0;
		int j = 1;
		int buy = Integer.MAX_VALUE;
		int sell = Integer.MIN_VALUE;
		int sum = 0;
		
		while(i<arr.length && j<arr.length) {
			int profit = 0;
			buy = arr[i];
			sell = arr[j];
			
			if((sell-buy) > profit)
			{
				profit = sell-buy;
				sum+=profit;
			}
			
			i++;
			j++;
		}
		System.out.print(sum);
	}

}
