package practice;

import org.testng.annotations.Test;

public class CustomerTest {
	@Test(groups = "st")
	public void createCustomerTest() {
		System.out.println("Execute HDFC create Customer Test");
	}
@Test(groups ="rt" )
public void modifyCustomerTest() {
	System.out.println("Execute HDFC modify Customer Test");
	
}
@Test(groups = "rt")
public void deleteCustomerTest() {
	System.out.println("Execute HDFC modify Customer Test");
	
}
	
}
