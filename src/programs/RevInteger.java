package programs;

public class RevInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=987;
		while(a>0)
		{
			int x=a%10;
			System.out.print(x);
			a=a/10;
			
		}
	}

}
