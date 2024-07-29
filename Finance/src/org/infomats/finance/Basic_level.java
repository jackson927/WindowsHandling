package org.infomats.finance;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Basic_level 
{
	public static void Google()
	{
		WebDriver wd=new ChromeDriver();
		wd.get("https://www.google.co.in/");
		wd.manage().window().maximize();
		wd.findElement(By.id("APjFqb")).sendKeys("Infomats"+Keys.ENTER);
		wd.quit();
	}
	public static void GetPageSource()
	{
		WebDriver wd1=new ChromeDriver();
		wd1.get("https://www.google.co.in/");
		wd1.findElement(By.name("q"));
		
	}
	public static void main (String[]args)
	{
			GetPageSource();	
	}
}
