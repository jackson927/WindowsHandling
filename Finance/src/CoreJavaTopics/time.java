package CoreJavaTopics;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class time {

	public static void main (String[]args)
	{
		                // HASHMAP TOPIC
		//put,putall(or)clone,clear,containsKey(),containsValue(),isEmpty(),keySet,values(),get(),entrySet()
		HashMap <Integer,String> mi=new HashMap <Integer,String>();
		mi.put(0,"Gowtham");
		mi.put(1,"Chair");
		mi.put(2,"Box");
		mi.put(null, null);
		System.out.println("My value are :"+mi);
		HashMap<Integer, String> duplicatemap=new HashMap<Integer,String>();
		duplicatemap.put(9,"Jack");
		duplicatemap.put(10,"sit");
		duplicatemap.putAll(mi);
		System.out.println("Duplicate map is "+duplicatemap);
		duplicatemap.clear();
		System.out.println(duplicatemap);
		System.out.println("Key is presented "+mi.containsKey(2));
		System.out.println("value is presented "+mi.containsValue("Chair"));
		System.out.println("Add all :"+mi.clone());
		System.out.println("value is empty or not :"+mi.isEmpty());
		System.out.println("Taking keys only :"+mi.keySet());
		System.out.println("Taking values only :"+mi.values());
		System.out.println("Get the value :"+mi.get(2));
		System.out.println("Get first value :"+mi.entrySet());
		
		                      //LinkedHashMap Topic
		                //1.Insertion order maintain agum
		LinkedHashMap <String,String> ji=new LinkedHashMap <String,String>();
		ji.put("Jil","Jung");
		ji.put("Guru","Jilla");
		ji.put("Hari","Yash");
		ji.put("Fats","Net");
		System.out.println(ji);
		
		                     //TreeMap Topic
		               //1.Insertion order is not maintained in TreeMap.
		               //2.Duplicate value is not accept in TreeMap.
		TreeMap<String , Integer> stumarks=new TreeMap<String, Integer>(); 
		stumarks.put("Moni", 90);
		stumarks.put("Mani", 80);
		stumarks.put("Rani", 70);
		stumarks.put("Vani", 60);
		stumarks.put("vani", 50);
		stumarks.put("Rani", 70);
		System.out.println("Show all the values :"+stumarks);
		
	}
}
