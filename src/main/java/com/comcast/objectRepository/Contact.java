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
public class Contact {

WebDriver driver=null;
	
	@FindBy(xpath = "//img[@title='Create Contact...']")
	private WebElement createContactlnk;
	
	public Contact(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getcreateContactlnk() {
		return createContactlnk;
	}
}
