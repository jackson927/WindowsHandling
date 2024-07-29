package CoreJavaTopics;

import java.util.HashSet;
import java.util.TreeSet;

public class Set 
{
	public void HashSet()
	{
		//1.HASHSET DOES NOT ALLOW DUPLICATE VALUES
		//2.INSERTION ORDER WILL NOT MAINTAINED
		//3.NULL VALUE WILL ACCEPT
		HashSet subject=new HashSet();
		subject.add("Chemistry");
		subject.add("Maths");
		subject.add("Biology");
		subject.add("Maths");
		subject.add("Social");
		subject.add(null);
		System.out.println("My subject is :"+subject);
	}
	public void TreeSet()
	{
		//1.TREESET DOES NOT ALLOW NULL VALUE
		//2.INSERTION ORDER DOES NOT MAINTAINED
		//3.IT DOES NOT ALLOW DUPLICATE VALUE
		TreeSet set=new TreeSet();
		set.add(45);
		set.add(12);
		set.add(89);
		set.add(45);
		set.add(45);
		System.out.println(set);
	}
	public static void main (String[]args)
	{
		Set it=new Set();
		it.TreeSet();
	}

}
