package steps;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass extends AbstractTestNGCucumberTests {
	
	public static ChromeDriver driver;
	
	@BeforeMethod
	public void beforeMethod() {
	
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	driver.get("http://leaftaps.com/opentaps");
	driver.manage().window().maximize();
	
	driver.findElement(By.xpath("//input[@id='username']")).sendKeys("DemoSalesManager");
	driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
	driver.findElement(By.xpath("//input[@type = 'submit']")).click();
	driver.findElement(By.linkText("CRM/SFA")).click();

	}
	
	/*@AfterMethod
	
	public void afterMethod()
	{
		driver.close();
	}
	*/

}
