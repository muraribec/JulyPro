package com.qa.facebook.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.facebook.base.BasePage;

public class LoginPage extends BasePage{
	
	//1.PageFactory ---- page Object
	
	@FindBy(id="email")
	WebElement emailId;
	
	@FindBy(id="pass")
	WebElement pwd;
	
	@FindBy(id="loginbutton")
	WebElement loginBtn;
	
	//2.CReate constructor
	
	public LoginPage(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	//3.memeber function/ Actions
	public void doLogin(String username,String password){
		emailId.sendKeys(username);
		pwd.sendKeys(password);
		loginBtn.click();
	}
	
	public String getLoginPageTitle(){
		
	return	driver.getTitle();
	}
	
	
	
	
	
	
	
	
	
	
	
	

}
