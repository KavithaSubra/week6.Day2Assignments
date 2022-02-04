package steps;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Login extends BaseClass{
	
/*	public ChromeDriver driver;
	@Given("Launch the browser")
	public void launchBrowser() 
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
	}
	@Given("Load the application url")
	public void loadURL()
	{
		driver.get("http://leaftaps.com/opentaps/");
	}*/
	
	@Given("Enter username as {string}")
	public void enterUserName(String userName)
	{
		driver.findElement(By.id("username")).sendKeys(userName);
	}
	@Given("Enter password as {string}")
	public void enterPassword(String pwd)
	{
		driver.findElement(By.id("password")).sendKeys(pwd);
	}
	@When("Click on Login button")
	public void clickLogin()
	{
		driver.findElement(By.className("decorativeSubmit")).click();
	}
	@Then("Homepage should be displayed")
	public void verifyLogin()
	{
		String title =driver.getTitle();
		if(title.contains("Leaftaps") )
		{
			System.out.println("Login is successful");
		}
		else
		{
			System.out.println("Login is not successful");
		}
	}
	
}
