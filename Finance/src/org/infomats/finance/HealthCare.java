package org.infomats.finance;


import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HealthCare 
{
	public static void main (String[]args) throws AWTException
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.smart-hospital.in/admin/appointment");
//		driver.get("https://demo.smart-hospital.in/form/appointment");
//		driver.manage().window().maximize();
//		String parent=driver.getWindowHandle();
//		driver.findElement(By.xpath("//i[@class='fa fa-user']//parent::a")).click();
//		driver.findElement(By.xpath("//i[@class='fa fa-user']//parent::a")).click();
//		Set<String> windowhandles=driver.getWindowHandles();
//		for (String child : windowhandles) 
//		{
//			driver.switchTo().window(child);
//		}
		driver.findElement(By.linkText("Super Admin")).click();
		driver.findElement(By.className("btn")).click();
		driver.findElement(By.linkText("Appointment")).click();
		driver.findElement(By.xpath("(//div[@class='box-tools pull-right']//child::a)[1]")).click();
//		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(300));
//		//Thread.sleep(Duration.ofMillis(300));
//		driver.findElement(By.id("add")).click();
//		//WebDriverWait w=new WebDriverWait(driver, Duration.ofMillis(30));
		//w.until(ExpectedConditions.elementToBeClickable(By.id("add"))).click();	
//		driver.findElement(By.id("name")).sendKeys("Gowtham"+Keys.TAB);
//		driver.findElement(By.name("guardian_name")).sendKeys("Gowtham Hariram"+Keys.TAB);
////		WebElement options=driver.findElement(By.className("form-control"));
//		Select select=new Select(driver.findElement(By.id("addformgender")));
//		select.selectByValue("Male");
//		driver.findElement(By.name("dob")).click();
//		String text=driver.findElement(By.className("datepicker-switch")).getText();
//		while (!(text.equalsIgnoreCase("March 2000")))
//		{
//			driver.findElement(By.className("prev")).click();
//			text=driver.findElement(By.className("datepicker-switch")).getText();
//		}
//		driver.findElement(By.xpath("/html/body/div[7]/div[1]/table/tbody/tr[3]/td[5]")).click();
//		driver.findElement(By.name("age[year]")).sendKeys("2000"+Keys.TAB);
//		driver.findElement(By.id("age_month")).sendKeys("03"+Keys.TAB);
//		driver.findElement(By.id("age_day")).sendKeys("16"+Keys.TAB);
//		Select select1=new Select(driver.findElement(By.name("blood_group")));
//		select1.selectByIndex(8);
//		Select select2=new Select(driver.findElement(By.name("marital_status")));
//		select2.selectByIndex(1);
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
//		WebElement store=driver.findElement(By.xpath("//input[@name='file']"));
//		store.sendKeys("C:\\Users\\Rajesh\\Downloads");		
//		store.submit();
//		org.openqa.selenium.Alert a=driver.switchTo().alert();
//		a.accept();
//		driver.findElement(By.id("number")).sendKeys("9442048421"+Keys.TAB);
//		driver.findElement(By.xpath("//*[@id=\'addformemail\']")).sendKeys("harigowtham.h@gmail.com"+Keys.TAB);
//		driver.findElement(By.xpath("//*[@id=\'formaddpa\']/div[1]/div/div/div/div/div/div[7]/div/input"))
//		.sendKeys("12/212 A Ambalavanar kovil street,Gugai,Salem-636006"+Keys.TAB);
//		driver.findElement(By.xpath("(//*[@id=\'note\'])[2]")).sendKeys("No"+Keys.TAB);
//		driver.findElement(By.name("known_allergies")).sendKeys("No"+Keys.TAB);
//		driver.findElement(By.name("insurance_id")).sendKeys("1023"+Keys.TAB);
//		driver.findElement(By.name("validity")).sendKeys("Till 14th Jan 2026"+Keys.TAB);
//		driver.findElement(By.name("identification_number")).sendKeys("9081 1237 0321"+Keys.TAB);
//		driver.findElement(By.name("custom_fields[patient][3]")).sendKeys("8923781290"+Keys.TAB);
//		driver.findElement(By.id("formaddpabtn")).click();
//		try
//		{
//			org.openqa.selenium.Alert a1=driver.switchTo().alert();
//			a1.accept();
//		}
//		catch (UnhandledAlertException e) 
//		{
//			// TODO: handle exception
//			System.out.println("Alert is not handled");
//		}
//		catch (NoAlertPresentException e) 
//		{
//			// TODO: handle exception
//			System.out.println("Handled the alert");
//		}
		//driver.findElement(By.xpath("//span[@id='select2-doctorid-container']")).click();
		WebDriverWait wdw=new WebDriverWait(driver,Duration.ofMillis(60));
		wdw.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[@id='select2-doctorid-container']"))).click();
		Robot robot=new Robot();
		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		driver.findElement(By.id("select2-global_shift-container")).click();	
	}	
}
