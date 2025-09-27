import java.util.*;
public class three_sum_15 {

	public static void main(String[] args) {
		
		int arr[] = {-1,0,1,2,-1,-4};
		sum(arr);

	}
	public static void sum(int arr[])
	{
		int n = arr.length;
		int sum = 0;
		List<List<Integer>> l = new ArrayList<>();
		Arrays.sort(arr);
		
		for(int i=0;i<n-2;i++)
		{
			if(i>0 && arr[i]==arr[i-1])
			{
				continue;
			}
			int left = i+1;
			int right = n-1;
			
			while(left < right) {
				
				sum = arr[i] + arr[left] + arr[right];
				
				if(sum==0)
				{
					l.add(Arrays.asList(arr[i] , arr[left] , arr[right]));
				
				
					while(left < right && arr[left]==arr[left+1])
					{
						left++;
					}
				
					while(left < right && arr[right]==arr[right-1])
					{
						right--;
					}
				
					left++;
					right--;
				}
				else if(sum<0)
				{
					left++;
				}
				else {
					right--;
				}
			}
		}
		
		System.out.print(l);
		
	}

}
