package programs;

class Abc extends Thread{
	public void run() {
try
{
	System.out.println(" running Thread"+Thread.currentThread().getId());
}
catch(Exception e)
{
	
}}}
public class MultiThread
{
	public static void main(String args[])
	{
		for(int i=0;i<5;i++) {
			
		Abc a=new Abc();
		a.start();
		
	}
}
}
