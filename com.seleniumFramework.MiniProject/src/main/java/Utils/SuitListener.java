package Utils;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.IAnnotationTransformer;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.IConfigurationAnnotation;
import org.testng.annotations.ITestAnnotation;

import Base.BaseTest;


public class SuitListener implements ITestListener,IAnnotationTransformer {

	@Override
	public void onTestFailure(ITestResult result) {
		String filename=System.getProperty("user.dir")+File.separator+"screenShots"+File.separator+result.getMethod().getMethodName();
		TakesScreenshot ts= (TakesScreenshot)BaseTest.driver;
		File src=ts.getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(src, new File(filename+".png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	@Override
	public void transform(ITestAnnotation annotation, Class testClass, Constructor testConstructor,
			Method testMethod) {
		annotation.setRetryAnalyzer(RetryAnalyser.class);}
}
