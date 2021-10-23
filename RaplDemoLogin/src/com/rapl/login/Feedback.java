package com.rapl.login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Feedback {
	
	WebDriver Driver;
	
	@FindBy(xpath = "//a[@app-translate = 'LEARNER.MANAGE']")
	WebElement ManageOption;
	
	@FindBy(xpath = "//a[contains(text(),'Manage Feedback')]")
	WebElement ManageFeedback;
	
	@FindBy(xpath = "//body/app-root[1]/ng-component[1]/main[1]/div[1]/app-manage-feedback[1]/nav[1]/ul[1]/li[2]/a[1]")
	WebElement FeedbackOption;
	
	@FindBy(xpath = "//mat-tab-body/div[1]/ng-datatable-x[1]/div[1]/nav[1]/div[1]/form[1]/div[1]/button[2]")
	WebElement CreateFeedbackButton;
	
	@FindBy(xpath = "//body[1]/app-root[1]/ng-component[1]/main[1]/div[1]/app-manage-feedback[1]/app-feedback[1]/div[1]/div[1]/mat-tab-group[1]/div[1]/mat-tab-body[2]/div[1]/app-create-edit-feedback[1]/div[1]/mat-tab-group[1]/div[1]/mat-tab-body[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/nav[1]/div[1]/mat-form-field[1]/div[1]/div[1]/div[1]/input[1]")
	WebElement SearchTemplateBox;
	
	@FindBy(xpath = "(//div[@class='folder-icon'])[1]")
	WebElement SeriousFeedback;
	
	@FindBy(xpath = "//input[@name='name']")
	WebElement NameTestBox;
	
	@FindBy(xpath = "//textarea[@name='description']")
	WebElement DescriptionTextBox;
	
	@FindBy(xpath = "//input[@placeholder='Tags']")
	WebElement TagsTextBox;
	
	@FindBy(xpath = "//mat-tab-body/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/div[3]/div[1]/div[1]/mat-checkbox[1]/label[1]/span[1]")
	WebElement AcknowledgementCheckBox;
	
	@FindBy(xpath = "//input[@data-placeholder='Due by days']")
	WebElement DueByDaysTextBox;
	
	@FindBy(xpath = "//button[contains(text(),'CREATE')]")
	WebElement CreateButton;
	
	@FindBy(xpath = "//body[1]/app-root[1]/ng-component[1]/main[1]/div[1]/app-manage-feedback[1]/app-feedback[1]/div[1]/div[1]/mat-tab-group[1]/div[1]/mat-tab-body[2]/div[1]/app-create-edit-feedback[1]/div[1]/mat-tab-group[1]/div[1]/mat-tab-body[2]/div[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[1]/label[1]/button[1]")
	WebElement SelectGroupButton;
	
	@FindBy(xpath = "//input[@data-placeholder='Search Group']")
	WebElement SearchGroupTextBox;
	
	@FindBy(xpath = "//tbody/tr[1]/td[1]/div[1]/div[1]")
	WebElement SelectGroupOption;
	
	@FindBy(xpath = "(//div[@class='custom-control custom-checkbox table-custom-checkbox'])[3]")
	WebElement SelectcheckBox;
	
	@FindBy(xpath = "//button[@class = 'btn btn-sm align-middle btn-outline-primary']")
	WebElement IncludeGroupsButton;
	
	@FindBy(xpath = "//div/h5/button[@type='button']")
	WebElement CloseButton;
	
	@FindBy(xpath = "//span[@class='cursor-pointer btn-icon-only']")
	WebElement BackButton;
	
	public Feedback(WebDriver Driver) {
		this.Driver = Driver;
		PageFactory.initElements(Driver, this);
	}
	
	public void Feedbackmethod() throws InterruptedException {
		ManageOption.click();
		Thread.sleep(5000);
		ManageFeedback.click();
		Thread.sleep(3000);
		FeedbackOption.click();
		Thread.sleep(5000);
		CreateFeedbackButton.click();
		Thread.sleep(2000);
		SearchTemplateBox.click();
		Thread.sleep(2000);
		SeriousFeedback.click();
		Thread.sleep(2000);
		NameTestBox.sendKeys("Sample Automation Feedback");
		Thread.sleep(2000);
		DescriptionTextBox.sendKeys("A sample Feedback for Automation");
		Thread.sleep(2000);
		TagsTextBox.sendKeys(" new,old,length,breadth,height");
		Thread.sleep(2000);
		AcknowledgementCheckBox.click();
		Thread.sleep(2000);
		DueByDaysTextBox.sendKeys("5");
		Thread.sleep(2000);
		CreateButton.click();
		Thread.sleep(2000);
		SelectGroupButton.click();
		Thread.sleep(2000);
		SearchGroupTextBox.sendKeys("praveen");
		Thread.sleep(2000);
		SelectGroupOption.click();
		Thread.sleep(2000);
		SelectcheckBox.click();
		Thread.sleep(2000);
		IncludeGroupsButton.click();
		Thread.sleep(6000);
		CloseButton.click();
		Thread.sleep(2000);
		BackButton.click();
		Thread.sleep(2000);
	}
	
}
