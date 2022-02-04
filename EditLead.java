package steps;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.asserts.SoftAssert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class EditLead extends BaseClass{
	
	/*@When("Click on {string} link")
	public void clickLink(String link)
	{
		driver.findElement(By.linkText(link)).click();
	}*/
	@And("Click on {string} Link")
	public void clickPageLink(String pageLink)
	{
		driver.findElement(By.linkText(pageLink)).click();
	}
	@And("Click {string} tab")
	public void clickTab(String tab)
	{
		driver.findElement(By.xpath("//span[text()='"+tab+"']")).click();
	}
	@And("Give PhoneNumber {string}")
	public void enterPhone(String phoneNo)
	{
		driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys(phoneNo);

	}
	@And("Click {string} button")
	public void findLeads(String buttonName)
	{
		driver.findElement(By.xpath("//button[text()='"+buttonName+"']")).click();
	}
	@And("Click first lead")
	public void clickFirst() throws InterruptedException
	{
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
	}
	@io.cucumber.java.en.Then("Go to {string} page")
	public void checkPage(String pageName)
	{
		String screenName = driver.getTitle();
		SoftAssert s = new SoftAssert();
		s.assertEquals(screenName, pageName);
	}
	@When("Click {string} Link")
	public void clickEdit(String hyperLink)
	{
		driver.findElement(By.linkText(hyperLink)).click();
	}
	@And("Update companyname as {string}")
	public void updateCompName(String compName)
	{
		WebElement coName = driver.findElement(By.id("updateLeadForm_companyName"));
		coName.clear();
		coName.sendKeys(compName);
	}
	@Then("Click submit button")
	public void clickSubmit()
	{
	driver.findElement(By.name("submitButton")).click();
	}
}
