package com.org.amazon.testCases;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.org.amazon.pageObjects.searchObjects;
import com.org.amazon.utilities.amazonBaseClass;

public class searchTest extends amazonBaseClass{
	
	searchObjects search;
	FileInputStream prptyFile;
	Properties prpty;
	
	@BeforeClass
	public void oneTimeSetup() throws IOException
	{		
		 search=new searchObjects(driver);
		 prpty = new Properties();
		 prptyFile = new FileInputStream("C:\\Users\\kamala ratnam\\SeleniumFramework\\Demo_Test\\src\\test\\java\\com\\org\\amazon\\testData\\serachTestData.properties");
	     prpty.load(prptyFile);
	}
	
	@BeforeMethod
	public void btm() throws InterruptedException
	{
		driver.get("https://www.amazon.in/");
		String expectedTitle="Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in";
		String actualTitle=driver.getTitle();
		Assert.assertEquals(actualTitle, expectedTitle);
		Thread.sleep(100);
	}
	
	@Test
	public void testVerifySearchFuntionality()
	{		
		search.enterValue(prpty.getProperty("searchText"));
		search.clickSearchButton();
	}
	
}
