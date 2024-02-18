package com.org.amazon.utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class amazonBaseClass {
	public static WebDriver driver;
	
	@BeforeClass
	public void setUp() {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\kamala ratnam\\SeleniumFramework\\Demo_Test\\Drivers\\chromedriver.exe");
	driver=new ChromeDriver();
	}
	
	@AfterClass
	public void tearDown()
	{
		driver.close();
	}
}
