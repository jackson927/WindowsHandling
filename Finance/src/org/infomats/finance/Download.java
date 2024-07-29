package org.infomats.finance;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait; 

public class Download
{
	public static void DownloadConcept() throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/upload-download");
		JavascriptExecutor ja=(JavascriptExecutor)driver;
		ja.executeScript("window.scrollBy(0,250)","");
		driver.findElement(By.id("downloadButton")).click();
		Thread.sleep(3000);
		File file=new File("C:\\Users\\Rajesh\\Downloads");
		File[]files=file.listFiles();
		for (File file2 : files) 
		{
			if (file2.getName().contains("sampleFile")) 
			{
				Thread.sleep(2000);
				System.out.println("Sample file is successfully downloaded");
				break;
			}			
		}
	}
	public static void UploadConcept()
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/upload-download");
		JavascriptExecutor ja=(JavascriptExecutor)driver;
		ja.executeScript("window.scrollBy(0,300)","");		
		WebElement store=driver.findElement(By.id("uploadFile"));
		store.sendKeys("C:\\Users\\Rajesh\\Downloads");
		store.submit();	
	}
	public static void main(String[]args) 
	{
		UploadConcept();
	}
}
