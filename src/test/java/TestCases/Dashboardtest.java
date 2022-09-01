package TestCases;



import java.time.Duration;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.TestBAse;

import page.DashBoardPage;
import page.LoginPage;

public class Dashboardtest extends TestBAse {

	
	DashBoardPage dash;
	LoginPage login;
	
	@BeforeMethod
	public void before() throws Exception{
		
		
		initalization();
		
		login= new LoginPage();
		dash = new DashBoardPage();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		login.zerodhalogin();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
	}
	@Test(timeOut=2000)
	public void  verifynicknametest()
	{
		
	dash.verifynickname();
	}
	
//	@Test
//	//(dependsOnMethods="verifynicknametest")
//	public void   verifylogotest ()
//	{
//		dash.verifylogo();
//		
//	}

	
//	@Test(enabled=false,priority=1)
//	public void verifyuseridTest()
//	{
//		dash.verifyuserid();
//	}
//	@Test(priority=2,invocationCount=3)
//	public void verifyusernameTest()
//	{
//		dash.click();
//		dash.verifyusername();
//	}
//	@Test(enabled= false,priority=3)
//	public void  verifyemailTest()
//	{
//		dash.click();
//		dash.verifyemail();
//	}
//	@Test(enabled= false,priority=4)
//	public void logoutclickTEst()
//	{
//		
//		dash.click();
//		dash.logoutclick();
//	}
	@AfterMethod
	public void after()
	{
		driver.close();
	}
}
