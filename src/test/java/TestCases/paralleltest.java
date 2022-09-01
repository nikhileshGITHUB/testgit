package TestCases;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class paralleltest {

	public static WebDriver driver;
	
	@Test
	public void openfb()
	{
		//System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		  WebDriverManager.chromiumdriver().setup();
		  driver.manage().window().maximize();
		  driver.get("https://www.facebook.com/");
		  driver.close();
	}
	@Test
	public void opengoggle()
	{
		//System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
		// driver = new ChromeDriver();
		  WebDriverManager.chromiumdriver().setup();
		  WebDriver driver = new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.get("https://www.google.com/");
		  driver.close();
		
	}
	@Test
	public void openrediff()
	{
		//System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
		 driver = new ChromeDriver();
		  WebDriverManager.chromiumdriver().setup();
		  driver.manage().window().maximize();
		  driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
		  driver.close();
		
	}
}
