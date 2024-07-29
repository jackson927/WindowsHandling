package org.infomats.finance;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Createamazonaccount 
{
	public static void main (String[]args)
	{
		WebDriver dd=new ChromeDriver();
		dd.get("https://www.google.co.in/");
		dd.manage().window().maximize();
		dd.navigate().to("https://na.account.amazon.com/ap/signin?openid.pape.max_auth_age=0&enableGlobalAccountCreation=1&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&marketPlaceId=ATVPDKIKX0DER&signedMetricIdentifier=6MhImXUMRGfxjK0kVD34ey9XKcS6YSLCx%2FNelXzX%2BW4%3D&language=en_US&pageId=lwa&openid.return_to=https%3A%2F%2Fna.account.amazon.com%2Fap%2Foa%3FmarketPlaceId%3DATVPDKIKX0DER%26arb%3D371cd60a-c212-488d-872e-e8c56bd3a7f1%26language%3Den_US&prevRID=1B4ENJR4DFV1NCGVP4TK&metricIdentifier=amzn1.application.e5b6fb6d01b14dc89cf26fc98dda827d&openid.assoc_handle=amzn_lwa_na&openid.mode=checkid_setup&openid.ns.pape=http%3A%2F%2Fspecs.openid.net%2Fextensions%2Fpape%2F1.0&failedSignInCount=0&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
		WebElement email=dd.findElement(By.name("email"));
		email.sendKeys("harigowtham.h@gmail.com");
		dd.findElement(By.id("continue")).click();
		WebElement password=dd.findElement(By.name("password"));
		password.sendKeys("Gowtham123$");
		dd.findElement(By.id("signInSubmit")).click();
	}
}
