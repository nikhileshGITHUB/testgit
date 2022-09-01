package swaglabstest;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import swaglabspage.swagDashboardpage;
import swaglabspage.swagloginpage;

public class swagDashboardtest  extends swagDashboardpage {
	swagloginpage Login ;
	swagDashboardpage dash;

	
	@BeforeMethod
	public void before() throws InterruptedException
	{
		Thread.sleep(1000);
		initalization();
		Login = new swagloginpage();
		dash = new swagDashboardpage();
		Login.login();
		Thread.sleep(1000);
	}
	@Test
	public void verifyaddtocardTest()
	{
		dash.verifyaddtocard();
	}
	@Test
	public void verifyproductnameTest()
	{
		System.out.println(dash.verifyproductname());
	}
	@Test
	public void verifypriceTest()
	{
		System.out.println(dash.verifyprice());
	}
	@Test
	public void verifyaboutTest() throws InterruptedException
	{
		Thread.sleep(1000);
		dash.clickmethod();
		Thread.sleep(2000);
		dash.verifyabout();
	}
	@AfterMethod
	public void after()
	{
		driver.close();
	}
}
