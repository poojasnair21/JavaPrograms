package programs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TwoIntArrayDupliSeparation {
	public static void main(String args[])
	{
	int a[]= {2,3,1,1,4,2,};
	int s[]= {9,9,8,9,6,4};
	Set<Integer>a1=new HashSet<Integer>();
	Set<Integer>a2=new HashSet<Integer>();
	List<Integer>l1=new ArrayList<>();
	for(int i:a)
	{
		l1.add(i);
	}
	for(int i:s)
	{
		l1.add(i);
	}
	for(int i:s)
	{
		a2.add(i);
	}

//	
	Set<Integer>d=new HashSet<Integer>(a1);
//	d.retainAll(a2);
//	Set<Integer>u=new HashSet<Integer>(a1);
//	u.removeAll(a2);
//	System.out.println(d);System.out.println(u);
//	a1.addAll(a2);
	System.out.println(l1);
	d.retainAll(l1);
	System.out.println(d);
	}
	}


