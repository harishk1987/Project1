package practice;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CreateOrggTest {
	@BeforeClass
	public void configBC() {
		System.out.println("Lauch Browser");
	}
	@AfterClass
	public void configAC() {
		System.out.println("quit Browser");
	}
	@BeforeMethod
	public void configBM() {
		
		System.out.println("=============login==================");
	}
	@AfterMethod
	public void configAM() {
		System.out.println("=============logout==============");
	
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
