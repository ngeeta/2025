package com.practice.TestNG;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.IAnnotationTransformer;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.ITestAnnotation;

public class MyListener implements IAnnotationTransformer,ITestListener{
	int counter=3;

	@Override
	public void transform(ITestAnnotation testAnnotation, Class testClass, Constructor testConstrutor, Method testMethod)
	{
	if (testMethod.getName().equals("changeInvocationCountOfMethod")) {
	System.out.println("Changing invocation for the following method: " + testMethod.getName());
	testAnnotation.setInvocationCount(counter);

	}

	}
	@Override
	public void onFinish(ITestContext contextFinish) {
	System.out.println("onFinish() : onFinish method finished");

	}

	@Override// before Execution of any method
	public void onStart(ITestContext contextStart) {
	System.out.println("onStart() :method started");
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
	System.out.println("onTestFailedButWithinSuccessPercentage() : Method failed with certain success percentage ::  "+ result.getName());

	}

	@Override
	public void onTestFailure(ITestResult result) {
	System.out.println("onTestFailure() Method failed ::  "+ result.getName());
	
System.out.println("Screnshot done");
	}

	@Override
	public void onTestSkipped(ITestResult result) {
	System.out.println("onTestSkipped() : Method skipped ::  "+ result.getName());

	}

	@Override
	public void onTestStart(ITestResult result) {
	System.out.println("onTestStart() : Method started ::  "+ result.getName());

	}

	@Override
	public void onTestSuccess(ITestResult result) {
	System.out.println("onTestSuccess() : Method passed ::  "+ result.getName());

	}
}
