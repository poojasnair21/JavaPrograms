package programs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class CollectioLIist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//practising collections
		
		List <Integer> a=new ArrayList();
		a.add(10);a.add(110);a.add(50);a.add(80);
		
//		for(int i:a)
//		{
//			System.out.println("added"+i);
//		}
//		System.out.println("removed:"+a.remove(3));
//		
//		
//		System.out.println("get:"+a.get(2));
//		System.out.println("size:"+a.size());
//		
//	}
		LinkedList<String> l=new LinkedList();
		
		l.add("dog");
		l.add("dog");
		l.add("dog");
		l.add(1,"rr");
		for(String i:l)
			{
				System.out.println("added"+i);
			}

}}
