package programs;

import java.util.ArrayList;
import java.util.List;

public class Amountsort {
	public static void main(String[] args) {
		
		
		List<String> list=new ArrayList<>();
		
		list.add("$345");
		list.add("$4");
		list.add("$55");
		list.add("$234");
		int ar[]=new int[list.size()];
		int i=0;
		for(String s:list)
		{
			int a=Integer.parseInt(s.replace("$", ""));
			ar[i++]=a;
			
		}
		
		for(i=0;i<ar.length;i++)
		{
			for(int j=i+1;j<ar.length;j++)
			{
				if(ar[i]>ar[j])
				{
					int t=ar[i];
					ar[i]=ar[j];
					ar[j]=t;
				}
			}
		}
		for(i=0;i<ar.length;i++)
		{
			System.out.println(ar[i]);
		}
	}

}
