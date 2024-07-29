package org.infomats.finance;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClick 
{
	public static void main (String[]args) throws AWTException
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.co.in/");
		WebElement gmail=driver.findElement(By.className("gb_x"));
		Actions a=new Actions(driver);
		a.contextClick(gmail).perform();
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);			
	}
}