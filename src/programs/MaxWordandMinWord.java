package programs;

public class MaxWordandMinWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="my name is pooja from kottayam";
		String[]str=s.split(" ");
		int max=str[0].length();
		int min=str[0].length();
		String maxword=str[0];
		String minword=str[0];
		
		
		for(String s2:str)
		{
			int n=s2.length();
			
			if(n<min)
			{
				min=n;
				minword=s2;
			}
			if(n>max)
			{
				max=n;
				maxword=s2;
			}
			
			
			
		}
		System.out.println("minword="+minword+" length="+min+" maxword="+maxword+" max="+max);

	}

}
