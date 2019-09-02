package stepDefinitions;


import com.OrangeHRM.pageobjects.OrangeHRM_login_page;
import com.qa.base.TestBase;
import cucumber.api.java.en.*;
import junit.framework.Assert;

public class LoginStepDefinition extends TestBase{
	
	OrangeHRM_login_page LoginPage;
	@Given("^web browser is initialized$")
	public void web_browser_is_initialized() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		System.out.println("browser initialization");
		initialization();
			
	}

	@When("^user enters correct username and password$")
	public void user_enters_correct_username_and_password() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		LoginPage = new OrangeHRM_login_page();
		LoginPage.loginhrm();
		System.out.println("user able to login successfully");
	}

	@Then("^user should be successfully login to HRM home page$")
	public void user_should_be_successfully_login_to_HRM_home_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		Assert.assertEquals("OrangeHRM", driver.getTitle());
		driver.close();
		
	}

}
