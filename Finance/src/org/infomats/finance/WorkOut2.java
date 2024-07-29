package org.infomats.finance;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WorkOut2 
{
	public static void Selectable()
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://jqueryui.com/selectable/");
		JavascriptExecutor scroll=(JavascriptExecutor)driver;
		scroll.executeScript("window.scroll(0,300)","");
		driver.switchTo().frame(0);
		List<WebElement> options=driver.findElements(By.xpath("//*[@id=\'selectable\']/li"));
		Actions action=new Actions(driver);
		//action.keyDown(Keys.CONTROL).
		//click(options.get(1)).perform();	
		//click(options.get(4)).perform();
		        //TWO OPTIONS IS THERE FOR SELECTING MULTIPLE OPTIONS
		action.clickAndHold(options.get(1));
		action.clickAndHold(options.get(2));
		action.clickAndHold(options.get(3)).perform();		
	}
	public static void ToolTips()
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/tool-tips");
		driver.manage().window().maximize();
		JavascriptExecutor scroll=(JavascriptExecutor)driver;
		scroll.executeScript("window.scroll(0,200)","");
		WebElement tooltip=driver.findElement(By.id("toolTipButton"));
		Actions action=new Actions(driver);
		action.moveToElement(tooltip).perform();
		String text=driver.findElement(By.xpath("//div[@class='tooltip-inner']")).getText();
		System.out.println(text);			
	}
	public static void AutoCompletion() throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.co.in/");
		driver.findElement(By.name("q")).sendKeys("python");
		Thread.sleep(4000);
		List<WebElement>options=driver.findElements(By.xpath("//*[@id=\"Alh6id\"]/div[1]/div/ul/li"));
		System.out.println(options.size());
		for (WebElement store : options) {
			String text=store.getText();
			System.out.println(text);
			if(text.equalsIgnoreCase("python programming"))
			{
				store.click();
				break;
			}
		}		
	}
	public static void Images()
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/broken");
		JavascriptExecutor scroll=(JavascriptExecutor)driver;
		scroll.executeScript("window.scroll(0,300)","");
		WebElement image=driver.findElement(By.xpath("(//h1[@class='text-center']//following::img)[1]"));
		if(image.getAttribute("naturalWidth").equals("0"))
		{
			System.out.println("Its broken");
		}
		else
		{
			System.out.println("Its is not broken");
		}		
	}
	public static void URL() throws IOException  
	{
		URL url=new URL("https://demoqa.com/");
		HttpURLConnection h=(HttpURLConnection)url.openConnection();
		int code=h.getResponseCode();
		System.out.println(code);
		String message=h.getResponseMessage();
		System.out.println(message);
	}
	public static void main (String[]args) throws InterruptedException, IOException
	{
		Selectable();
	}

}
