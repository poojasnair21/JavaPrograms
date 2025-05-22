package programs;
class Addition
{

	public void add(int a)
	{
		System.out.println("addition 1 integer="+a);
	}
	public void add(int a,int b)
	{
		System.out.println("addition 2 integers="+(a+b));
	}
	public void add(int a,int b,float c)
	{
		System.out.println("addition 3 integers="+(a+b+c)
				);
	}
}
public class MethodOverLoading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Addition ad1=new Addition();ad1.add(10);ad1.add(10,20);ad1.add(10,20,30);
	
		
	}

}
