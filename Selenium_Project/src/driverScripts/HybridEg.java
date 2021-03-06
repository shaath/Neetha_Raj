package driverScripts;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import methods.OrgHRMLib;

public class HybridEg {

	public static void main(String[] args) throws IOException, InterruptedException
	{
		OrgHRMLib om=new OrgHRMLib();
		String res=null;
		String xlPath="F:\\Neetha_RajRecordings\\Workspace\\Selenium_Project\\src\\testdata\\Hybrid.xlsx";
		String xlout="F:\\Neetha_RajRecordings\\Workspace\\Selenium_Project\\src\\results\\HybridRes.xlsx";
		FileInputStream fi=new FileInputStream(xlPath);
		
		XSSFWorkbook wb=new XSSFWorkbook(fi);
		XSSFSheet TC_Sht=wb.getSheet("Testcase");
		XSSFSheet TS_Sht=wb.getSheet("Teststeps");
		XSSFSheet TD_Sht=wb.getSheet("TestData");
		XSSFSheet EmpReg_Sht=wb.getSheet("EmpReg");
		
		int TC_RC=TC_Sht.getLastRowNum();
		int TS_RC=TS_Sht.getLastRowNum();
		int Emp_RC=EmpReg_Sht.getLastRowNum();
		
		
		for (int i = 1; i <= TC_RC ; i++) 
		{
			TC_Sht.getRow(i).createCell(3);
			String Exe=TC_Sht.getRow(i).getCell(2).getStringCellValue();
			if (Exe.equalsIgnoreCase("Y"))
			{
				String TC_Sht_TC_ID=TC_Sht.getRow(i).getCell(0).getStringCellValue();
				
				for (int j = 1; j <= TS_RC; j++) 
				{
					String TS_Sht_TC_ID=TS_Sht.getRow(j).getCell(0).getStringCellValue();
					
					if (TC_Sht_TC_ID.equalsIgnoreCase(TS_Sht_TC_ID)) 
					{
						String key=TS_Sht.getRow(j).getCell(3).getStringCellValue();
						
						switch (key) 
						{
						case "Launch":
							String br=TD_Sht.getRow(1).getCell(0).getStringCellValue();
							String url=TD_Sht.getRow(1).getCell(1).getStringCellValue();
							res=om.Org_Launch(br, url);
							break;
						case "login":
							String u=TD_Sht.getRow(1).getCell(2).getStringCellValue();
							String p=TD_Sht.getRow(1).getCell(3).getStringCellValue();
							res=om.Org_Login(u, p);
							break;
						case "logout":
							res=om.Org_Logout();
							om.Org_Close();
							break;
						case "Empreg":
							for (int k = 1; k <= Emp_RC; k++) 
							{
								String f=EmpReg_Sht.getRow(k).getCell(0).getStringCellValue();
								String l=EmpReg_Sht.getRow(k).getCell(1).getStringCellValue();
								String Eid=EmpReg_Sht.getRow(k).getCell(2).getStringCellValue();
								res=om.Org_EmpReg(f, l, Eid);
								EmpReg_Sht.getRow(k).createCell(3).setCellValue(res);
							}
							
							break;
						case "Usereg":
							String ename=TD_Sht.getRow(1).getCell(7).getStringCellValue();
							String uname=TD_Sht.getRow(1).getCell(8).getStringCellValue();
							String pswd=TD_Sht.getRow(1).getCell(9).getStringCellValue();
							String cpswd=TD_Sht.getRow(1).getCell(10).getStringCellValue();
							res=om.org_Userreg(ename, uname, pswd, cpswd);
							break;
						case "Ulogin":
							String un=TD_Sht.getRow(1).getCell(8).getStringCellValue();
							String cp=TD_Sht.getRow(1).getCell(9).getStringCellValue();
							res=om.Org_Login(un, cp);
							break;
						default:
							System.out.println("Select a proper keyword");
							break;
						}
						
						TS_Sht.getRow(j).createCell(4).setCellValue(res);
						
						if (!TC_Sht.getRow(i).getCell(3).getStringCellValue().equalsIgnoreCase("Fail"))
						{
							TC_Sht.getRow(i).getCell(3).setCellValue(res);
						}
					}
				}
			}
			else
			{
				TC_Sht.getRow(i).getCell(3).setCellValue("BLOCKED");
			}
		}
		
		FileOutputStream fo=new FileOutputStream(xlout);
		wb.write(fo);
		wb.close();

	}

}
