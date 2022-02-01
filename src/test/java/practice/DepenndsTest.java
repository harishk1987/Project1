package practice;

import org.testng.annotations.Test;

public class DepenndsTest {
@Test(groups = "st")
	public void createCustomerTest() {
		System.out.println("Execute HDFC create Customer Test");
		int arr[]= {1,2,3};
		System.out.println(arr[1]);
	}
	@Test(dependsOnMethods ="createCustomerTest" )
public void modifyCustomerTest() {
	System.out.println("Execute HDFC modify Customer Test");
	
}
	@Test(dependsOnMethods ="modifyCustomerTest" ,groups ="rt" )
public void deleteCustomerTest() {
	System.out.println("Execute HDFC modify Customer Test");
	
}

}
