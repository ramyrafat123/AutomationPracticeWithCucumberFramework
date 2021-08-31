package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	
	private WebDriver driver;
	
//	By Loactors:
	
	private By emailId =By.id("email");
	private By password =By.id("passwd");
	private By signInBtn =By.id("SubmitLogin");
	private By forgetPwdLink=By.linkText("Forgot your password?111");
	
//	constructor
	
	public LoginPage(WebDriver driver) {
		
		this.driver=driver;
	}

//	page action
	
	public String getLoginPageTitle() {
		return driver.getTitle();	
	}
	
	public boolean isForgotPwdLinkExist() {
		return driver.findElement(forgetPwdLink).isDisplayed();
		
	}
	public void enterUserName(String username) {
		
		driver.findElement(emailId).sendKeys(username);
		
	}
	
    public void enterPassword(String pwd) {
		
		driver.findElement(password).sendKeys(pwd);
		
	}
    public void clickOnLogin() {
    	driver.findElement(signInBtn).click();	
	}
    
    public AccountsPage dologin(String username, String pwd) {
    	driver.findElement(emailId).sendKeys(username);
    	driver.findElement(password).sendKeys(pwd);
    	driver.findElement(signInBtn).click();	
    	return new AccountsPage(driver);
	}
    
    
    
	
	
	
	
	
	
	
	
	
	
	
	
	
}
