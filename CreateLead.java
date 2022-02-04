package steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CreateLead extends BaseClass{
	
	@When("Click on {string} link")
	public void clickLink(String link)		
			{
		driver.findElement(By.linkText(link)).click();
			}
	
	@Then("{string} page should be displayed")
	public void verifyPage(String page)
	{
		boolean displayed = driver.findElement(By.linkText(page)).isDisplayed();
		/*if(displayed)
		{
			System.out.println(page + " displayed Successfully");
		}
		else
		{
			System.out.println("Failure");
		}*/
		Assert.assertTrue(displayed);
	}
	/*@Given("Click on CRMSFA button")
	public void clickOnCRMSFAButton() {
		driver.findElement(By.linkText("CRM/SFA")).click();
	}
	
	@Given("Click on Leads tab and Create Lead button")
	public void clickOnLeadsTabAndCreateLeadButton() {
		driver.findElement(By.xpath("//a[text()='Leads']")).click();
		driver.findElement(By.xpath("//a[text()='Create Lead']")).click();
	}*/
	
	@Given("Enter companyname as {string}, Forename as {string}, Surname as {string}, Source as {string}, MarketingCampaign as {string}")
	public void enterCompanynameAsForenameAsSurnameAsSourceAsMarketingCampaignAs(String cName, String fName, String lName, String source, String markCampaign) {
		driver.findElement(By.xpath("//input[@id = 'createLeadForm_companyName']")).sendKeys(cName);
		driver.findElement(By.xpath("//input[@id = 'createLeadForm_firstName']")).sendKeys(fName);	
		driver.findElement(By.xpath("//input[@id = 'createLeadForm_lastName']")).sendKeys(lName);
		WebElement source1 = driver.findElement(By.id("createLeadForm_dataSourceId"));
		Select option1 = new Select(source1);
		option1.selectByVisibleText(source);
		WebElement Campaign = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
		Select option2 = new Select(Campaign);
		option2.selectByVisibleText(markCampaign);
	}
	
	@When("Click on Create Lead button")
	public void clickOnCreateLeadButton() {
		driver.findElement(By.name("submitButton")).click();
	}
	
	@Then("View Lead page should be displayed")
	public void verifyViewLead()
	{
		String title =driver.getTitle();
		if(title.contains("View Lead") )
		{
			System.out.println("Able to view the lead successfully");
		}
		else
		{
			System.out.println("Unable to view the lead");
		}
	}

}
