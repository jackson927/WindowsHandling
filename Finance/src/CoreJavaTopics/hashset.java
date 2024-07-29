package CoreJavaTopics;

import java.util.HashSet;
import java.util.Iterator;

public class hashset {

	public void set()
	{
		HashSet <Integer> ll=new HashSet<Integer>();
		ll.add(3);
		ll.add(8);
		ll.add(19);
		ll.add(3);
		ll.add(null);
		System.out.println("My insertion order is :"+ll);
	}
	public void iterative()
	{
		HashSet <Integer> jd=new HashSet <Integer>();
		jd.add(9);
		jd.add(8);
		jd.add(2);
		jd.add(5);
		jd.add(9);
		Iterator <Integer> it=jd.iterator();
		while (it.hasNext())
		{
			System.out.println("My number is :"+it.next());
		}
	}
	public static void main (String[]args)
	{
		hashset jd=new hashset();
		jd.set();
		jd.iterative();
	}
}
