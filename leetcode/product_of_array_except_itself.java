
public class product_of_array_except_itself {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {2,3,5,6,8};
		
		product(arr);
	}
	public static void product(int arr[])
	{
		// brute force
		
		/*int mul = 1;
		int n = arr.length;
		int ans[] = new int[n];
		for(int i=0;i<arr.length;i++)
		{
			mul*=arr[i];
		}
		for(int i=0;i<n;i++)
		{
			ans[i] = mul/arr[i];
		}
		
		for(int i=0;i<ans.length;i++)
		{
			System.out.print(ans[i]+" ");
		}*/
		
		// optimal  
		
		int n = arr.length;
		int leftmax[] = new int[n];
		int rightmax[] = new int[n];
		
		leftmax[0] = 1;
		for(int i=1;i<n;i++)
		{
			leftmax[i] = leftmax[i-1]*arr[i-1];
		}
		
		rightmax[n-1] = 1;
		for(int i=n-2;i>=0;i--)
		{
			rightmax[i] = rightmax[i+1]*arr[i+1];
		}
		
		for(int i=0;i<n;i++)
		{
			leftmax[i]=leftmax[i]*rightmax[i];
		}
		
		for(int i=0;i<n;i++)
		{
			System.out.print(leftmax[i]+" ");
		}
	}
	

}
