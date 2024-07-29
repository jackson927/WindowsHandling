package org.infomats.finance;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Select;

public class WorkOut3 
{
	WebDriver driver;
	public void work()
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.co.in/");
	    driver.switchTo().newWindow(WindowType.TAB);
	    driver.get("https://in.search.yahoo.com/search?fr=mcafee&type=E211IN826G0&p=facebook+login+page&guccounter=1");
	}
	public void work1()
	{
		driver=new ChromeDriver();
		driver.get("https://ssc.nic.in/");
		driver.findElement(By.className("Language")).click();
		Select s=new Select(driver.findElement(By.className("Language")));
		s.selectByIndex(1);
	}
	public void work2()
	{
		WebDriver d1=new ChromeDriver();
		d1.get("https://www.primevideo.com/region/eu/offers/nonprimehomepage/ref=dv_web_force_root");
		String title=d1.getTitle();
		System.out.println(title);
	}
	public void work3()
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		WebElement right=driver.findElement(By.className("gb_x"));
		
	}
	public static void main (String[]args)
	{
		WorkOut3 newwin=new WorkOut3();
		newwin.work2();
	}

}
