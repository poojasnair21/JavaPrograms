package programs;

public class MaxandMinLengthOfstrings {
	public static void main(String args[])
	{
		
		//longest and smallest length in a sentence
		String s1="i am from kottayam";
	String[]words=s1.split(" ");
	String max=words[0];
	String min=words[0];
	for(String word:words)
	{
		if(word.length()>max.length())
		{
			max=word;
		}
		if(word.length()<min.length())
		{
			min=word;
		}
	}
	System.out.println(max);
	System.out.println(min);
}

}
