package page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.TestBAse;

public	class	LoginPage	extends	TestBAse	{
	
	//Object Resositary
	
	@FindBy(xpath="//input[@id='userid']") private WebElement useridtextbox;
	@FindBy(xpath="//input[@type='password']")private WebElement password ;
	@FindBy(xpath="//button[@type='submit']")private WebElement submit;
	@FindBy(xpath="//input[@id='pin']")private WebElement PIN;
	@FindBy(xpath ="//button[@type='submit']")private WebElement Continue;
	@FindBy(xpath="//img[@alt='Kite']")private WebElement logo;
	@FindBy(xpath="//img[@alt='Zerodha']") private WebElement zerodhalogo;
	
	@FindBy(xpath="	//h2[text()='Login to Kite']") private WebElement label;
	//h2[text()='Login to Kite']
	
	public LoginPage()
	{
		
		PageFactory.initElements(driver,this);
	}
	public String verifytittle(){
		
		return driver.getTitle();
	}
	
	public String verifylabel()
	{
		return label.getText();
	}
	public boolean verifylogo()
	{
		return logo.isDisplayed();
	}
	public void zerodhalogin() throws Exception
	
	{
		useridtextbox.sendKeys(readexcelfile(0, 1));
		//Thread.sleep(1000);
		password.sendKeys(readexcelfile(0, 2));
		submit.click();
	//	Thread.sleep(1000);
		PIN.sendKeys(readexcelfile(0, 3));
		Continue.click();
	}
	
	
}



