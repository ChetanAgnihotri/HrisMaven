package com.qait.HRIS.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.qait.HRIS.keywords.LoginActions;

public class LoginPageTest {

	WebDriver driver;
	//LoginActions obj = new LoginActions(driver);

	@BeforeTest
	public void launchBrowser() {
		String driverPath = System.getProperty("user.dir") + "\\src\\test\\resources\\chromedriver.exe";
		System.out.println("driver path===" + driverPath);
		System.setProperty("webdriver.chrome.driver", driverPath);
		driver = new ChromeDriver();
		String url = "https://hris.qainfotech.com/login.php";
		driver.get(url);
		driver.manage().window().maximize();
	}
	
	@Test(priority = 0)
	public void loginWithWrongCredentials() {
		LoginActions obj = new LoginActions(driver);
		obj.loginWithWrongCredentials();
	}

	@Test(priority = 1)
	public void log() {
		LoginActions obj = new LoginActions(driver);
		obj.clickLogin();
	}	

	@Test(priority = 2)
	public void timeSheet() {
		LoginActions obj = new LoginActions(driver);
		obj.timeSheet();
	}

}
