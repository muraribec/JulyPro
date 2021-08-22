package com.qa.facebook.tests;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.qa.facebook.base.BasePage;
import com.qa.facebook.constants.Constants;
import com.qa.facebook.pages.LoginPage;
import com.qa.facebook.util.ExcelUtil;

public class LoginPageTest {
	BasePage basePage;
	Properties prop;
	WebDriver driver;
	LoginPage loginPage;
	
	//Pre condition
	@BeforeMethod
	public void setUp(){		
		basePage = new BasePage();
		prop=basePage.initialize_Properties();
		driver=basePage.initialize_driver(prop);
		loginPage = new LoginPage(driver);			
	}
	//Test cases
//	@Test
//	public void loginTestWithCredentials(){
//		loginPage.doLogin(prop.getProperty("username"), prop.getProperty("password"));
//	}
//	@Test
//	public void verifyLoginPageTitle(){
//		String title=loginPage.getLoginPageTitle();
//		System.out.println("Login page title is ::"+title);
//		Assert.assertEquals(title, Constants.LOGIN_PAGE_TITLE);
//		}
	
	
	
	
	@DataProvider(name="getContactsData")
	public Object[][] getContactData(){
		Object [][] ContactsData = ExcelUtil.getTestData("Sheet1");
		return ContactsData;
	}
	
	
	@Test(dataProvider="getContactsData")
	public void createNewContactTest(String email,String pwd){
		loginPage.doLogin(email, pwd);
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	//POst condition
	@AfterMethod
	public void tearDown(){
		driver.close();
	}
	
	
	
	
	
	
	
	
	

}
