package org.infomats.finance;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable 
{
	public static void main (String[]args)
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://cosmocode.io/automation-practice-webtable/#google_vignette");
		JavascriptExecutor scroll=(JavascriptExecutor)driver;
		scroll.executeScript("window.scrollBy(0,1000)","");
		List<WebElement> row=driver.findElements(By.xpath("(//table[@id='countries']/tbody/tr)"));
		int row_count=row.size();
		List<WebElement>column=driver.findElements(By.xpath("(//table[@id='countries']/tbody/tr/td/h3)"));
		int column_count=column.size();
		System.out.println("No of row :"+row_count+" No of column :"+column_count);
		List<WebElement>Identifying=driver.findElements(By.xpath("(//table[@id='countries']/tbody/tr/td[2])"));
		for (WebElement find : Identifying) 
		{
			String text=find.getText();
			System.out.println(text);
			if (text.contains("India")) 
			{
				driver.findElement(By.className("hasVisited")).click();
			}
			break;
		}		
	}

}
