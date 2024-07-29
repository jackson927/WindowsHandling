package CoreJavaTopics;

import net.bytebuddy.dynamic.scaffold.MethodRegistry.Handler.ForAbstractMethod;

public class StringClass 
{
	public static void main (String[]args)
	{
		String name=new String("Praveen");
		name=name.concat(" Kumar");
		System.out.println(name);		
		System.out.println(name.charAt(4));
		System.out.println(name.startsWith("Pra"));
		String names=new String("praveen");
		System.out.println(name.equalsIgnoreCase(names));
		names=names.concat(" kumar");
		System.out.println(names);
		System.out.println(names.length());
		System.out.println(names.contains("veen"));
		System.out.println(names.substring(2));
		System.out.println(names.substring(3, 8));
		String content="      Selenium   framework     ";
		System.out.println(content.trim());
		String hello="I,Am,learning,java,basics,in,eclipse";
		String[]hell=hello.split(",",3);
		for (String go : hell) 
		{
			System.out.println(go);
		}	
		System.out.println(hello.replace("learning","studing"));
	}
}
