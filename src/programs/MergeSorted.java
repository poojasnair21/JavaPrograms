package programs;

public class MergeSorted {
	public static void main(String args[])
	{
		//sort two arrays and merge
		int a1[]= {2,1,4};
		int a2[]= {90,1,23,3};
		int i;
		int m[]=new int[a1.length+a2.length];int k=0;
		//sort1
		for(i=0;i<a1.length;i++)
		{
			for(int j=i+1;j<a1.length;j++) {
				if(a1[i]>a1[j])
				{
				int t=a1[i];
				a1[i]=a1[j];
				a1[j]=t;
			}}System.out.println(a1[i]);
			
			}
		
		//sort2
		for(i=0;i<a2.length;i++)
		{
			for(int j = i+1;j<a2.length;j++) {
				if(a2[i]>a2[j])
				{
				int t=a2[i];
				a2[i]=a2[j];
				a2[j]=t;
			}}System.out.println(a2[i]);
			
			}
		//merge
		
			for(i=0;i<a1.length;i++)
			{
				m[k++]=a1[i];
			}
			for(int j=0;j<a1.length;i++)
			{
				m[k++]=a1[j];
			}
		System.out.println(m[k]);
		}
		
		}


