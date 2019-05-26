package grid;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class GridEg 
{
	@Parameters({"br","pt"})
	@Test
	public void grid(String b,String p) throws MalformedURLException, InterruptedException
	{
		DesiredCapabilities cap=new DesiredCapabilities();
		if (b.equalsIgnoreCase("firefox") & p.equalsIgnoreCase("windows"))
		{
			cap=DesiredCapabilities.firefox();
			cap.setPlatform(Platform.WINDOWS);
		}
		else if (b.equalsIgnoreCase("chrome") & p.equalsIgnoreCase("windows")) 
		{
			cap=DesiredCapabilities.chrome();
			cap.setPlatform(Platform.WINDOWS);
		}
		
//		DesiredCapabilities cap=DesiredCapabilities.firefox();
//		cap.setPlatform(Platform.WINDOWS);
		
//		DesiredCapabilities cap=DesiredCapabilities.chrome();
//		cap.setPlatform(Platform.WINDOWS);
		
		WebDriver driver=new RemoteWebDriver(new URL("http://192.168.0.4:4444/wd/hub"), cap);
		driver.get("http://orangehrm.qedgetech.com");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("Qedge123!@#");
		driver.findElement(By.id("btnLogin")).click();
		
		Thread.sleep(5000);
		
		driver.findElement(By.partialLinkText("Welcome")).click();
		driver.findElement(By.linkText("Logout")).click();
		
		
		driver.close();
	}

}
