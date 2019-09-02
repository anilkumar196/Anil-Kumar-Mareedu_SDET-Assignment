package com.OHRM.testcases;

import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import com.OrangeHRM.pageobjects.OrangeHRM_login_page;
import com.qa.base.TestBase;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class LoginTest extends TestBase{
	
	OrangeHRM_login_page LoginPage;
	
//	public LoginTest() {
//		super();
//	}
  @Test(priority=1)
  public void OHRMlogin_test() {
	  LoginPage = new OrangeHRM_login_page();
	//  String un = prop.getProperty("username");
	 // String pwd = prop.getProperty("password");
	  //LoginPage.login(un, pwd);
	  LoginPage.loginhrm();
	  
  }
  
  @Test(priority=2)
  public void OHRM_Homepage_test() {
	  
	  Assert.assertEquals(driver.getTitle(), "OrangeHRM");
  }
  @BeforeTest
  public void browser_setup() {
	  System.out.println("browser initialization");
	  initialization();
	  	  
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("closing browser");
	  driver.close();
  }

}
