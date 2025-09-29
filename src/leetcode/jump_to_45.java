package leetcode;


public class jump_to_45 {

	public static void main(String[] args) {
		int arr[] = {2,3,1,1,4};
		System.out.print(jump(arr));
	}
	public static int jump(int arr[])
	{
		int jump =0;
		int end=0;
		int reach=0;
		
		if(arr.length<=1) {
			return 0;
		}
		for(int i=0;i<arr.length-1;i++) {
			reach = Math.max(reach, i+arr[i]);
			
			if(i==end) {
				jump++;
				end=reach;
				
				if(end>arr.length-1) {
					return jump;
				}
			}
			
		}
		return jump;
	}

}
