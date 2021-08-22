package com.qa.facebook.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import com.qa.facebook.util.TimeUtil;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BasePage {
	Properties prop;
	public WebDriver driver;
	
	public WebDriver initialize_driver(Properties prop){
		String browserName = prop.getProperty("browser");  //chrome
		
		if(browserName.equals("chrome")){
//			System.setProperty("webdriver.chrome.driver", "location of chrome driver");
//			WebDriver driver=new ChromeDriver();			
			WebDriverManager.chromedriver().setup();
			 driver = new ChromeDriver();  // to launch the chrome browser
		}
		else if (browserName.equals("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			 driver=new FirefoxDriver();	
		}
		else if(browserName.equals("IE")){
			WebDriverManager.iedriver().setup();
			 driver= new InternetExplorerDriver();
		}
		else{
			System.out.println("please check your browser name");
		}
		
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get(prop.getProperty("url"));
		TimeUtil.mediumWait();
		return driver;		
	}
	
	
	public Properties initialize_Properties(){
		
		prop=new Properties();
		
		try {
			FileInputStream ip=new FileInputStream("C:\\Users\\LENOVO PC\\workspace\\Batch6am\\src\\main\\java\\com\\qa\\fcaebook\\configuration\\config.properties");
			try {
				prop.load(ip);
			} catch (IOException e) {
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		return prop;
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
