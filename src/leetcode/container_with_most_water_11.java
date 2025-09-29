package leetcode;


public class container_with_most_water_11 {

	public static void main(String[] args) {
		int arr[] = {1,8,6,2,5,4,8,3,7};
		System.out.print(max(arr));

	}
	public static int max(int arr[])
	{
		int left = 0;
		int right = arr.length-1;
		int maxarea=0;
		
		while(left < right)
		{
			int width = right-left;
			int hgt = Math.min(arr[left], arr[right]);
			
			int area = width*hgt;
			maxarea = Math.max(area , maxarea);
			
			if(arr[left] < arr[right]) {
				left++;
			}
			else {
				right--;
			}
		}
		return maxarea;
	}

}
