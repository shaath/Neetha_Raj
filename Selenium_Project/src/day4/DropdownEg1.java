package day4;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownEg1 {

	public static void main(String[] args)
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("file:///F:/Sharath/Desktop/cars.html");
		driver.manage().window().maximize();
		
		WebElement drop=driver.findElement(By.xpath("html/body/select"));
		
		Select s=new Select(drop);
		
//		s.selectByIndex(2);
//		s.selectByValue("saab");
//		s.selectByVisibleText("audi");
		
		List<WebElement> dItems=s.getOptions();
		System.out.println(dItems.size());
		
		for (int i = 0; i < dItems.size(); i++) 
		{
//			String name=dItems.get(i).getText();
			String name=dItems.get(i).getAttribute("value");
			System.out.println(name);
			
			s.selectByValue(name);
		}
		
		
	}

}
