
public class valid_parenthesis_20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "()";
		System.out.print(isValid(s));

	}
	public static boolean isValid(String s) {
        if(s.length()%2!=0){
            return false;
        }

        while(s.contains("()") || s.contains("{}") || s.contains("[]"))
        {
            s= s.replace("()" , "").replace("{}","").replace("[]","");
        }

        return s.isEmpty();
    }

}
