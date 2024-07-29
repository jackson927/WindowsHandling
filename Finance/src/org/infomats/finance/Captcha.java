package org.infomats.finance;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Captcha 
{
	public void verification()
	{
		WebDriver d=new ChromeDriver();
		d.get("https://www.google.com/recaptcha/api2/demo");
		d.findElement(By.cssSelector(".recaptcha-checkbox-border")).click();
	}
	public void verify()
	{
		//Selenium does not allow null value
		WebDriver driver=new ChromeDriver();
		driver.get(null);
	}
	public void orangeHRM()
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.orangehrm.com/en/30-day-free-trial");
		//driver.findElement(By.xpath("//*[@id=\'Form_getForm_Name\']")).sendKeys("Gowtham"+Keys.ENTER);
		//driver.findElement(By.xpath("//*[@id=\'Form_getForm_Email\']")).sendKeys("harigowtham.h@gmail.com"+Keys.ENTER);
		//driver.findElement(By.xpath("//*[@id=\'Form_getForm_Contact\']")).sendKeys("9442048421"+Keys.ENTER);				
		//Select s=new Select(driver.findElement(By.xpath("//*[@id=\'Form_getForm_Country\']")));
		//s.selectByVisibleText("India");		
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@title='reCAPTCHA']")));
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(3000));
		driver.findElement(By.xpath("//div[@class='recaptcha-checkbox-border']")).click();
	}
	public static void main (String[]args)
	{
		Captcha cap=new Captcha();
		cap.orangeHRM();
	}

}
