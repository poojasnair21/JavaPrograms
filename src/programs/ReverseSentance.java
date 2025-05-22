package programs;

public class ReverseSentance {
	public static void main(String args[]) {

String s="hello pooja";
String str[] =s.split(" ");
String rev="";
for(String a:str)
{ rev="";
	for(int i=0;i<a.length();i++)
	{
		
	rev=a.charAt(i)+rev;
	
	}System.out.print(rev+" ");
	
}
	}

}
