package org.infomats.finance;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium 
{
	public void google()
	{
		WebDriver w=new ChromeDriver();
		w.get("https://www.google.co.in/");
		w.manage().window().maximize();
		w.findElement(By.className("gLFyf")).sendKeys("Infomats"+Keys.ENTER);
		w.quit();		
	}
	public static void main (String[]args)
	{
		Selenium sel=new Selenium();
		sel.google();	
	}
}
