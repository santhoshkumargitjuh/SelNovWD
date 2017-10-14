package utils;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class LearnReport {
	ExtentReports extent;
	ExtentTest test;
	
	@BeforeSuite
	public void startResult() {
		extent = new ExtentReports("./repoter/result.html", false);
	}
	
	@BeforeMethod
	public void startTestCases() {
		test = extent.startTest("TC001_createLead", "Create a new Lead in LeafTaps");
		test.assignCategory("smoke");
		test.assignAuthor("nethaji");
	}
	
	public void repoterStep(String status,String desc) {
		if (status.equalsIgnoreCase("pass")) {
			test.log(LogStatus.PASS, desc);			
		}else if (status.equalsIgnoreCase("fail")) {
			test.log(LogStatus.FAIL, desc);
			throw new RuntimeException();
		} else if (status.equalsIgnoreCase("info")) {
			test.log(LogStatus.INFO, desc);
		}
	}
	
	@AfterMethod
	public void endTestCases() {
		extent.endTest(test);
	}

	@AfterSuite
	public void endResult() {
		extent.flush();
	}



}
