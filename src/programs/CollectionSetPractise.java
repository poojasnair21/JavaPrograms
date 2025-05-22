package programs;

import java.util.HashSet;
import java.util.*;

public class CollectionSetPractise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Integer> set=new HashSet<>();
		List<Integer> list=new ArrayList<>();
		TreeSet<Integer> treeset=new TreeSet<>();
		list.add(10);list.add(20);list.add(30);
		//insert
		set.add(2);set.add(2);
		//union
		set.addAll(list);
		//intersection
		set.retainAll(list);
		System.out.println(set);
		LinkedHashSet<Integer> linkset=new LinkedHashSet<>();
		linkset.add(null);linkset.add(3);
		linkset.add(null);
		
		System.out.println(linkset);
		treeset.add(null);
		System.out.println(treeset);

	}

}
