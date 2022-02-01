package com.comcast.objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {
	/**
	 * 
	 * @author Harish_K
	 *
	 */
	
		WebDriver driver= null;
		
		@FindBy (name="user_name")
		private WebElement userNameEdt;
		

		@FindBy (name="user_password")
		private WebElement passwordEdt;
		
		@FindBy (id="submitButton")
		private WebElement loginBtn;
		
		public Login(WebDriver driver) {
			this.driver=driver;
			PageFactory.initElements(driver, this);
		}

		
		
		public WebDriver getDriver() {
			return driver;
		}



		public WebElement getUserNameEdt() {
			return userNameEdt;
		}



		public WebElement getPasswordEdt() {
			return passwordEdt;
		}



		public WebElement getLoginBtn() {
			return loginBtn;
		}



		/**
		 * this method is used to login with credentials
		 * @param userName
		 * @param password
		 */
		public void loginToPage(String userName, String password) {
			userNameEdt.sendKeys(userName);
			passwordEdt.sendKeys(password);
			loginBtn.click();

	}
	}

