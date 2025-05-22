package programs;

public class ReverseWordsAsIS {

	public static void main(String args[])
	{
		//reverse sentence as is by using string builder
String a="pooja home baby";
String[]str=a.split(" ");
StringBuilder ss=new StringBuilder();
//String b=ss.reverse().toString();
for(String s:str)
{
	
	StringBuilder ss1=new StringBuilder(s);
	ss.append(" "+ss1.reverse().toString());
}
System.out.println(ss+" ");
}}