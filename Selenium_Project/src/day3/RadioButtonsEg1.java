package day3;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RadioButtonsEg1 {

	public static void main(String[] args)
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("http://echoecho.com/htmlforms10.htm");
		driver.manage().window().maximize();
		
		WebElement set=driver.findElement(By.xpath("(//td[@class='table5'])[2]"));
		
		List<WebElement> radios=set.findElements(By.tagName("input"));
		System.out.println(radios.size());
		
		for (int i = 0; i < radios.size(); i++) 
		{
			String name=radios.get(i).getAttribute("value");
			System.out.println(name);
			if (name.equalsIgnoreCase("milk"))
			{
				radios.get(i).click();
			}
			else if (name.equalsIgnoreCase("water")) 
			{
				radios.get(i).click();
			}
		}

	}

}
