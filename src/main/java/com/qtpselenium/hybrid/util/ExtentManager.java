package com.qtpselenium.hybrid.util;

import java.io.File;
import java.util.Date;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.ChartLocation;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentManager {
    
    private static ExtentReports extent;
    public static String screenshotFolderPath;
    
  
    
    public static ExtentReports getInstance(String reportPath) {
    	if (extent == null){
    		String fileName="Report.html";
    		String folderName="ExtReports";
    		//Date d = new Date();
    		
    		
    		//String folderName=d.toString().replace(":", "_").replace(" ", "_");
    		
    		// directory of the report folder
    		new File(reportPath+folderName+"\\screenshots").mkdirs();
    		reportPath=reportPath+folderName+"\\";
    		screenshotFolderPath=reportPath+"screenshots\\";
    		System.out.println(reportPath+fileName);
    		createInstance(reportPath+fileName);
    	}
    	
        return extent;
    }
    
   
    
    public static ExtentReports createInstance(String fileName) {
        ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter(fileName);
        System.out.println(fileName);
        htmlReporter.config().setTestViewChartLocation(ChartLocation.BOTTOM);
        htmlReporter.config().setChartVisibilityOnOpen(true);
        htmlReporter.config().setTheme(Theme.DARK);
        htmlReporter.config().setDocumentTitle("Reports");
        htmlReporter.config().setEncoding("utf-8");
        htmlReporter.config().setReportName("Reports - Automation Testing");
        
        extent = new ExtentReports();
        extent.attachReporter(htmlReporter);
        
        return extent;
    }
}