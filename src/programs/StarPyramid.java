package programs;

public class StarPyramid {
	public static void main(String args[])
	{
//		int i,j;
//		
//
//		for(i=0;i<5;i++) {
//			for(j=0;j<=i;j++)
//			{
//				System.out.print("*");
//			}System.out.println();
//		}
		
		int a[]= {10,80,5,80,23,63};
		int c;
		boolean f;int j=0;int i;
		int t[]=new int[a.length];
		for(i=0;i<a.length;i++)
			{f=false;
			for(int k=0;k<j;k++)
			{
				if(a[i]==t[k])
				{
					f=true;
					break;
				}
				if(!f)
					t[j++]=a[i];
			
			}
		for(i=0;i<j;i++) {
		System.out.println(t[i]);
			}}}

}
