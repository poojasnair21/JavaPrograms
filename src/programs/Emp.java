package programs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

	
	//comparable and comparator practise


public class Emp implements Comparable<Emp> {
	private int salary;
	private String name;

	public Emp(int salary,String name)
	{
		this.salary=salary;
		this.name=name;
	}
	public int getSalary()
	{
		return salary;
	}

	public String getName()
	{
		return name;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Emp> list=new ArrayList<>();
		list.add(new Emp(1000,"pooja"));
		list.add(new Emp(1000,"anu"));
		list.add(new Emp(11000,"priya"));
		list.add(new Emp(8000,"ramu"));
//		Collections.sort(list);
		
		
		list.sort(Comparator.comparingInt((Emp e)->e.salary)
				.thenComparing(e->e.name));
		for(Emp e:list)
		{
		
			System.out.println(e.name+":"+e.salary);
		}
	}

	@Override
	public int compareTo(Emp e1)
	{
		return this.name.compareTo(e1.name);
				//Integer.compare(this.salary, e1.salary);//this.name.compare(
	}

	
}
