package day4;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AutoFillersEg {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.redbus.in/");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("src")).sendKeys("S");
		Thread.sleep(5000);

		List<WebElement> list=driver.findElements(By.xpath("//ul[@class='autoFill']/li"));
		
		System.out.println(list.size());
		for (int i = 0; i < list.size(); i++)
		{
			String name=list.get(i).getText();
			System.out.println(name);
			
			if (name.equalsIgnoreCase("Salem (All Locations)"))
			{
				list.get(i).click();
				break;
			}
		}
		
	}

}
