package org.infomats.finance;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class firefox 
{
	public static void main (String[]args)
	{
		WebDriver d=new ChromeDriver();
		d.get("https://www.google.co.in/");
		String current_URL=d.getCurrentUrl();
		System.out.println("My current URL is :"+current_URL);
			
	}
}
