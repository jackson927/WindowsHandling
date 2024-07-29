package org.infomats.finance;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import dev.failsafe.internal.util.Durations;

public class AmazonWorkOut 
{
	public static void Work()
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/s?k=slippers+for+men&crid=8HJOPHJ8557T&sprefix=slipp%2Caps%2C400&ref=nb_sb_ss_w_hit-vc-lth_slippers-for-men_k0_1_5");
		JavascriptExecutor ss=(JavascriptExecutor)driver;
		ss.executeScript("window.scrollBy(0,550)","");
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMillis(1000));
		wait.until(ExpectedConditions.elementToBeClickable(By.className("a-price-whole"))).click();	
		JavascriptExecutor s1=(JavascriptExecutor)driver;
		ss.executeScript("window.scrollBy(0,300)","");
		WebDriverWait wait2=new WebDriverWait(driver, Duration.ofMillis(800));
		wait2.until(ExpectedConditions.elementToBeClickable(By.id("buy-now-button"))).click();
	}
	public static void main (String[]args)
	{
		Work();
	}

	
}
