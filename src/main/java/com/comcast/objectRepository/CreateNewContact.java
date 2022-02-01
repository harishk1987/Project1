package com.comcast.objectRepository;

import org.openqa.selenium.By;
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

public class CreateNewContact extends  WebDriverUtility{
WebDriver driver=null;
	
	@FindBy(name="lastname")
	private WebElement lastnameEdt;
	
	@FindBy(xpath = "//input[@name='account_name']/following-sibling::img")
	private WebElement OrgNameBtn;
	
	@FindBy(xpath="//input[@title='Save [Alt+S]']")
	private WebElement saveBtn;
	
	public CreateNewContact(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}


	
	public WebDriver getDriver() {
		return driver;
	}



	public WebElement getLastnameEdt() {
		return lastnameEdt;
	}



	public WebElement getOrgNameBtn() {
		return OrgNameBtn;
	}



	public WebElement getSaveBtn() {
		return saveBtn;
	}



	/**
	 * this method is used to create contact with org name
	 * @param driver
	 * @param contactName
	 * @param OrgData
	 */
	public void createContact(String contactName,String OrgData) {
	
	lastnameEdt.sendKeys(contactName);
	OrgNameBtn.click();
	switchToWindow(driver, "Accounts");
	Organization op = new Organization(driver);
	op.getSearchClk().sendKeys(OrgData);
	op.getSearchNowClk().click();
	driver.findElement(By.xpath("//a[text()='"+ OrgData +"']")).click();
	switchToWindow(driver, "Contacts");
	saveBtn.click();
		
		
	}
	public void createContact(String contactName) {
		lastnameEdt.sendKeys(contactName);
		saveBtn.click();
	}

}
