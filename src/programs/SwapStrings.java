package programs;

public class SwapStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="pooja";
		String s2="nair";
		
		s1=s1+s2;
		int s1len=s1.length()-s2.length();
		 s2=s1.substring(0,s1len);
		 s1=s1.substring(s2.length());
		System.out.println(s2);
		System.out.println(s1);

	}

}
