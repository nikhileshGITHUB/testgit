package swaglabspage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import swaglabsbase.swagbase;

public class swagDashboardpage  extends swagbase {
	
	
	@FindBy(xpath="//button[@name='add-to-cart-sauce-labs-backpack']") private WebElement addtocard;
	@FindBy(xpath="//a[@id='item_4_title_link']//div[@class='inventory_item_name']") private WebElement productname;
	@FindBy(xpath="//div[text()='29.99']") private WebElement price;
	@FindBy(xpath="//button[@id='react-burger-menu-btn']") private WebElement menuclick;
	@FindBy(xpath="//a[@id='about_sidebar_link']") private WebElement aboutclick;
	
	public  swagDashboardpage ()
	{
		PageFactory.initElements(driver, this);
	}
         
	public void verifyaddtocard()
	{
		addtocard.click();
	}
	public String verifyproductname()
	{
		return productname.getText();
	}
	
	public String verifyprice()
	{
		return price.getText();
	}
	public void clickmethod()
	{
		menuclick.click();
	}
	public void verifyabout()
	{
		aboutclick.click();
	}
}
