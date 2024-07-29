package org.infomats.finance;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown 
{
	public static void SingleValue()
	{
		WebDriver web=new ChromeDriver();
		web.get("http://ironspider.ca/forms/dropdowns.htm");
		web.manage().window().maximize();
		WebElement ww=web.findElement(By.name("coffee"));
		Select sel=new Select(ww);
		List<WebElement>ll=sel.getOptions();
		for (WebElement ss:ll)
		{
			System.out.println(ss.getAttribute("value"));
		}		
	}
	public static void Tamilan()
	{
		WebDriver web1=new ChromeDriver();
		web1.get("http://ironspider.ca/forms/dropdowns.htm");
		web1.manage().window().maximize();
		WebElement ww=web1.findElement(By.name("coffee"));
		Select sel1=new Select(ww);
		sel1.selectByValue("black");		
	}
	public static void GetAllSelectedOptions()
	{
		WebDriver web2=new ChromeDriver();
		web2.get("http://ironspider.ca/forms/dropdowns.htm");
		web2.manage().window().maximize();
		WebElement ww1=web2.findElement(By.name("coffee"));
		Select sel2=new Select(ww1);
		List<WebElement>ll1=sel2.getAllSelectedOptions();
		for(WebElement ll2:ll1)
		{
			System.out.println(ll2.getText());
		}
	}
	public static void main (String[]args)
	{
		Tamilan();
	}
}
