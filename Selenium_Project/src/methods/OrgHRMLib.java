package methods;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import config.Config_Var;

public class OrgHRMLib extends Config_Var
{
	public static WebDriver driver;
	public static String expval, actval;
	public static FileInputStream fi;
	public static Properties pr;
	//Launch
	public String Org_Launch(String br,String url) throws IOException
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
		if (expval.equalsIgnoreCase(actval))
		{
			return "Pass";
		}
		else
		{
			return "Fail";
		}
		
	}

	//Login
	
	public String Org_Login(String u,String p) throws InterruptedException
	{
		expval="welcome";
		driver.findElement(By.xpath(pr.getProperty("username"))).sendKeys(u);
		driver.findElement(By.xpath(pr.getProperty("password"))).sendKeys(p);
		driver.findElement(By.xpath(pr.getProperty("login"))).click();
		Thread.sleep(3000);
		
		actval=driver.findElement(By.partialLinkText("Welcome")).getAttribute("id");
		if (expval.equalsIgnoreCase(actval))
		{
			return "Pass";
		}
		else
		{
			return "Fail";
		}
	}
	
	//Logout
	
	public String Org_Logout()
	{
		expval="LOGIN";
		driver.findElement(By.partialLinkText("Welcome")).click();
		driver.findElement(By.linkText("Logout")).click();
		
		actval=driver.findElement(By.id("btnLogin")).getAttribute("value");
		if (expval.equalsIgnoreCase(actval))
		{
			return "Pass";
		}
		else
		{
			return "Fail";
		}		
	}
	//Close()
	public void Org_Close()
	{
		driver.close();
	}
	
	//Employee Reg
	
	public String Org_EmpReg(String f,String l, String Eid)
	{
		expval=f+" "+l;
		driver.findElement(By.linkText("PIM")).click();
		driver.findElement(By.linkText("Add Employee")).click();
		
		driver.findElement(By.id("firstName")).sendKeys(f);
		driver.findElement(By.id("lastName")).sendKeys(l);
		driver.findElement(By.id("employeeId")).clear();
		driver.findElement(By.id("employeeId")).sendKeys(Eid);
		driver.findElement(By.id("btnSave")).click();
		
		actval=driver.findElement(By.xpath("//div[@id='profile-pic']/h1")).getText();
		if (expval.equalsIgnoreCase(actval))
		{
			return "Pass";
		}
		else
		{
			return "Fail";
		}	
	}
	
	//User Reg
	public String org_Userreg(String ename,String uname,String pswd,String cpswd)
	{
		expval=uname;
		boolean flag=false;
		driver.findElement(By.linkText("Admin")).click();
		driver.findElement(By.linkText("User Management")).click();
		driver.findElement(By.linkText("Users")).click();
		
		driver.findElement(By.id("btnAdd")).click();
		
		driver.findElement(By.id("systemUser_employeeName_empName")).sendKeys(ename);
		driver.findElement(By.id("systemUser_userName")).sendKeys(uname);
		driver.findElement(By.id("systemUser_password")).sendKeys(pswd);
		driver.findElement(By.id("systemUser_confirmPassword")).sendKeys(cpswd);
		driver.findElement(By.id("btnSave")).click();
		
		List<WebElement> rows=driver.findElements(By.xpath("//table[@id='resultTable']/tbody/tr"));
		for (int i = 0; i < rows.size(); i++)
		{
			List<WebElement> cols=rows.get(i).findElements(By.tagName("td"));
			actval=cols.get(1).getText();
			if (expval.equalsIgnoreCase(actval))
			{
				flag=true;
				break;
			}
		}
		if (flag==true)
		{
			return "Pass";
		}
		else
		{
			return "Fail";
		}
	}
	
}
