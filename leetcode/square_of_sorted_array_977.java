import java.util.*;
public class square_of_sorted_array_977 {

	public static void main(String[] args) {
		
		int arr[] = {-4,-1,0,3,10};
		square(arr);
	}
	public static void square(int nums[])
	{
		 for(int i=0;i<nums.length;i++)
	        {
	            nums[i] = nums[i]*nums[i];
	        }

	        Arrays.sort(nums);
	        
	        for(int i=0;i<nums.length;i++)
	        {
	        	System.out.print(nums[i]+" ");
	        }

	}

}
