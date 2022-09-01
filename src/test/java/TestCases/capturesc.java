package TestCases;

import java.io.IOException;
import java.time.Duration;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


import Base.TestBAse;
import page.LoginPage;
import utility.Screenshotcapture;

public class capturesc extends TestBAse{

	LoginPage login;
	
	
	@BeforeMethod
	public void before() throws Exception 
	{
		
		initalization();
		login = new LoginPage();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}
	
@Test
	public void verifytitleTest()
	{
		String exptitle ="1Kite - Zerodha's fast and elegant flagship trading platform";
		String acttitle = login.verifytittle();
		Assert.assertEquals(acttitle,exptitle, "title right or wrong?" );
		System.out.println("hello");
	}
	
	
	@Test
	public void verifylabeltest()
	{
		String actlabel =login.verifylabel();
		//Assert.assertTrue(false);
		Assert.assertEquals(actlabel, "1Login to Kite");
	}
	
	
	@AfterMethod
	public void exit(ITestResult it) throws IOException
	{
		if(ITestResult.FAILURE==it.getStatus())
		{
			Screenshotcapture.capturescfailed(driver, it.getName());;
		}
		driver.quit();
	}
	
}
