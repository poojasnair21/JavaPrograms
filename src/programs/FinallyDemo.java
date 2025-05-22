package programs;

public class FinallyDemo {
	public static void main(String srgs[])
	{
		
		//demo of finally block in exception
		try {
			int a;int b;int c;a=4;b=0;
			c=a/b;
			System.out.println(c);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		finally
		{
			System.out.println("from block finally");
		}
	}

}
