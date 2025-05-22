package programs;

import java.util.ArrayList;
import java.util.List;

public class LargestFromanamounts {
	public static void main(String[] args) {
		
	//largest from amounts
		List<String> list=new ArrayList<>();
		
		list.add("$345");
		list.add("$4");
		list.add("$55");
		list.add("$234");
		int max=0;
		String val="";
		for(String s:list)
		{
			int a=Integer.parseInt(s.replace("$", ""));
			if(a>max)
			{
				max=a;
				val=s;
			}
			
		}
		System.out.println(max);
		System.out.println(val);
	}

}
