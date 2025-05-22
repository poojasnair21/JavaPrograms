package programs;

public class Duplicateinstringarray {

	public static void main(String[] args) {
		int i;
		String s[]= {"apple","cherry","car","apple","car"};
		int c;
		for(i=0;i<s.length;i++)
		{c=1;
			for(int j=i+1;j<s.length;j++)
			{
				if(s[i].equals(s[j]))
				{
					c++;
					s[j]="";
				}
				
			}if(c>1)
			{
				System.out.println(s[i]);
			}
		}
	}

}
