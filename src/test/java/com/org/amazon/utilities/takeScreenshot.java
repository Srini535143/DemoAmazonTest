package com.org.amazon.utilities;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;



public class takeScreenshot implements ITestListener{

	 private WebDriver driver;
		
		// When Test case get failed, this method is called.
		public void onTestFailure(ITestResult Result) 					
	    {	
			this.driver = amazonBaseClass.driver;
			System.out.println("The name of the testcase failed is :"+Result.getName());	
			if (!Result.isSuccess()) {
				 File imageFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
				String failureImageFileName = Result.getMethod().getMethodName()+ new SimpleDateFormat("MM-dd-yyyy_HH-ss").format(new GregorianCalendar().getTime())
				                + ".png";
				        File failureImageFile = new File(System.getProperty("user.dir")+"\\target\\"+failureImageFileName);
				 try {
					FileUtils.copyFile(imageFile, failureImageFile);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}
	    
	    
		
			System.out.println("*******Screenshot captured********");
	    }	
		// When Test case get Skipped, this method is called.		
	    public void onTestSkipped(ITestResult Result)					
	    {		
	    System.out.println("The name of the testcase Skipped is :"+Result.getName());					
	    }		
	 // When Test case get Started, this method is called.		
	    public void onTestStart(ITestResult Result)					
	    {		
	    System.out.println(Result.getName()+" test case started");					
	    }		

	    // When Test case get passed, this method is called.		
	    public void onTestSuccess(ITestResult Result)					
	    {		
	    	this.driver = amazonBaseClass.driver;
			System.out.println("The name of the testcase failed is :"+Result.getName());	
			if (Result.isSuccess()) {
				 File imageFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
				String failureImageFileName = Result.getMethod().getMethodName()+ new SimpleDateFormat("MM-dd-yyyy_HH-ss").format(new GregorianCalendar().getTime())
				                + ".png";
				        File failureImageFile = new File(System.getProperty("user.dir")+"\\target\\"+failureImageFileName);
				 try {
					FileUtils.copyFile(imageFile, failureImageFile);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
	    System.out.println("The name of the testcase passed is :"+Result.getName());
			}
	    }
		public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
			// TODO Auto-generated method stub
			
		}
		public void onStart(ITestContext context) {
			// TODO Auto-generated method stub
			
		}
		public void onFinish(ITestContext context) {
			// TODO Auto-generated method stub
			
		}		
}
