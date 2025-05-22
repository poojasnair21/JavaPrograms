package programs;

public class Programs {
	public static void main(String args[])
	{
//		String s="malayalam";
//		String r="";
//		char c;
//		for(int i=0;i<s.length();i++)
//		{
//			c=s.charAt(i);
//			r=c+r;
//			
//		}
//		System.out.println(r);
//		if(r.equals(s))
//			System.out.println("Palindrome");
//		else
//			System.out.println("not Palindrome");
		
//		int a,b,c;
//		a=110;b=20;
//		System.out.println("before swapping a="+a+" b"+b);
//		a=a+b;
//		b=a-b;
//		a=a-b;
//			
//			System.out.println("after swapping a="+a+" b"+b);
//		
//		String s="aeiou";
//		String vowels="aeiouAEIOU";
//		for(char c:s.toCharArray())
//		{
//			if(vowels.indexOf(c)!=-1)
//			{
//				System.out.println(c);
//			}
//		}
	
	for(int i=0;i<20;i++)
	{
		if(isprime(i))
		{
			System.out.println(i);
		}
	}
	}
	public static boolean isprime(int n) {	
		
		int i,f=0;

		if(n<=1)return false;
		if(n==2)return true;
		if(n%2==0)return false;
		for(i=3;i*i<=n;i+=2)
		{
			if(n%i==0) {
				f=1;}
			break;}
if(f==1)
	return false;
else
	return true;


		}}
	
