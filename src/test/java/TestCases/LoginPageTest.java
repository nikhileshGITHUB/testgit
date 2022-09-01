package TestCases;



import java.time.Duration;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.TestBAse;
import page.LoginPage;

public	class	LoginPageTest	extends	TestBAse	{
	LoginPage login;
	
	
	@BeforeMethod
	public void before() throws Exception 
	{
		
		initalization();
		login = new LoginPage();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}
	

	
	@Test
	public void zerodhalogintest() throws Exception{
		
		Thread.sleep(1000);
		login.zerodhalogin();
		
		
	}
	@Test
public void verifytitleTest()
	{
		String exptitle ="Kite - Zerodha's fast and elegant flagship trading platform";
		String acttitle = login.verifytittle();
		Assert.assertEquals(acttitle,exptitle, "title right or wrong?" );
	
		System.out.println("hello");
	}
	
	
	@Test
	public void verifylabeltest()
	{
		String actlabel =login.verifylabel();
		//Assert.assertTrue(false);
		Assert.assertEquals(actlabel, "Login to Kite");
	}
	
	@Test
	public void verifylogoTest()
	{	
		boolean result = login.verifylogo();
		Assert.assertEquals(result, true);
	}
	@AfterMethod
	public void after()
	{
		
		driver.quit();
	}
	
	
}

