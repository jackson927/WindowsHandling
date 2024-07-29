package org.infomats.finance;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class absolute 
{
public static void main (String[]args)
{
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.google.co.in/");
	driver.findElement(By.xpath("//*[@class='gLFyf'][@aria-controls='Alh6id'][@aria-owns='Alh6id']")).click();
}
}
