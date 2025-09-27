import java.util.*;
public class next_permutation_31 {

	public static void main(String[] args) {
		int arr[] = {3,1,2};
		print(arr);
		
	}
	public static void print(int arr[])
	{
		int n = arr.length;
		int idx = -1;
		for(int i=n-2;i>=0;i--)
		{
			if(arr[i] < arr[i+1])
			{
				idx = i;
				break;
			}
		}
		if(idx == -1)
		{
			reverse(arr,0,n-1);
			for(int i=0;i<arr.length;i++)
			{
				System.out.print(arr[i]+" ");
			}
			return;
		}
		for(int i=n-1;i>idx;i--)
		{
			if(arr[i] > arr[idx]) {
				swap(arr,i,idx);
				break;
			}
			
		}
		
		reverse(arr,idx+1,n-1);
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		
	}
	public static int[] reverse(int arr[] , int i , int j)
	{
		while(i<j)
		{
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			
			i++;
			j--;
		}
		return arr;
	}
	public static int[] swap(int arr[] , int i, int j)
	{
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
		
		return arr;
	}

}
