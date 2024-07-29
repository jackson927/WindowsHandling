package org.infomats.finance;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class concept 
{
	public void sample()
	{
		WebDriver wd=new ChromeDriver();
		wd.get("https://www.facebook.com/");
		wd.findElement(By.linkText("Create new account")).click();
//		wd.findElement(By.xpath("//*[@id=\'u_0_0_Bm\']"));
		for (int i=1;i<=3;i++)
		{
			WebElement we=wd.findElement(By.xpath("//span[@class='_5k_3']/span["+i+"]/label"));
			String text=we.getText();
			System.out.println(text);
			if(text.equalsIgnoreCase("female"))
			{
				we.click();
			}			
		}
	}
	public static void main (String[]args)
	{
		concept pt=new concept();
		pt.sample();				
	}
}
