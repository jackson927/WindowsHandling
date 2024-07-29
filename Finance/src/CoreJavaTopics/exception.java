package CoreJavaTopics;

import java.util.LinkedList;
import java.util.Scanner;

public class exception {

	public static void arithmeticexception()
	{
		System.out.println(2);
	    System.out.println(12);
		System.out.print(12/0);
		System.out.print(4);
	}
	public static void Nullpointerexception()
	{
		String name=null;
		System.out.print(name.length());
	}
	public static void Inputmismatchexception()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your phone number");
		int num=sc.nextInt();
		System.out.println("My number is :"+num);
	}
	public static void ArrayIndexoutofBoundexception()
	{
		int secretno[]= {67,89,34,78,19};
		System.out.println(secretno[8]);
	}
	public static void StringIndexoutofBoundexception()
	{
		String actor="Vijayakanth";
		char c=actor.charAt(20);
		System.out.print(c);
	}
	public static void IndexoutofBoundexception()
	{
		LinkedList <Integer> out=new LinkedList <Integer>();
		out.add(34);
		out.add(12);
		out.add(56);
		System.out.println(out.get(2));
		System.out.println(out.get(5));
	}
	public static void NumberFormatexception()
	{
		String name="1234";
		System.out.print(name+5);
		int i = Integer.parseInt(name); 
		System.out.println(i+5);
		String combine="1234gow34";
		int j=Integer.parseInt(combine+5);
		System.out.println(j+2);
	}
	public static void main (String[]args)
	{
		NumberFormatexception();
	}
}
