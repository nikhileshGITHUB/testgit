package TestCases;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class asserta {

	@Test
	public void assert1()
	{
		SoftAssert r = new SoftAssert();
		System.out.println("execution of test 1 started");
		r.assertEquals(200, 201,"check if failed");
		System.out.println("checking 1st assertion");
		r.assertTrue(true, "");
	}
	@Test
	public void assert2()
	{
		
		System.out.println("execution of test 2 started");
		Assert.assertEquals(200, 200,"check if failed");
		System.out.println("checking 2st assertion");
	}
}
