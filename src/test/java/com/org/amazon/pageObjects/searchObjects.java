package com.org.amazon.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.org.amazon.utilities.amazonBaseClass;

public class searchObjects extends amazonBaseClass {
	WebDriver driver;
	
	public searchObjects(WebDriver driver) {
	    this.driver=driver;
	    PageFactory.initElements(driver, this);
	}

	
	@FindBy(id="twotabsearchtextbox")
	public WebElement searchBox;
	
	@FindBy(id="nav-search-submit-button")
	public WebElement searchButton;
	
	public void enterValue(String s) {
		searchBox.sendKeys(s);		
	}
	
	public void clickSearchButton() {
		searchButton.click();
		
	}
	
}
