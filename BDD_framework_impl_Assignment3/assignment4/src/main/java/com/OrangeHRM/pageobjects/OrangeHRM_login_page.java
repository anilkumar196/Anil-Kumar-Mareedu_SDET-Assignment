package com.OrangeHRM.pageobjects;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.base.TestBase;

public class OrangeHRM_login_page extends TestBase{
	
	@FindBy(id="txtUsername")
	WebElement OHRMlogin_userid;
	
	@FindBy(id="txtPassword")
	WebElement OHRMlogin_password;
	
	@FindBy(id="btnLogin")
	WebElement OHRMlogin_loginbtn;
	
	public OrangeHRM_login_page() {
		PageFactory.initElements(driver, this);
	}
	
	public void loginhrm() {
		String un = prop.getProperty("username");
		String pwd = prop.getProperty("password");
		OHRMlogin_userid.sendKeys(un);
		OHRMlogin_password.sendKeys(pwd);
		OHRMlogin_loginbtn.click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		System.out.println("page title is "+driver.getTitle());
	}
		
}
