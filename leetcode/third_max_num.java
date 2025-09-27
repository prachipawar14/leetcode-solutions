
public class third_max_num {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {3,2,1};
		System.out.print(maxnum(arr));

	}
	public static int maxnum(int nums[])
	{
	      Integer first = null;
	        Integer second = null;
	        Integer third = null;

	        for(int a : nums)
	        {
	            if ((first != null && a == first) || 
	                (second != null && a == second) || 
	                (third != null && a == third)) {
	                        continue;
	            }


	            if( first==null || first < a )
	            {
	                third = second;
	                second = first;
	                first = a;
	            }
	            else if( second==null ||  second < a )
	            {
	                third = second;
	                second = a;
	            }
	            else if( third==null || third < a ){
	                third = a;
	            }
	        }

	        return (third==null ? first : third);
	}
}
