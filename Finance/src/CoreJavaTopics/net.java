package CoreJavaTopics;

import java.util.HashSet;
import java.util.Iterator;

public class net 
{
	public void exit()
	{
		HashSet  js=new HashSet();
		js.add(null);
		js.add("A");
		js.add("B");
		js.add("C");
		js.add("D");
		js.add("D");
		System.out.println(js);
		HashSet  hs=new HashSet();
		hs.add(90);
		hs.add(01);
		hs.add(34);
		hs.add(13);
		hs.addAll(js);
		System.out.println(hs);
		Iterator<String> tor=js.iterator();
		while(tor.hasNext())
		{
			System.out.println("Alphabet letters is :"+tor.next());
		}
	}
	public static void main (String[]args)
	{
		net bot=new net();
		bot.exit();
	}
}
