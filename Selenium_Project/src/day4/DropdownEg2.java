package day4;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownEg2 {

	public static void main(String[] args) 
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("http://newtours.demoaut.com/mercuryregister.php?osCsid=14bbc22341332a2b4b66dcdd0f1f3372");
		driver.manage().window().maximize();
		
		WebElement country_drop=driver.findElement(By.name("country"));
		
		Select s=new Select(country_drop);
		
		List<WebElement> clist=s.getOptions();
		
		System.out.println(clist.size());
		
		for (int i = 0; i < clist.size(); i++)
		{
			s.selectByIndex(i);
			String name=clist.get(i).getText();
			System.out.println(name);
		}
		
	}

}
