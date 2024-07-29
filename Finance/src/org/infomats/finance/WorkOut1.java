package org.infomats.finance;

import java.awt.Window;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkOut1 
{
	public static void Website()
	{
		WebDriver dd=new ChromeDriver();
		dd.get("https://www.leafground.com/dashboard.xhtml");
		dd.findElement(By.xpath("//*[@id=\"menuform:j_idt38\"]/a")).click();
		dd.findElement(By.linkText("Dashboard")).click();
		JavascriptExecutor jj=(JavascriptExecutor)dd;
		jj.executeScript("window.scroll(0,300)","");
		dd.findElement(By.xpath("//*[@id=\"j_idt107\"]/div[2]")).click();
	}
	public static void alert()
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.co.in/");
		String parent=driver.getWindowHandle();
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://www.facebook.com/");
		Set<String> stores=driver.getWindowHandles();
		for (String windows : stores) {
			driver.switchTo().window(windows);
			String title=driver.getTitle();
			System.out.println(title);
			if (windows.contentEquals("google")) {
				driver.close();
			}
		}	
	}
	public static void win()
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.leafground.com/dashboard.xhtml");
		String title=driver.getTitle();
		System.out.println("Title name is :"+title);;
	}
	public void workout()
	{
		WebDriver d=new ChromeDriver();
		d.get("https://www.flipkart.com/?affid=partnershi1&affExtParam1=Opera%20One&affExtParam2=pc-in-flipkart-flipkart-sd-b");
		d.switchTo().newWindow(WindowType.TAB);
		d.get("https://www.youtube.com");		
		d.close();
	}	
	public static void main (String []args)
	{
		WorkOut1 w=new WorkOut1();
		w.workout();
	}
}
