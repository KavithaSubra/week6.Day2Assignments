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

public class DuplicateLead extends BaseClass{
	
	@Then("Go to Duplicate Lead page for verification")
	public void duplicateVerify() {	
		String title = driver.getTitle();
		SoftAssert sAssert = new SoftAssert();
		sAssert.assertEquals(title,"Duplicate Lead | opentaps CRM");
		driver.findElement(By.name("submitButton")).click();
}
}







