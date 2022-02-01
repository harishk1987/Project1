package practice;

import org.testng.annotations.Test;

public class PriorityTest {
	@Test(priority = 1)
	public void createCustomerTest() {
		System.out.println("Execute HDFC create Customer Test");
	}
	@Test(priority = 2)
public void modifyCustomerTest() {
	System.out.println("Execute HDFC modify Customer Test");
	
}
	@Test(priority = 3)
public void deleteCustomerTest() {
	System.out.println("Execute HDFC modify Customer Test");
	
}
}
