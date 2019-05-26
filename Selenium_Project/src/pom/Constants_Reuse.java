package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;

public class Constants_Reuse
{
	public static WebDriver driver=new FirefoxDriver();
	
	public static LoginPage lp=PageFactory.initElements(driver, LoginPage.class);
	public static MenuItems mi=PageFactory.initElements(driver, MenuItems.class);
}
