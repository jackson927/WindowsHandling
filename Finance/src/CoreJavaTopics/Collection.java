package CoreJavaTopics;

import java.util.ArrayList;
import java.util.LinkedList;

public class Collection 
{
	public static void main (String[]args)
	{
		                        //LIST
		//1.DUPLICATE VALUES ALLOWED,2.INSERTION ORDER WILL MAINTAINED,3.NULL VALUES WILL ACCEPT.
		                       //LINKEDLIST
		
		LinkedList names=new LinkedList();
		names.add("ravi");
		names.add("sakthi");
		names.addFirst("karthi");
		names.addLast("kumar");
		System.out.println(names);
		names.remove(2);
		System.out.println(names);
		names.add("ravi");
		System.out.println(names);
		names.add(null);
		System.out.println(names);
		
		                    //ARRAYLIST
		
		ArrayList <Integer> numbers=new ArrayList<>();
		numbers.add(34);
		numbers.add(23);
		numbers.add(12);
		numbers.addFirst(56);
		numbers.addLast(99);
		numbers.add(12);
		numbers.add(null);
		System.out.println(numbers);
		numbers.remove(2);
		System.out.println(numbers);
		
		ArrayList number=new ArrayList();
		number.add(123);
		number.add(87);
		System.out.println(number);
		System.out.println(number.addAll(numbers));
		System.out.println(number);	
	}

}