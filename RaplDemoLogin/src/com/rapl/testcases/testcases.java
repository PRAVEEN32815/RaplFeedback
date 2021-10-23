package com.rapl.testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.rapl.login.Feedback;
import com.rapl.login.Login;

public class testcases {
	
	WebDriver Driver;
	Login ObjLogin;
	Feedback ObjFeedback;
	
	@BeforeTest
	public void startWebBrowser(){
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\user\\Downloads\\geckodriver.exe");
		Driver = new FirefoxDriver();
		Driver.get("https://avengers.raplqa.com/");
	}
	
	@Test(priority=0)
	public void performLoginOperation() throws InterruptedException{
		ObjLogin = new Login(Driver);
	    ObjLogin.LoginTestMethods();
	}
	
	@Test(priority=1)
	public void performFeedbackOperation() throws InterruptedException{
		ObjFeedback = new Feedback(Driver);
		ObjFeedback.Feedbackmethod();
	}
}
