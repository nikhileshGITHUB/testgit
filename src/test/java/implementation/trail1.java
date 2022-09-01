package implementation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public  class trail1 {

	
	 WebDriver d;
	  @Test
	  public void f() throws InterruptedException {
		  d.navigate().to("https://opensource-demo.orangehrmlive.com/");
		    d.findElement(By.id("txtUsername")).sendKeys("admin23");
		    Thread.sleep(1000);
		    WebElement username =d.findElement(By.id("txtUsername"));
		    username.clear();
		    
		    Thread.sleep(1000);
		    d.findElement(By.id("txtUsername")).sendKeys("Admin");
		    d.findElement(By.id("txtPassword")).sendKeys("admin123");
		    d.findElement(By.name("Submit")).click();
		   d.findElement(By.partialLinkText("Welcome")).click();
		    Thread.sleep(3000);
		    WebElement logout = d.findElement(By.xpath("//a[text()='Logout']"));
		    logout.click();
		
	  }
	  @BeforeMethod
	  public void beforeMethod() {  System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
	  d = new ChromeDriver();
	  }

	  @AfterMethod
	  public void afterMethod() {
		  d.close();
	  }
}
