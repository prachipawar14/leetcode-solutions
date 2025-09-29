package leetcode;
public class running_sum_of_1d_array_1480 {

	public static void main(String[] args) {
		
		int arr[] = {1,2,3,4};
		sum(arr);
	}
	public static void sum(int arr[])
	{
		int n = arr.length;
		int ans[] = new int[n];
		
		ans[0] = arr[0];
		for(int i=1;i<n;i++)
		{
			ans[i] = arr[i]+ans[i-1];
		}
		
		for(int i=0;i<n;i++)
		{
			System.out.print(ans[i]+" ");
		}
	}

}
