package CoreJavaTopics;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class screenshot {

	public void takesscreenshot() throws IOException
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/upload-download");
		TakesScreenshot screenshot=(TakesScreenshot) driver;
		File file=screenshot.getScreenshotAs(OutputType.FILE);
		File destination=new File("E:\\demoqascreenshot.png");
		FileHandler.copy(file, destination);
	}
	public static void main (String []args) throws IOException
	{
		screenshot ss=new screenshot();
		ss.takesscreenshot();
	}
}
