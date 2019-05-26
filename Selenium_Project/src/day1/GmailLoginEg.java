package day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GmailLoginEg {

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new FirefoxDriver();
		
//		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\Desktop\\chromedriver.exe");
//		ChromeDriver driver=new ChromeDriver();
		driver.get("http://gmail.com");
		driver.manage().window().maximize();
		
		WebElement email=driver.findElement(By.id("identifierId"));
		email.sendKeys("seleniumtrainer449@gmail.com");
		
//		email.clear();
		
		driver.findElement(By.xpath("//span[text()='Next']")).click();
		
		Thread.sleep(10000);
		
		driver.findElement(By.name("password")).sendKeys("1234567890");
		driver.findElement(By.xpath("//span[text()='Next']")).click();
	}

}
