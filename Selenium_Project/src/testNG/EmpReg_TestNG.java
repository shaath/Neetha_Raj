package testNG;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class EmpReg_TestNG extends TestNGMaster
{
	@Test(dataProvider="data")
	public void Org_EmpReg(String f,String l, String Eid)
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
		Assert.assertEquals(actval, expval,"Employee Registration failed");
	}
	
	@DataProvider
	public Object[][] data()
	{
		Object[][] x=new Object[4][3];
		
		x[0][0]="First";
		x[0][1]="Last1";
		x[0][2]="FL1234";
		
		x[1][0]="First";
		x[1][1]="Last2";
		x[1][2]="FL1243";
		
		x[2][0]="First";
		x[2][1]="Last3";
		x[2][2]="FL2134";
		
		x[3][0]="First";
		x[3][1]="Last4";
		x[3][2]="FL1544";
		
		return x;
	}

}
