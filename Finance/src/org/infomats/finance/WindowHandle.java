package org.infomats.finance;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandle 
{
	public static void windowhandle()
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.leafground.com/window.xhtml;jsessionid=node07cbf9k9cqb9xkj4mddosr94s4691117.node0");
		driver.manage().window().maximize();
		String window=driver.getWindowHandle();
		WebElement Alert=driver.findElement(By.xpath("//*[@id=\"j_idt88:j_idt93\"]/span[2]"));
		Alert.click(); 
		Set<String> winhandles=driver.getWindowHandles();		
		for (String source : winhandles) {
			driver.switchTo().window(source);
			String title=driver.getTitle();
			System.out.println(title);
			if (title.contains("Input Components")) 
			{
				driver.close();
			}			
		}				
	}
	public static void WindowHandleByIndex()
	{
		WebDriver driver1=new ChromeDriver();
		driver1.get("https://www.google.co.in/");
		String parent=driver1.getWindowHandle();
		driver1.switchTo().newWindow(WindowType.TAB);
		driver1.get("https://www.facebook.com/facebook/");
		ArrayList<String> tabs = new ArrayList<String>(driver1.getWindowHandles());
		int index_pos=3;
		if (index_pos==3)
		{
			driver1.close();
		}	
	}
	public static void WorkOutWindowHandle()
	{
		WebDriver driver2=new ChromeDriver();
		driver2.get("https://www.leafground.com/window.xhtml;jsessionid=node010nx464jtc8vzxsmrg4fp0yu9138.node0");
		String parent=driver2.getWindowHandle();
		WebElement child=driver2.findElement(By.xpath("//*[@id=\"j_idt88:j_idt93\"]/span[2]"));
		child.click();
		Set<String> store=driver2.getWindowHandles();
		for (String string : store)
		{
			char[] ti=	driver2.switchTo().window(string).getTitle().toCharArray();
		}
	}
	public static void main (String[]args)
	{
		WorkOutWindowHandle();
	}

}
