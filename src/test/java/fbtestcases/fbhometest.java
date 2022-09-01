package fbtestcases;

import org.junit.After;
import org.junit.Before;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


import fbpages.fbhomepage;


public class fbhometest extends fbhomepage {
  fbhometest home;
  fblogintest logins;
	
	@BeforeMethod
	public void beforess() throws InterruptedException
	{
		intalizations();
		Thread.sleep(2000);
		logins = new fblogintest();
	
		home = new fbhometest();
		logins.loginfacebook();
		Thread.sleep(1000);
	}
	@Test
	public void fbnametextTest()
	{
		System.out.println(home.fbnametext());
}
	@Test
	public void logodisplayTest()
	{
	System.out.println(home.logodisplay());
	}

	@Test
	public void  mesgtextTest() throws InterruptedException
	{
		Thread.sleep(1000);
		home.clickmsg();
		Thread.sleep(1000);
		System.out.println(home.mesgtext());
	}
	@AfterMethod
	public void afterss()
	{
		driver.close();
	}
	
}
