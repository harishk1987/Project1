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
public class CreateNewOrganization extends WebDriverUtility {

	
		WebDriver driver=null;
		
		@FindBy(name="accountname")
		private WebElement createOrgBtn;
		
		@FindBy(name="industry")
		private WebElement industryClk;
		
		@FindBy(xpath="(//input[@class=\"crmbutton small save\"])[1]")
		private WebElement saveBtn;
		
		public CreateNewOrganization(WebDriver driver){
			this.driver=driver;
			PageFactory.initElements(driver, this);
		}

		public WebElement getCreateOrgBtn() {
			return createOrgBtn;
		}

		public WebElement getIndustryClk() {
			return industryClk;
		}

		public WebElement getSaveBtn() {
			return saveBtn;
		}
		
		/**
		 * this method is used to create organization
		 * @param driver
		 * @param OrgName
		 */
		public void CreateNewOrg(String OrgName) {
			createOrgBtn.sendKeys(OrgName);
			saveBtn.click();
		}
		
		/**
		 * this method is used to create organization
		 * @param driver
		 * @param OrgName
		 */
		public void CreateNewOrg(String OrgName, String industrytype) {
			createOrgBtn.sendKeys(OrgName);
			select(industryClk, industrytype);
			saveBtn.click();
		}
		

}
