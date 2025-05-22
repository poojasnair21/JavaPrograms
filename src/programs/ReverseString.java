package programs;

public class ReverseString {

	public static void main(String[] args) {
		// here used loop is decremenrt they also cask to change to increment for(int i=0;i<s1.length();i++)
		String s1="pooja";
		
		String rev="";
		
		for(int i=s1.length()-1;i>=0;i--)
		{
			char ch=s1.charAt(i);
			rev=rev+ch;
			
		}
		System.out.println(rev);
	}
	

}
