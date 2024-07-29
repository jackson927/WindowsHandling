package CoreJavaTopics;

public class polymorphism {

	public void polymorphisms(char favletter)
	{
		System.out.println("My favourite letter is :"+favletter);
	}
	public void polymorphisms(double my_weight)
	{
		System.out.println("My weight is :"+my_weight);
	}
	public static void main(String[]args)
	{
		polymorphism his=new polymorphism();
		his.polymorphisms(4);
		his.polymorphisms(51.2);
	}
	
}

