package day5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class DragableEg {

	public static void main(String[] args) 
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("http://jqueryui.com/draggable/");
		driver.manage().window().maximize();
		
		WebElement frame=driver.findElement(By.className("demo-frame"));
		
		driver.switchTo().frame(frame);
		
		WebElement drag=driver.findElement(By.id("draggable"));
		
		Actions act=new Actions(driver);
		act.dragAndDropBy(drag, 396, 221).build().perform();
		
		
	}

}
