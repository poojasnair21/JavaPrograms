package programs;


	public class SwapCharacters {
		public static String swap(String x)
		{
			char[] ch=x.toCharArray();
			int n=ch.length;
			for(int i=0;i<n-1;i+=2)
			{
				char t=ch[i];
				ch[i]=ch[i+1];
				ch[i+1]=t;
			}
			return new String(ch);
		}
	    public static void main(String[] args) {
	        String input = "Automation tester";
	        String[] ss=input.split(" ");
	        StringBuilder sb=new StringBuilder();
	        for(String s:ss)
	        {
	        	sb.append(swap(s)+" ");
	        }
	        System.out.println(sb);
	        
	}

}