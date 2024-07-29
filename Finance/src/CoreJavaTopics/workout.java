package CoreJavaTopics;

import java.lang.reflect.Array;
import java.util.Arrays;

public class workout {
	public void sample()
	{
		int marks []= {67,98,23,45,76};
		System.out.println("My 10th marks are :"+Arrays.toString(marks));
		for (int mark:marks)
		{
			System.out.println(mark);
		}
		for (int i=0;i<marks.length;i++)
		{
			System.out.println(marks[i]);
		}
	}
	public static boolean stringcontainsvowels(String input)
	{
		return input.toLowerCase().matches("aeiou") ;
		
	}
	
	public static void main (String[]args)
	{
		System.out.println(stringcontainsvowels("hello"));
		System.out.println(stringcontainsvowels("tv"));
		stringcontainsvowels("aeiou");
	
	}
	
}

