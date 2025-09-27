
public class find_pivot_index_724 {

	public static void main(String[] args) {
		
		int arr[] = {1,7,3,6,5,6};
		pivot(arr);
	}
	public static void pivot(int arr[])
	{
		int totalsum = 0;
		int left = 0;
		int right = 0;
		
		for(int num : arr)
		{
			totalsum+=num;
		}
		
		for(int i=0;i<arr.length;i++)
		{
			right = (totalsum-left-arr[i]);
			
			if(right == left)
			{
				System.out.print(i);
			}
			left+=arr[i];
		}
	}

}
