package org.infomats.finance;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class gettingURL 
{
	public static void main (String[]args)
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.co.in/");
		driver.findElement(By.className("gLFyf")).sendKeys("Infomats technology \n");
		List<WebElement> url=driver.findElements(By.xpath(""));
		System.out.println(url.size());
		for (WebElement link : url) 
		{
		 String ul = link.getAttribute("href");   
		 System.out.println(ul);			
		}		
	}
}
