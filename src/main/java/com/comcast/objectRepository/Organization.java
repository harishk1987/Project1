package com.comcast.objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/*
 * @author Harish_K
 */
public class Organization {

	WebDriver driver = null;
	
	@FindBy(xpath="//img[@alt='Create Organization...']")
	private WebElement createOrgclk;
	
	@FindBy(name= "search_text")
	private WebElement searchClk;
	
	@FindBy(name= "search")
	private WebElement searchNowClk;
	
	
	
	public Organization(WebDriver driver){
		PageFactory.initElements(driver, this);
	}

	
	public WebElement getSearchClk() {
		return searchClk;
	}

	public WebElement getSearchNowClk() {
		return searchNowClk;
	}


	public WebElement getCreateOrgclk() {
		return createOrgclk;
	}
	
	
}
