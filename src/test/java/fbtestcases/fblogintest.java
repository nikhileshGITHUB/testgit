package fbtestcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


import fbpages.loginpages;


public class fblogintest extends loginpages {

	
	fblogintest logins;
	
	
	@BeforeMethod
	public void befores()
	{
		
		intalizations();
		//initalizations();
		logins = new fblogintest();
		
	}
	@Test
	public void verifytittletest()
	{
		System.out.println(logins.verifytittle());
	}
	@Test
	public void loginfacebooktest() throws InterruptedException
	{
		Thread.sleep(1000);
		logins.loginfacebook();
	}
	@AfterMethod
	public void afters()
	{
		driver.close();
	}
	
}
