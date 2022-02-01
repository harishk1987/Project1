package com.comcast.objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.comcast.generalUtliity.WebDriverUtility;
/**
 * 
 * @author Harish_K
 *
 */
public class Home extends WebDriverUtility{
WebDriver driver;
	
	@FindBy(linkText = "Organizations")
	private WebElement organizationLnk;
	
	@FindBy(linkText = "Sign Out")
	private WebElement signOutclk;
	
	@FindBy(xpath="//img[@src='themes/softed/images/user.PNG']")
	private WebElement mousehoverclk;
	
	@FindBy(linkText = "Contacts")
	private WebElement contactLnk;
	
	public Home(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	





	public WebElement getOrganizationLnk() {
		return organizationLnk;
	}




	public WebElement getSignOutclk() {
		return signOutclk;
	}




	public WebElement getMousehoverclk() {
		return mousehoverclk;
	}




	public WebElement getContactLnk() {
		return contactLnk;
	}




	/**
	 * this method is used for mousehovering action
	 * @param driver
	 */
 public void LogOut() {
	 mouseOver(driver, mousehoverclk);
	 getSignOutclk().click();
 }

}
