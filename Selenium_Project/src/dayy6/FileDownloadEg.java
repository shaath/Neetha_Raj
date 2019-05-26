package dayy6;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FileDownloadEg {

	public static void main(String[] args) throws InterruptedException, IOException 
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.seleniumhq.org/download/");
		driver.manage().window().maximize();
		
		driver.findElement(By.linkText("3.141.59")).click();
		Thread.sleep(3000);
		
		Runtime.getRuntime().exec("C:\\Users\\Dell\\Desktop\\FileUpload.exe");

	}

}
