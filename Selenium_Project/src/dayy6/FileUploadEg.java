package dayy6;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FileUploadEg {

	public static void main(String[] args) throws InterruptedException, IOException, AWTException
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("http://orangehrm.qedgetech.com");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("Qedge123!@#");
		driver.findElement(By.id("btnLogin")).click();
		
		driver.findElement(By.linkText("PIM")).click();
		driver.findElement(By.linkText("Add Employee")).click();
		
//		driver.findElement(By.id("photofile")).sendKeys("C:\\Users\\Dell\\Pictures\\jira.png");
		Thread.sleep(3000);													
		driver.findElement(By.id("photofile")).click();
		
		Thread.sleep(3000);
		
//		Runtime.getRuntime().exec("C:\\Users\\Dell\\Desktop\\FileUpload2.exe");
		
		//Store the location of the file in clipboard 
		//Clipboard
		 StringSelection strSel = new StringSelection("E:\\jira.png");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(strSel, null);
		
		//Create an object for robot class
		Robot robot = new Robot();
		//Control key in the keyboard
		//Ctrl+V 
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		
		Thread.sleep(3000);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
	}

}
