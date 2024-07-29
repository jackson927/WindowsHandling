package CoreJavaTopics;

import java.util.LinkedList;

public class car {

	public static void car()
	{
		LinkedList <Integer> ll=new LinkedList <Integer>();
		ll.add(98);
		ll.add(89);
		ll.add(null);
		System.out.println(ll);
		ll.addFirst(78);
		ll.addLast(56);
		System.out.println(ll);
		ll.get(0);
		System.out.println("My position is :"+ll.getFirst());
		System.out.println("Last position is :"+ll.getLast());
		ll.remove(1);
		System.out.println(ll);
		System.out.println("first value is :"+ll.get(2));
		ll.add(56);
		System.out.println(ll);
		LinkedList <Integer> it=new LinkedList <Integer>();
		it.add(99);
		it.add(null);
		it.add(24);
		System.out.println(it);
		it.addAll(ll);
		System.out.println("Add all your values :"+it.addAll(ll));
		System.out.println(it);
    
	}
	public static void main (String[]args)
	{
		car();
	}
}
