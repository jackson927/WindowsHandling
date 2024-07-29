package org.infomats.finance;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Relative 
{
	public static void ParentClass()
	{
	  WebDriver wd=new ChromeDriver();
	  wd.get("https://www.google.co.in/");
	  wd.findElement(By.xpath("//*[@jsname='vdLsw']//parent::div")).click();
	}
	public static void ChildClass()
	{
		WebDriver wd1=new ChromeDriver();
		wd1.get("https://www.google.co.in/");
		wd1.findElement(By.xpath("//*[@jscontroller='vZr2rb']//child::textarea")).click();		
	}	
	public static void Ancestor()
	{
		WebDriver wd2=new ChromeDriver();
		wd2.get("https://www.google.co.in/");
		wd2.findElement(By.xpath("//div[@jsname='vdLsw']//ancestor::div[2]")).click();		
	}
	public static void following()
	{
		WebDriver wd3=new ChromeDriver();
		wd3.get("https://www.google.co.in/");
		wd3.findElement(By.xpath("(//*[@class='gb_Kd gb_K gb_4f gb_Uf']/following::div)[3]")).click();
	}
	public static void preceding()
	{
		WebDriver wd4=new ChromeDriver();
		wd4.get("https://www.facebook.com/");
		wd4.findElement(By.xpath("//div[@style='display:none']//preceding::div")).click();
	}	
	public static void main(String[]args)
	{
		preceding();
	}
}
