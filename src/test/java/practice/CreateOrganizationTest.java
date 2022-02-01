package practice;

import org.testng.annotations.Test;

import com.comcast.generalUtliity.BaseClass;
import com.comcast.objectRepository.CreateNewOrganization;
import com.comcast.objectRepository.Home;
import com.comcast.objectRepository.Organization;
import com.comcast.objectRepository.OrganizationInfo;

public class CreateOrganizationTest  extends BaseClass{
	@Test
	public void createOrgTest() throws Throwable {
		
		int randomInt = jLib.getRanDomNumber();
		/*test script Data*/
		String orgName = eLib.getDataFromExcel("org", 1, 2) + randomInt;

/*step 2 : navigate to organization*/
        Home homePage = new Home(driver);
        homePage.getOrganizationLnk().click();

/*step 3 : navigate to "create new organization"page by click on "+" image */
        Organization orgPage = new Organization(driver);
        orgPage.getCreateOrgclk().click();

/*step 4 : create organization*/
        CreateNewOrganization cno = new CreateNewOrganization(driver);
        cno.CreateNewOrg(orgName);

/*step 5 : verify the successful msg with org name*/
        OrganizationInfo orginfo = new  OrganizationInfo(driver);
        String  actSuccesfullMg =  orginfo.getOrgHeader().getText();
        if(actSuccesfullMg.contains(orgName)) {
        		System.out.println(orgName + "==>created successfully");
        }
        else {
        		System.out.println(orgName + "==> not created successfully");

        }
	}
}
	

