package com.pages;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AccountsPage {
	
	private WebDriver driver;
	private By accountSections=By.cssSelector("div#center_column span");
	
//	locators
	
//	constructor
	public AccountsPage(WebDriver driver) {
		this.driver=driver;	
	}
	
//	Actions
	public String getAccountsPageTitle() {
		return driver.getTitle();
		
	}
	
	public int getAccountSectionCount() {
		
		return driver.findElements(accountSections).size()-1;
		
	}
	
	public List<String> getAccountsSectionsList() {
		
		List<String> accountList= new ArrayList<>();
		List<WebElement> accountHeaderList=driver.findElements(accountSections);
	    for (WebElement e : accountHeaderList) {
	    	
	    	String text=e.getText();
	    	System.out.println(text);
	    	accountList.add(text);
			
		}
	    return accountList;
	    
	}
	
	

}
