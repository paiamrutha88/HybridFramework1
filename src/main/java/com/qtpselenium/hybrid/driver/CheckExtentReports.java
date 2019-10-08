/*
 * Extent reports practice..not part of framework
 */

package com.qtpselenium.hybrid.driver;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.qtpselenium.hybrid.util.ExtentManager;

public class CheckExtentReports {

	@Test
	public void doLogin()
	{
		// TODO Auto-generated method stub
		
		ExtentReports rep=ExtentManager.getInstance("D:\\Selenium Online Training\\Projects\\HybridFramework\\ExtentReports\\");
		ExtentTest test=rep.createTest("login test");
		test.log(Status.INFO, "Started logging in");
		System.out.println("login page....");
		
		//test.log(Status.ERROR, "some issue..");
		
		System.out.println("Home page....");

		//test.log(Status.FAIL, "failed");

		System.out.println("Home page....");
		
		test.log(Status.DEBUG, "debugging");
		
		test.log(Status.FATAL, "fatal");
		
		test.log(Status.PASS, "Pass");
		
		test.log(Status.SKIP, "skip");
		
		test.log(Status.WARNING, "warning"); 
		
		rep.flush();//writes everything to html file
	}

}
