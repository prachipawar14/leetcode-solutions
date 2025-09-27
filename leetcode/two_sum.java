
public class two_sum {
	
	public static void main(String[]args)
	{
		int arr[] = {2,4,5,6,7};
		int target = 9;
		
		findindex(arr,target);
	}
	public static void findindex(int arr[] , int target)
	{
		int ans [] = new int[2];
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr.length;j++)
			{
				if(arr[i]+arr[j]==target)
				{
					ans[0] = i;
					ans[1] = j;
				}
			}
		}
		
		for(int i=0;i<ans.length;i++)
		{
			System.out.print(ans[i]+" ");
		}
	}
}
