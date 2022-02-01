package com.comcast.organizationtest;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.comcast.generalUtliity.ExcelUtility;
import com.comcast.generalUtliity.FileUtility;
import com.comcast.generalUtliity.JavaUtility;
import com.comcast.generalUtliity.WebDriverUtility;
import com.comcast.objectRepository.Contact;
import com.comcast.objectRepository.ContactInfo;
import com.comcast.objectRepository.CreateNewContact;
import com.comcast.objectRepository.CreateNewOrganization;
import com.comcast.objectRepository.Home;
import com.comcast.objectRepository.Login;
import com.comcast.objectRepository.Organization;
import com.comcast.objectRepository.OrganizationInfo;
public class CreateOrganizationContact {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		JavaUtility jLib = new JavaUtility();
		WebDriverUtility wLib = new WebDriverUtility();
		FileUtility fLib = new FileUtility();
		ExcelUtility eLib = new ExcelUtility();
		
		int randomInt = jLib.getRanDomNumber();
		
		/*common Data*/
		String BROWSER = fLib.getPropertyKeyValue("browser");
		String URL = fLib.getPropertyKeyValue("url");
		
		String USERNAME = fLib.getPropertyKeyValue("username");
		String PASSWORD = fLib.getPropertyKeyValue("password");
		
		
		/*test script Data*/
		String orgName = eLib.getDataFromExcel("org", 1, 2) + randomInt;
		String contactData = eLib.getDataFromExcel("contact", 4, 3)+randomInt;
		
		WebDriver driver =new ChromeDriver();

/*
		
		if(BROWSER.equalsIgnoreCase("chrome"))
		{
			driver=new ChromeDriver();
		}
		else
		{
			driver=new ChromeDriver();
			
		}
		*/
	/*Step 2: login to app*/
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get(URL);
		Login lp=new Login(driver);
		lp.loginToPage(USERNAME, PASSWORD);
		/*Step3 : navigate to Org*/
		
		Home hp=new Home(driver);
		hp.getOrganizationLnk().click();
		/*Step 4 */
		
		Organization op =new Organization(driver);
		op.getCreateOrgclk().click();
		
	
		/*Step 5: Create Org*/
		CreateNewOrganization cnop=new CreateNewOrganization(driver);
		cnop.getCreateOrgBtn().sendKeys(orgName);
		cnop.getSaveBtn().click();
		
		/* Step 6  verify*/
		OrganizationInfo oinfop=new OrganizationInfo(driver);
		wLib.waitForElementVisibility(driver,oinfop.getOrgHeader());
		String actSucMsg=oinfop.getOrgHeader().getText();
		if(actSucMsg.contains(orgName)) {
			System.out.println("Org Created successfully");
			
		}
		else
			
		{
			System.out.println("Org not Created successfully");	
		}
		//navigate to contact page
				hp.getContactLnk().click();
				
				//create contact
				Contact cnc =new Contact(driver);
				cnc.getcreateContactlnk().click();
				
				//create contact with org information
				CreateNewContact ccwo = new CreateNewContact(driver);
				ccwo.createContact(contactData, orgName);
				
					
				//verification of contact with orgdata
				ContactInfo cip = new ContactInfo(driver);
				String actualContactOrg = cip.getContactInfoHdr().getText();
				System.out.println(actualContactOrg);				
				if(actualContactOrg.contains(contactData))
				{
					System.out.println("pass");
				}else
				{
					System.out.println("fail");
				}
				

				//logout
				hp.LogOut();
				
				//close the driver
				driver.quit();

	}

}
