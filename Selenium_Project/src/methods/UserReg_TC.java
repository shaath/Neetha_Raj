package methods;

import java.io.IOException;

public class UserReg_TC 
{
	public static void main(String[] args) throws InterruptedException, IOException 
	{
		OrgHRMLib om=new OrgHRMLib();
		
		String res=om.Org_Launch("firefox", "http://orangehrm.qedgetech.com");
		System.out.println("Application Launch "+res);
		
		res=om.Org_Login("Admin", "Qedge123!@#");
		System.out.println("Application Login "+res);
		
		res=om.org_Userreg("Raj D", "RajD@1234567890", "RajD@1234567890", "RajD@1234567890");
		System.out.println("User Registration "+res);
		
		res=om.Org_Logout();
		System.out.println("Application Logout "+res);
		
		om.Org_Close();
		System.out.println("Applcation closed Successfully");
	}

}
