package programs;

public class ReverseMaxMin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="pooja s nair kottayam";
		String[]str=s.split(" ");
		int maxl=str[0].length();
		int minl=str[0].length();
		String max=str[0];
		String min=str[0];
		
		StringBuilder sb;
		StringBuilder sb1=new StringBuilder();
		for(String i:str)
		{
			int n=i.length();
			if(n<minl)
			{
				minl=n;
				min=i;
			}
			
			if(n>maxl)
			{
				maxl=n;
				max=i;
			}
			
				
			
				
		}
		for(String i:str)
		{
		if(i==max || i==min)
		{
			sb1.append(new StringBuilder(i).reverse().toString()+" ");
		}
		else
		{
			sb1.append(i+" ");
		}}
		System.out.println(sb1);
	}

	}


