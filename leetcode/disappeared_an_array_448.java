import java.util.*;
public class disappeared_an_array_448 {

	public static void main(String[] args) {
		int nums[] = {4,3,2,7,8,2,3,1};
		System.out.print(findDisappearedNumbers(nums));

	}
	public static List<Integer> findDisappearedNumbers(int[] arr) {
        
	       List<Integer> l = new ArrayList<>();
	       int n = arr.length;
	       boolean ans[] = new boolean[n+1];

	       for(int num : arr)
	       {
	            ans[num] = true;
	       }

	       for(int i=1;i<=n;i++){
	        if(!ans[i]){
	            l.add(i);
	        }
	       }
	       return l;
	    }

}
