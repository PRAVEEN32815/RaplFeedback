package com.rapl.login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {
	
	WebDriver Driver;
	
	@FindBy(name="email")
	WebElement emailAddress;
	
	@FindBy(xpath="(//button[@type = 'submit'])[1]")
	WebElement nextButton;
	
	@FindBy(name="password")
	WebElement password;
	
	@FindBy(xpath="(//button[@type='submit'])[1]")
	WebElement submitButton;
	
	public Login(WebDriver Driver){
		this.Driver = Driver;
		PageFactory.initElements(Driver, this);
	}
	
	public void LoginTestMethods() throws InterruptedException {
		
		String Email = "praveen@linkstreet.in";
		String Password = "Admin@123";
		
		Thread.sleep(3000);
		emailAddress.clear();
		emailAddress.sendKeys(Email);
		nextButton.click();
		Thread.sleep(3000);
		password.sendKeys(Password);
		submitButton.click();
		Thread.sleep(3000);
	}
	
}
