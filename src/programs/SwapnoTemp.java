package programs;

public class SwapnoTemp {
	public static void main(String[] args) {
		int x=10;
		int y=12;
		
		System.out.println(x+" "+y);
		
		x=x+y;
		y=x-y;
		x=x-y;
		System.out.println(x+" "+y);
		
		String a="Hellow";
		String b="world";
		
		a=a+b;
		b=a.substring(0,a.length()-b.length());
		a=a.substring(b.length());
		System.out.println(a+" "+b);
		
		
	}

}
