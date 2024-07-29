package org.infomats.finance;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert 
{
	public static void SimpleAlert()
	{
		WebDriver web=new ChromeDriver();
		web.get("https://www.leafground.com/alert.xhtml");
		web.findElement(By.name("j_idt88:j_idt91")).click();
		org.openqa.selenium.Alert a=web.switchTo().alert();
		a.accept();
		String ss=web.findElement(By.id("simple_result")).getText();
		if(ss.contains("You have successfully clicked an alert"))
		{
			System.out.println("User handled simple alert");
		}
		else
		{
			System.out.println("User doesn't handled simple alert");
		}		
	}
	public static void ConfirmationAlert()
	{
		WebDriver web1=new ChromeDriver();
		web1.get("https://www.leafground.com/alert.xhtml");
		web1.findElement(By.id("j_idt88:j_idt93")).click();
		org.openqa.selenium.Alert a1=web1.switchTo().alert();
		a1.dismiss();
		String ss1=web1.getPageSource();
		if(ss1.contains("User Clicked : Cancel"))
		{
			System.out.println("User clicked cancel button");
		}
		else
		{
			System.out.println("User clicked ok (or) cancel button");
		}
	}
	public static void PromptAlert()
	{
		WebDriver web2=new ChromeDriver();
		web2.get("https://www.leafground.com/alert.xhtml");
		web2.findElement(By.id("j_idt88:j_idt104")).click();
		org.openqa.selenium.Alert a2=web2.switchTo().alert();
		a2.sendKeys("I am studying prompt alert topic in selenium");
		a2.accept();
		String ss2=web2.findElement(By.id("confirm_result")).getText();
		if(ss2.contains("I am studying prompt alert topic in selenium"))
		{
			System.out.println("User clicked ok button");
		}	
		else
		{
			System.out.println("User clicked ok [or] cancel button");
		}
	}
	public static void main(String[]args)
	{
		PromptAlert();
	}
}
