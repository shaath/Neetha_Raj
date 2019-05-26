package testNG;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.math3.analysis.function.Constant;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import config.Config_Var;

public class TestNGMaster extends Config_Var
{
	public static WebDriver driver;
	public static String expval, actval;
	public static FileInputStream fi;
	public static Properties pr;
	@BeforeSuite
	public void Org_Launch() throws IOException
	{
		expval="LOGIN";
		if (br.equalsIgnoreCase("Firefox"))
		{
			driver=new FirefoxDriver();
		}
		else if (br.equalsIgnoreCase("Chome")) 
		{
			System.setProperty("webdriver.chrome.driver",ChromDriver_Path );
			driver=new ChromeDriver();
		}
		else if (br.equalsIgnoreCase("ie"))
		{
			System.setProperty("webdriver.ie.driver", IEdriver_Path);
			driver=new InternetExplorerDriver();
		}
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
		fi=new FileInputStream(PropFile_Path);
		pr=new Properties();
		pr.load(fi);
		
		actval=driver.findElement(By.xpath(pr.getProperty("login"))).getAttribute("value");
	
		Assert.assertEquals(actval, expval,"Launch Failed");
	}
	
	@BeforeTest
	public void Org_Login() throws InterruptedException
	{
		expval="welcome";
		driver.findElement(By.xpath(pr.getProperty("username"))).sendKeys(u);
		driver.findElement(By.xpath(pr.getProperty("password"))).sendKeys(p);
		driver.findElement(By.xpath(pr.getProperty("login"))).click();
		Thread.sleep(3000);
		
		actval=driver.findElement(By.partialLinkText("Welcome")).getAttribute("id");
		Assert.assertEquals(actval, expval,"Login Failed");
	}
	
	@AfterTest
	public void Org_Logout()
	{
		expval="LOGIN";
		driver.findElement(By.partialLinkText("Welcome")).click();
		driver.findElement(By.linkText("Logout")).click();
		
		actval=driver.findElement(By.id("btnLogin")).getAttribute("value");
		Assert.assertEquals(actval, expval,"Login Failed");
	}
	@AfterSuite
	public void Org_Close()
	{
		driver.close();
	}

}
