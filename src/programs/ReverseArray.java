package programs;

public class ReverseArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {1,2,1,2,3,4,45};
		int left=0;
		int right=a.length-1;
		int n;
		while(left<right)
		{
			n=a[left];
			a[left]=a[right];
			a[right]=n;
			left++;
			right--;
		}
		for(int i=0;i<a.length;i++)
		
		System.out.println(a[i]);

	}

}
