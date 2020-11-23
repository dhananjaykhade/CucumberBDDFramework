package stepDefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.*;
import pageObjects.LoginPage;

public class steps {

	public WebDriver driver;
	public LoginPage lp;

	@Given("^user navigates to the website (.*)$")
	public void user_navigates_to_the_website(String arg1) throws Throwable {
		try {
			String browserPath = System.getProperty("user.dir") + "\\Drivers\\geckodriver.exe";
			System.setProperty("webdriver.gecko.driver", browserPath);
			
			driver = new FirefoxDriver();
			driver.get(arg1);
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.close();
			lp = new LoginPage(driver);
		} catch (Exception e) {
			System.out.println("******************" + e + "*******************************************");
		}
	}

	@When("^there user logs in through Login Window by using Username as (.*) and Password as (.*)$")
	public void there_user_logs_in_through_Login_Window_by_using_Username_as_and_Password_as(String arg1, String arg2)
			throws Throwable {
		lp.setPassword(arg1);
	}

	@Then("^login must be successful$")
	public void login_must_be_successful() throws Throwable {

	}

}
