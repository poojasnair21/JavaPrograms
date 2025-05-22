package programs;

public class LArgeSmallArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {21,3,45,22,54,34};
		int larger=a[0];
		int smaller=a[0];
		int x=a.length;
		System.out.println(x);
		for(int i=0;i<x;i++)
		{
			if(a[i]>larger)
			{
				larger=a[i];
			}
			else if(a[i]<smaller)
			{
				smaller=a[i];
			}
		}
		System.out.println(larger+" "+smaller);

	}

}
