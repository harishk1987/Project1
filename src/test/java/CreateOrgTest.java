import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class CreateOrgTest {

	public static void main(String[] args) throws IOException   {
		
		//s1 read property file
		FileInputStream fi= new FileInputStream("./data/CommonData.properties");
		//S2create obj file
		Properties hkobj= new Properties();
		hkobj.load(fi);
		//S3: Read the data using getProperities
		String URL= hkobj.getProperty("url");
		String BROWSER= hkobj.getProperty("browser");
		String USERNAME= hkobj.getProperty("username");
		String PWD= hkobj.getProperty("password");
		WebDriver driver=new ChromeDriver();
		driver.get(URL);
		driver.findElement(By.name("user_name")).sendKeys(USERNAME);
		driver.findElement(By.name("user_password")).sendKeys(PWD);
		driver.findElement(By.id("submitButton")).click();
		
		// S4: Logout
		Actions act=new Actions(driver);
		act.moveToElement(driver.findElement(By.xpath("//img[@src='themes/softed/images/user.PNG']")));
		driver.findElement(By.linkText("Sign Out"));
		
		
		

	}

}
