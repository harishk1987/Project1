package practice;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CreateOrgTest {
	@BeforeMethod
	public void configBM() {
		System.out.println("=============launch browser==============");
		System.out.println("=============login==================");
	}
	@AfterMethod
	public void configAM() {
		System.out.println("=============logout==============");
		System.out.println("=============quit==================");
	}
@Test
public void createOrgTest()
{
	System.out.println("Hi...........");
}
@Test
public void createOrgWithIndustry() {
	System.out.println("Hello..........");
	}
@Test
public void createOrgWithContact() {
	System.out.println("Bye..........");
}
}
