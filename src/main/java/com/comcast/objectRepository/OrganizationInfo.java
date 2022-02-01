package com.comcast.objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
/**
 * 
 * @author Harish_K
 *
 */

public class OrganizationInfo {

		WebDriver driver=null;
		
		@FindBy(xpath="//span[@class='dvHeaderText']")
		private WebElement orgHeader;
			
		public OrganizationInfo(WebDriver driver) {
			this.driver=driver;
			PageFactory.initElements(driver, this);
		}

			public WebElement getOrgHeader() {
			return orgHeader;
		}
		
		
}
