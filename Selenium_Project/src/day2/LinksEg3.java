package day2;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LinksEg3 {

	public static void main(String[] args) throws InterruptedException, IOException 
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("http://primusbank.qedgetech.com/sitemap.html");
		driver.manage().window().maximize();

		WebElement block=driver.findElement(By.xpath("//table[@id='Table_011']/tbody/tr[2]/td"));
		
		List<WebElement> links=block.findElements(By.tagName("a"));
		
		System.out.println(links.size());
		
		for (int i = 0; i < links.size(); i++)
		{
			String lText=links.get(i).getText();
			System.out.println(lText);
			
			links.get(i).click();
			System.out.println(driver.getTitle()+"----"+driver.getCurrentUrl());
			
			File Src=((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(Src, new File("F:\\Neetha_RajRecordings\\Workspace\\Selenium_Project\\src\\screenshots\\"+lText+".png"));
			
			Thread.sleep(3000);
			driver.navigate().back();
			Thread.sleep(3000);
			block=driver.findElement(By.xpath("//table[@id='Table_011']/tbody/tr[2]/td"));
			
			links=block.findElements(By.tagName("a"));
		}

	}

}
