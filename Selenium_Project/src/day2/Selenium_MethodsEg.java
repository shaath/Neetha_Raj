package day2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Selenium_MethodsEg {

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("http://google.com");
		driver.manage().window().maximize();
		Thread.sleep(5000);
//		System.out.println(driver.getTitle());
//		System.out.println(driver.getCurrentUrl());
//		System.out.println(driver.getPageSource());
		
		driver.navigate().to("http://facebook.com");
		
		Thread.sleep(5000);
		driver.navigate().back();
		Thread.sleep(5000);
		driver.navigate().forward();
		Thread.sleep(5000);
		driver.navigate().refresh();
	}

}
