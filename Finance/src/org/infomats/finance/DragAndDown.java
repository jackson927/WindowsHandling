package org.infomats.finance;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDown 
{
	public static void main (String[]args)
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.leafground.com/drag.xhtml");
		WebElement drag=driver.findElement(By.id("form:drag_content"));
		WebElement drop=driver.findElement(By.id("form:drop_content"));
		Actions a=new Actions(driver);
		         //IN DRAG AND DROP WE ARE USING TWO METHODS TO FIND.
		         //1.DRAGANDDROP
		         //2.CLICKANDHOLD
		a.dragAndDrop(drag,drop).perform();
		//a.clickAndHold(drag).moveToElement(drop).release().perform();
	}
}
