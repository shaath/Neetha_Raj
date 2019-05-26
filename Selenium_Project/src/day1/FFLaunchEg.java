package day1;

import org.openqa.selenium.firefox.FirefoxDriver;

public class FFLaunchEg {

	public static void main(String[] args) 
	{
//		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Dell\\Downloads/geckodriver.exe");
		FirefoxDriver driver=new FirefoxDriver();

		driver.get("http://google.com");
		driver.manage().window().maximize();
	}

}
