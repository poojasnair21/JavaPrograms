package programs;

class HighAndSecondHigh {

	
	public static void main(String[] args) {
	
	int a[]= {20,1,2,4,55,33,2};
	
	int l=a[0];
	for(int i=0;i<a.length;i++)
	{
		if(l<a[i])
		{
			l=a[i];
		}
	}
	
	int l1=a[0];
	for(int i=0;i<a.length;i++)
	{if(a[i]>l1&&a[i]!=l)
		{
			l1=a[i];
		}
	}
	
	System.out.println("max="+l1);
	
	
	
	
	
	}
	
}