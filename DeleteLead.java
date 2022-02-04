package steps;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class DeleteLead extends BaseClass{
	
	@When("Click {string} link")
	public void clickAction(String hyperLink)
	{
	
		driver.findElement(By.linkText(hyperLink)).click();
	}
	@Then("Go to View Lead page for verification")
	public void deleteVerify() {	
		String title = driver.getTitle();
		SoftAssert sAssert = new SoftAssert();
		sAssert.assertEquals(title,"My Leads | opentaps CRM");
}
}







