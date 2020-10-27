package resources;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReporterNg {

   static	ExtentReports extent;
public   static   ExtentReports getReportObject() {
	
	
	 String path = System.getProperty("user.home")+"/reports/eclipse-workspace/E2Eframeworkproject/index.html";
		
		ExtentSparkReporter reporter = new ExtentSparkReporter(path);	
		reporter.config().setReportName("Web Automaton Result");
		reporter.config().setDocumentTitle("Test Result");
		
		extent = new ExtentReports();
		extent.attachReporter(reporter);
		extent.setSystemInfo("Tester", "grace");
		
		
		return extent;
	}
	
}	
	

	
	

