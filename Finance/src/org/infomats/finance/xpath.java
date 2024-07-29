package org.infomats.finance;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpath 
{
	              //Absolute Types
	public static void Elementwithknownattribute()
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.co.in/");
		driver.findElement(By.xpath("//*[@class='gLFyf']")).sendKeys("xpath types in selenium"+Keys.ENTER);
	}
	public static void WithKnownElementAndAttribute()
	{
		WebDriver driver1=new ChromeDriver();
		driver1.get("https://www.google.co.in/");
		driver1.findElement(By.xpath("//textarea[@autocomplete='off']")).sendKeys("Programming languages"+Keys.ENTER);
	}
	public static void VisibleText()
	{
		WebDriver driver2=new ChromeDriver();
		driver2.get("https://www.google.co.in/");
		driver2.findElement(By.xpath("//a[text()='Images']")).click();		
	}
	public static void VisibleTextWithPartialMatch()
	{
		WebDriver driver3=new ChromeDriver();
		driver3.get("https://www.google.co.in/");
		driver3.findElement(By.xpath("//a[contains(text(),'age')]")).click();
	}
	public static void MultipleAttribute()
	{
		WebDriver driver4=new ChromeDriver();
		driver4.get("https://www.google.co.in/");
		driver4.findElement(By.xpath("//*[@class='gLFyf'][@aria-controls='Alh6id'][@aria-owns='Alh6id']")).click();
	}
	public static void StartingVisibleText()
	{
		WebDriver driver5=new ChromeDriver();
		driver5.get("https://www.google.co.in/");
		driver5.findElement(By.xpath("//a[starts-with(text(),'Gma')]")).click();
	}
	public static void main (String[]args)
	{
		StartingVisibleText();
	}
}
