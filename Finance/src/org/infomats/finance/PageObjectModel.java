package org.infomats.finance;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

public class PageObjectModel 
{
	public void pom()
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.co.in/");
		WebElement name=driver.findElement(By.name("q"));
		name.sendKeys("explain pom topic in java selenium"+Keys.ENTER);
		driver.navigate().back();
		name.sendKeys("who was introduced the selenium"+Keys.ENTER);
	}
	public void SearchInput()
	{
		WebDriver d=new ChromeDriver();
		d.get("https://www.google.co.in/");
		PageFactory.initElements(d, POM.class);
		POM.search.sendKeys("selenium \n");	
		d.navigate().back();
		d.close();
	}	
	public static void main (String[]args)
	{
		PageObjectModel Pom=new PageObjectModel();
		Pom.SearchInput();
	}

}
