package methods;

import java.io.IOException;

public class TestSuite {

	public static void main(String[] args) throws InterruptedException, IOException 
	{
		//Login
		OrgHRMLib om=new OrgHRMLib();
		
		String res=om.Org_Launch("firefox", "http://orangehrm.qedgetech.com");
		System.out.println("Application Launch "+res);
		
		res=om.Org_Login("Admin", "Qedge123!@#");
		System.out.println("Application Login "+res);
		
		res=om.Org_Logout();
		System.out.println("Application Logout "+res);
		
		om.Org_Close();
		System.out.println("Applcation closed Successfully");
		
		//EmpReg
		res=om.Org_Launch("firefox", "http://orangehrm.qedgetech.com");
		System.out.println("Application Launch "+res);
		
		res=om.Org_Login("Admin", "Qedge123!@#");
		System.out.println("Application Login "+res);
		
		res=om.Org_EmpReg("Nidi", "G", "NG98765");
		System.out.println("Employee Registration "+res);
		
		res=om.Org_Logout();
		System.out.println("Application Logout "+res);
		
		om.Org_Close();
		System.out.println("Applcation closed Successfully");
		
		//UserReg
		res=om.Org_Launch("firefox", "http://orangehrm.qedgetech.com");
		System.out.println("Application Launch "+res);
		
		res=om.Org_Login("Admin", "Qedge123!@#");
		System.out.println("Application Login "+res);
		
		res=om.org_Userreg("Nidi G", "NidiG@1234567890", "NidiG@1234567890", "NidiG@1234567890");
		System.out.println("User Registration "+res);
		
		res=om.Org_Logout();
		System.out.println("Application Logout "+res);
		
		om.Org_Close();
		System.out.println("Applcation closed Successfully");

		//UserLogin
		res=om.Org_Launch("firefox", "http://orangehrm.qedgetech.com");
		System.out.println("Application Launch "+res);
		
		res=om.Org_Login("NidiG@1234567890", "NidiG@1234567890");
		System.out.println("Application Login "+res);
		
		res=om.Org_Logout();
		System.out.println("Application Logout "+res);
		
		om.Org_Close();
		System.out.println("Applcation closed Successfully");

	}

}
