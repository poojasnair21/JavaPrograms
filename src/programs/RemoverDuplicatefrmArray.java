package programs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoverDuplicatefrmArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ar[]= {3,3,3,4,4,43,2,5};
		List<Integer> a=new ArrayList<>(Arrays.asList(1,13,12,16,1,2,2,4));
//	     Set<Integer> s=new HashSet<>();
//	     System.out.println(a);
//	    
//	     s.addAll(a); System.out.println(s);
		int j=0;int n=a.size();
		for(int i=0;i<n;i++)
		{
			for(j=i+1;j<n;j++)
			{
				
			if(ar[i]==ar[j])
			{
				ar[i]=-1;
				
			}}
		}
		for(int i=0;i<n;i++)
		{
			if(ar[i]!=-1)
				{
				System.out.println(ar[i]);}
				}
	     


	}

}
