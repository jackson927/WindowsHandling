package CoreJavaTopics;


import java.util.ArrayList;

public class arraylists 
{
	public static void main (String[]args)
	{
		ArrayList<String> al=new ArrayList <String>(); 
		al.add("G");
		al.add("O");
		al.add("W");
		al.add("T");
		al.add("H");
		al.add("A");
		al.add("M");
		ArrayList <String> all=new ArrayList <String>();
		all.add("C");
		all.add("A");
		all.add("T");
//		all.addAll(al);
		System.out.println(all.addAll(al));
		System.out.println(all);
	}
}
