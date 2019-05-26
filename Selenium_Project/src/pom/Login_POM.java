package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class Login_POM extends Constants_Reuse
{
	@Test
	public void login() throws InterruptedException
	{
		
		driver.get(lp.url);
		driver.manage().window().maximize();
		
		lp.org_login(lp.u, lp.p);
		
		Thread.sleep(5000);
		
		mi.welcomeclick();
		mi.logoutclick();
		
		driver.close();
		
	}

}
