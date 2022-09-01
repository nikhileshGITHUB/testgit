package swaglabspage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import swaglabsbase.swagbase;

public class swagloginpage extends swagbase {
	
	
	@FindBy(xpath="//div[@class='login_logo']")private WebElement loginloggo;
	@FindBy(xpath="//div[@class='bot_column']")private WebElement botcolumn;
	@FindBy(xpath="//input[@placeholder='Username']")private WebElement username;
	@FindBy(xpath="//input[@placeholder='Password']")private WebElement password;
	@FindBy(xpath="//input[@id='login-button']")private WebElement loginbutton;
	//input[@id='login-button']
	
	public swagloginpage()
	{
		PageFactory.initElements(driver, this);
	}
	
	
	public boolean verifylogo()
	{
		return loginloggo.isDisplayed();
	}
	
	public boolean verifybotcolumn()
	{
		return botcolumn.isDisplayed();
	}
	
	
	public void login() throws InterruptedException
	{
		username.sendKeys("standard_user");
		Thread.sleep(1000);
		password.sendKeys("secret_sauce");
		Thread.sleep(1000);
		loginbutton.click();
		Thread.sleep(1000);
	}
	
	
	
	
	

}
