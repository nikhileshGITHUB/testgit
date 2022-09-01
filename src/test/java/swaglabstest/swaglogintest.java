package swaglabstest;


import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import swaglabspage.swagloginpage;

public class swaglogintest extends swagloginpage{
	
	
	 swagloginpage Login ;
	
	@BeforeMethod
	public void before() throws InterruptedException
	{
		Thread.sleep(1000);
		initalization();
		Login = new swagloginpage();
	
	}
	
	@Test
	public void verifylogotest()
	{
		
		System.out.println(Login.verifylogo());
	}
	@Test
	public void checklogin() throws InterruptedException
	{
		Login.login();
	}
	@AfterMethod
	public void  after()
	{
		driver.close();
	}

}
