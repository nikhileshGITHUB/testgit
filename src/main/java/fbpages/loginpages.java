package fbpages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import fbBase.fbteastbase;

public class loginpages  extends fbteastbase {

	
	@FindBy(xpath="//img[@alt='Facebook']")private WebElement fblogo;
	@FindBy(xpath="//div[text()='Log in to Facebook']")private WebElement logintext;
	@FindBy(xpath="//input[@id='email']")private WebElement email;
	@FindBy(xpath="//input[@id='pass']")private WebElement pass;
	@FindBy(xpath="//button[@name='login']")private WebElement continuelogin;
	
	
	public loginpages()
	{
		PageFactory.initElements(driver, this);
	}
	
	public String verifytittle()
	{
		return driver.getTitle();
	}
	public String verifylogintect()
	{
		return logintext.getText();
	}
	public void loginfacebook() throws InterruptedException
	{
		email.sendKeys("khetmalis7@gmail.com");
		Thread.sleep(1000);
		pass.sendKeys("prince007");
		Thread.sleep(1000);
		continuelogin.click();
		Thread.sleep(1000);
		
		
	}
}
