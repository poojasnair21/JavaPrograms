package programs;

public class A1B1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//input A2B2C2 output AABBCC input A1B1C1 output ABC
		String s="A2B2C2";
		StringBuilder ss=new StringBuilder();
		int i=0,j=0;
		
		for(i=0;i<s.length();i+=2)
		{
			char ch=s.charAt(i);
			int num=Character.getNumericValue(s.charAt(i+1));
			if(num==1)
			{
		
			num=num+1;
			for(j=0;j<num;j++)
			{
				ss.append(ch);
			}}
			else
			{
				for(j=0;j<num;j++)
				{
					ss.append(ch);
				}
			}
		}
System.out.println(ss.toString());
	}

}
