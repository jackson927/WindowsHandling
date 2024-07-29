package CoreJavaTopics;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

public class basicsofjava 
{
	public static void main(String[]arg)
	{
		LinkedList <Integer> myno=new LinkedList<Integer>();
		myno.add(87);
		myno.add(56);
		myno.addFirst(34);
		myno.addLast(12);
	
		System.out.println(myno);
		myno.removeFirst();
		System.out.println(myno);
		System.out.println(myno.get(2));
		System.out.println(myno.size());
		System.out.println(myno.set(0,65));
		System.out.println(myno);
		System.out.println(myno.set(1,(2+2)));
		System.out.println(myno);
		myno.clear();
		System.out.println(myno);
		
		
	}	
}

