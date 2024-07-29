package org.infomats.finance;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class seleniumworkout 
{
	public static void main (String[]args)
	{
		WebDriver wd=new ChromeDriver();
		wd.get("https://www.google.com");
		wd.findElement(By.className("gb_I")).click();
		wd.manage().timeouts().implicitlyWait(Duration.ofMillis(3000));
		wd.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		wd.manage().window().maximize();
		wd.navigate().back();
		wd.navigate().forward();
		WebElement Username=wd.findElement(By.name("username"));
		Username.sendKeys("Gowtham");
		WebElement Password=wd.findElement(By.name("password"));
		Password.sendKeys("gow1632");
		WebElement login=wd.findElement(By.xpath("//*[@id=\'app\']/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button"));
		login.click();
		String jet=wd.getPageSource();
		if(jet.contains("Invalid credentials"))
		{
			System.out.println("Invalid");
		}
		else
		{
			System.out.println("Page successfully logged in");
		}		
	}
}
