package CoreJavaTopics;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.TreeMap;

public class Map 
{
	public void HashMap()
	{
		//1.INSERTION ORDER NOT MAINTAINED
		//2.NULL VALUE ACCEPTS
		//3.DUPLICATE VALUE WILL NOT ACCEPT
		
		HashMap country=new HashMap();
		country.put("India","Delhi");
		country.put("Tamil Nadu","Chennai");
		country.put("Kerala","Thiruvananthapuram");
		country.put("Karnataka","Bangalore");
		country.put("Maharastra","Nagpur");
		country.put("Rajasthan",null);
		country.put("India","Delhi");
		System.out.println(country);
		System.out.println(country.keySet());
		System.out.println(country.values());
		System.out.println(country.containsKey("India"));
		System.out.println(country.containsValue("Nagpur"));
		
	}
	public void HashTable()
	{
		//1.Null value does not support
		//2.Insertion order does not maintained.
		//3.Duplicate value does not allow.
		Hashtable <String,Integer> age=new Hashtable<>();
		age.put("Gowtham",24);
		age.put("shyam", 23);
		age.put("kavin", 34);
		age.put("kumar", 28);
		age.put("krish", 24);
		age.put("Gowtham",24);
		System.out.println(age);
	}
	public void treemap()
	{
		//1.Null value will accept
		//2.Insertion order will not maintained
		//3.Duplicate value does not allowed.
		TreeMap list=new TreeMap();
		list.put("social",76);
		list.put("maths",89);
		list.put("tamil",89);
		list.put("english",null);
		list.put("tamil",89);
		System.out.println(list);
	}
	public static void main (String[]args)
	{
		Map it=new Map();
		it.treemap();
	}

}
