package programs;

public class CompressString {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		String input="pooja";
		 String compress=methodCompress(input);
		 System.out.println(compress);

	}
public static String methodCompress(String str)
{
	int count=0;
	StringBuilder com=new StringBuilder();
	for(int i=0;i<str.length();i++)
	{
		count=1;
		while(i+1<str.length() && str.charAt(i)==str.charAt(i+1))
		{
			
			count++;i++;
		}
		StringBuilder a=com.append(count).append(str.charAt(i));
		//System.out.println(a);
	}
	
	return com.toString();
}
}
