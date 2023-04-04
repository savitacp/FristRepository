package com.SMS_GenericUtility;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ListenerImplementation implements ITestListener {
	
	ExtentReports report;
	ExtentTest test;

	public void onTestStart(ITestResult result) {
		
		//execution starts from here
				String MethodName = result.getMethod().getMethodName();
				test = report.createTest(MethodName);
				Reporter.log(MethodName+"----->Testscript execution started");
		
	}

	public void onTestSuccess(ITestResult result) {
		String MethodName = result.getMethod().getMethodName();
		test.log(Status.PASS, MethodName+"------>Passed");//for the extent report
		Reporter.log(MethodName+"------->Testscript execution successfull");//for testing reporter
	
	}

	public void onTestFailure(ITestResult result) {
		
		//String failScript = result.getMethod().getMethodName();
		//String fs = failScript + new JavaUtility().getSystemDate();
		
		EventFiringWebDriver edriver = new EventFiringWebDriver(BaseClass.sdriver);
		File src = edriver.getScreenshotAs(OutputType.FILE);
		File dst = new File(".\\Screenshot\\faildscript.png");
		try {
			FileUtils.copyFile(src, dst);
		}catch(IOException e) {
			
			e.printStackTrace();
			
		}
		
		String str = dst.getAbsolutePath();
		test.addScreenCaptureFromPath(str);
		test.log(Status.FAIL, result.getThrowable());
	}

	public void onTestSkipped(ITestResult result) {
		String MethodName = result.getMethod().getMethodName();
		test.log(Status.SKIP, MethodName+"--------->skiped");
		test.log(Status.SKIP, result.getThrowable());
		Reporter.log("TestScript execution skippede");
		
		
		
	}

	public void onStart(ITestContext context) {
		
		//create html report
		ExtentSparkReporter htmlreport = new ExtentSparkReporter("./ExtentReporter/report.html");
		htmlreport.config().setDocumentTitle("STUDENT MANAGEMENT SYSTEM");
		htmlreport.config().setTheme(Theme.DARK);
		htmlreport.config().setReportName("SMS");
		
		
		report = new ExtentReports();
		report.attachReporter(htmlreport);
		report.setSystemInfo("Base_Browser","chrome");
		report.setSystemInfo("OS","Windows");
		report.setSystemInfo("Base_URL","https://localhost:8888");
		report.setSystemInfo("Reporter Name","Savitha");
		
		}

	public void onFinish(ITestContext context) {
		//consolidate the report
		report.flush();
		
	}
	
	
	

}
