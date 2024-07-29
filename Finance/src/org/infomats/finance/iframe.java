package org.infomats.finance;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class iframe 
{ 
  public static void Iframe()
  {
	  WebDriver frame=new ChromeDriver();
	  frame.get("https://www.leafground.com/frame.xhtml;jsessionid=node0rfy7wtqzzpsw6ne823woykcz4468631.node0");
	  frame.manage().window().maximize();
	  frame.switchTo().frame(0);
	  frame.findElement(By.id("Click")).click();
	  frame.switchTo().defaultContent();
	  int size=frame.findElements(By.tagName("iframe")).size();
	  System.out.println(size);
	  frame.switchTo().frame(2);
	  frame.switchTo().frame("frame2");
	  frame.findElement(By.id("Click")).click();
	  frame.switchTo().parentFrame();
	  String src=frame.getCurrentUrl();
	  System.out.println(src);
  }
  public static void MouseHoverAction()
  {
	  WebDriver action=new ChromeDriver();
	  action.get("https://www.leafground.com/select.xhtml");
	  WebElement country = action.findElement(By.id("j_idt87:country_label"));
	  country.click();
	  Actions aa=new Actions(action);
	  aa.moveToElement(country).perform();
	  WebElement india=action.findElement(By.id("j_idt87:country_3"));
	  aa.click(india).perform();  
  }
  public static void main (String[]args)
  {	
	  MouseHoverAction();
  }
}
