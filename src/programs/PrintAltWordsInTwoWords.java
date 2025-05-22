package programs;

public class PrintAltWordsInTwoWords {

	public static void main(String[] args) {
		// print alternative words in two strings output pnoaoijra
		String input="pooja nair";
		
		int count=input.length();
		String ss[]=input.split(" ");
		String w1=ss[0];
		int w1l=w1.length();
		String w2=ss[1];
		int w2l=w2.length();
		StringBuilder sb=new StringBuilder();
		for(int i=0;i<count-1;i++)
		{
			if(i<w1l)
			{
				sb.append(w1.charAt(i));
			}
			if(i<w2l)
			{
				sb.append(w2.charAt(i));
			}
		}
		
		System.out.println(sb);

	}

}
