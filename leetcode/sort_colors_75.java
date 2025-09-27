
public class sort_colors_75 {

	public static void main(String[] args) {
		
		int arr[] = {2,0,2,1,1,0};
		sort(arr);
	}
	public static void sort(int nums[])
	{
		 for(int i=0;i<nums.length;i++){
	            for(int j=0;j<nums.length;j++){
	                if(nums[i] < nums[j])
	                {
	                    int temp = nums[i];
	                    nums[i] = nums[j];
	                    nums[j] = temp;
	                }
	            }
	        }
		 
		 for(int i=0;i<nums.length;i++) {
			 System.out.print(nums[i]+" ");
		 }
	}

}
