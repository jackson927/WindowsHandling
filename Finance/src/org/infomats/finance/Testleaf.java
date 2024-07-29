package org.infomats.finance;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testleaf 
{
public static void main (String[]args)
{
	WebDriver wd=new ChromeDriver();
	wd.get("https://www.leafground.com/input.xhtml");
	wd.manage().window().maximize();
	WebElement wd1=wd.findElement(By.id("j_idt88:name"));
	wd1.sendKeys("Gowtham");
	WebElement wd2=wd.findElement(By.name("j_idt88:j_idt91"));
	wd2.sendKeys("-28");
	WebElement wd3=wd.findElement(By.id("j_idt88:j_idt93"));
	System.out.println(wd3.isEnabled());
	WebElement wd4=wd.findElement(By.name("j_idt88:j_idt95"));
	wd4.clear();
	WebElement wd5=wd.findElement(By.id("j_idt88:j_idt97"));
	System.out.println(wd5.getAttribute("value"));
	WebElement wd6=wd.findElement(By.name("j_idt88:j_idt99"));
	wd.findElement(By.name("j_idt88:j_idt99")).sendKeys("harigowtham.h@gmail.com"+Keys.TAB);
	WebElement wd7=wd.findElement(By.id("j_idt88:j_idt101"));
	wd.findElement(By.id("j_idt88:j_idt101")).sendKeys("Good evening mam...I am gowtham...I am an 24 years old...I did schooling at sri vidya mandir...I knowledge on both manual and automation testing...I have worked two domain project such as bank,healthcare");
	org.openqa.selenium.JavascriptExecutor s=(org.openqa.selenium.JavascriptExecutor) wd;
	s.executeScript("window.scrollBy(0,-400)","");
	s.executeScript("window.scrollBy(0,900)","");
}
}
