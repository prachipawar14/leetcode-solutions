import java.util.*;
public class lexicographical_numbers_386 {

	public static void main(String[] args) {
		int n=13;
		List<Integer> l = new ArrayList<>();
	       for(int i=1;i<=9;i++){
	         count(i,n,l);
	       }
	       
	       System.out.print(l);
		
	}
	public static void count(int curr , int n , List<Integer>l)
    {
       if(curr > n) return;
        l.add(curr);
        for(int i=0;i<=9;i++)
        {
            int next = curr*10+i;
            if(next>n) return;
            count(next,n,l);
        }

        
    }

}
