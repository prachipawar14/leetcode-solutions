
public class set_matrix_0_73 {

	public static void main(String[] args) {
		
		int arr[][] = {{1,1,1},{1,0,1},{1,1,1}};
		
		set(arr);
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
	public static int[][] set(int arr[][])
	{
		int m = arr.length;
		int n = arr[0].length;
		boolean[] row = new boolean[m];
        boolean[] col = new boolean[n];
        
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				if(arr[i][j] == 0) {
					row[i] = true;
					col[j] = true;
				}
			}
		}
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				if(row[i] || col[j]) {
					arr[i][j]=0;
				}
			}
		}
		return arr;
	}
	

}
