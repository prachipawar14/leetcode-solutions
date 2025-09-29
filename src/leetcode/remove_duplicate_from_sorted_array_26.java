package leetcode;
public class remove_duplicate_from_sorted_array_26 {

	public static void main(String[] args) {
		
		int arr[] = {1,1,2};
		System.out.print(remove(arr));
	}
	public static int remove(int nums[])
	{
		int j=0;
	      for(int i=1;i<nums.length;i++)
	      {
	        if(nums[i] !=nums[j])
	        {
	            j++;
	            nums[j] = nums[i];
	        }
	      }
	      return j+1;
	}

}
