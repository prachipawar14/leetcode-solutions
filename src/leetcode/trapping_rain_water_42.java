package leetcode;
public class trapping_rain_water_42 {

	public static void main(String[] args) {
		
		int arr[] = {2,3,1,8,2,4,5};
		System.out.print(ans(arr));
	}
	public static int ans(int arr[])
	{
		int sum=0;
		int n = arr.length;
		int leftmax[] = new int[n];
		int rightmax[] = new int[n];
		
		leftmax[0] = arr[0];
		for(int i=1;i<n;i++)
		{
			leftmax[i] = Math.max(leftmax[i-1], arr[i]);
		}
		
		rightmax[n-1] = arr[n-1];
		for(int i=n-2;i>=0;i--)
		{
			rightmax[i] = Math.max(rightmax[i+1], arr[i]);
		}
		
		for(int i=0;i<n;i++)
		{
			int min = Math.min(rightmax[i], leftmax[i]);
			int hgt = min-arr[i];
			sum+=hgt;
		}
		return sum;
	}

}
