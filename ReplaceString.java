package PracticeQ3;

public class ReplaceString {

	public static void main(String[] args) {
		String str = new String("University is Good!");
	      System.out.println( "Initial String : "+ str);
	      // replacing "Good" with "Bad"
	      str = str.replaceAll( "Good" , "Bad" );
	      System.out.println( "The String after substitution : "+str );
	}

}
