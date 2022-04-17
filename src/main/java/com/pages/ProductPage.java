package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

public class ProductPage {
	private WebDriver driver;
	
//	By Loactors:
	
	
	private By btn_women=By.xpath("//*[@id=\"block_top_menu\"]/ul/li[1]/a");
	private By link_hover_blouses=By.xpath("//*[@id=\"block_top_menu\"]/ul/li[1]/ul/li[1]/ul/li[2]/a");
	
	
//	constructor
	
	public ProductPage(WebDriver driver) {
		
		this.driver=driver;
	}
	
	public ProductDetails clickHoverEveningDresses(WebDriver driver) {
		Actions action = new Actions(driver);
		
		action.moveToElement((WebElement) btn_women).build().perform();
		;
		action.moveToElement((WebElement) link_hover_blouses).build().perform();
		((WebElement) link_hover_blouses).click();
		return PageFactory.initElements(driver, ProductDetails.class);
	}
}
