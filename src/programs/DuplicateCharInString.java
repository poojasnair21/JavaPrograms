package programs;

public class DuplicateCharInString {
	public static void main(String args[])
	{
		String s="pooja nair";
		
		
		char c[]=s.toCharArray();
		
		int i,j;
		for(i=0;i<c.length;i++)
		{
			for(j=i+1;j<c.length;j++)
			{
				if(c[i]==c[j])
				{
					System.out.println(c[j]);
					break;
				}
			}
		}
	}

}
