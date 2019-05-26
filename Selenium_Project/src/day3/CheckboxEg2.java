package day3;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CheckboxEg2 {

	public static void main(String[] args)
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("http://echoecho.com/htmlforms09.htm");
		driver.manage().window().maximize();
		
		WebElement block=driver.findElement(By.xpath("(//td[@class='table5'])[2]"));
		
		List<WebElement> checks=block.findElements(By.tagName("input"));
		System.out.println(checks.size());
		
		for (int i = 0; i < checks.size(); i++) 
		{
			String cname=checks.get(i).getAttribute("value");
			System.out.println(cname);
		
			if (!checks.get(i).isSelected()) 
			{
				checks.get(i).click();
			}
		}
	}

}
