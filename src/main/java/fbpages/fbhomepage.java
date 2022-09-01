package fbpages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import fbBase.fbteastbase;

public class fbhomepage extends fbteastbase{
	
	@FindBy(xpath="//span[text()='Nikhilesh Khetmalis']")private WebElement fbname;
	@FindBy(xpath="//a[@aria-label='Facebook']")private WebElement fblogo;
	@FindBy(xpath="//div[@aria-label='Messenger'][1]")private WebElement msg;
	@FindBy(xpath="//span[text()='Ketan Pawar'][1]")private WebElement msggettext;
	//@FindBy(xpath="//span[text()='Nikhilesh Khetmalis']")private WebElement fbname;

	
	public fbhomepage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public String fbnametext()
	{
		return fbname.getText();
	}
	public boolean logodisplay()
	{
		return fblogo.isDisplayed();
	}
	public void clickmsg()
	{
		msg.click();
	}
	
	public String mesgtext()
{
		return msggettext.getText();
	}
}
