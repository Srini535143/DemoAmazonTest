package com.org.amtest.search;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class searchTest {
	
	@Test
	public void sum() throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\kamala ratnam\\SeleniumFramework\\Demo_Test\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");	
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Laptops");
		driver.findElement(By.id("nav-search-submit-button")).click();
		Thread.sleep(100);
		
		//driver.close();
		
	}
	

}
