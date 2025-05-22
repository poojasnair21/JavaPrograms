package programs;


	import java.util.ArrayList;
	import java.util.Arrays;
	import java.util.HashMap;
	import java.util.List;
	import java.util.Map;
	public class NoOccCharHashMap {

		
		public static void main(String[] args) {
		//int a[]= {22,3,3,1,4,5,9,4};
			String a="pooja";
		//Arrays.sort(a);
			
			//number of occurance of a character in a string using hashmap
		Map<Character,Integer>map=new HashMap<>();
		for(char ch:a.toCharArray())
		{
			if(map.containsKey(ch))
					{
				map.put(ch,map.get(ch)+1);
					}
			else
				
			{
				map.put(ch, 1);
			}
			
		}
		System.out.println(map);
	for(Map.Entry<Character,Integer>entry:map.entrySet())
	{
		if(entry.getValue()>1)
		{
			System.out.println(entry.getKey()+" "+entry.getValue());
		}
	}
			
		}
		
	}

