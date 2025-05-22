package programs;

import java.util.ArrayList;
import java.util.List;

public class SeconLaginaStringhas$ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="poo$43543658951$ja";
		//set
//		TreeSet<Integer> set=new TreeSet<>();
//		for(char ch:s.toCharArray())
//		{
//			if(Character.isDigit(ch))
//			{
//				set.add(Character.getNumericValue(ch));
//			}
//		}
		
		List<Integer> list=new ArrayList<>();
		
		for(char ch:s.toCharArray())
		{
			if(Character.isDigit(ch))
			{
				list.add(Character.getNumericValue(ch));
			}
		}
		System.out.println(list);
		
		int a[]=new int[list.size()];
		int i=0;
		for(int num:list)
		{
			a[i++]=num;
		}
		
		int max=a[0];
		int max1=a[0];
		for(i=0;i<a.length;i++)
		{
			if(a[i]>max)
			{
				max=a[i];
			}
		}
		System.out.println("max="+max);
		for(i=0;i<a.length;i++)
		{
			if(a[i]>max1 && a[i]!=max)
			{
				max1=a[i];
			}
		}
		System.out.println("second max="+max1);

		
	
		//set.pollLast();
		
		
	}

}
