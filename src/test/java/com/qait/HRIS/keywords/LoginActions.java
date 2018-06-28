package com.qait.HRIS.keywords;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginActions {
	
	WebDriver driver;
	
	public LoginActions(WebDriver driver) {
		this.driver = driver;
	}
	
	public void clickLogin()
	{
		driver.findElement(By.cssSelector("a[href='#panel1']")).click();
		driver.findElement(By.cssSelector("input[type='text']")).sendKeys("Chetangufyfyhotri");
		driver.findElement(By.cssSelector("input[type='password']")).sendKeys("cfgh1#");
		driver.findElement(By.cssSelector("input[type='submit']")).click();
		//driver.findElement(By.cssSelector("a[href='#panel1']")).click();
		//System.out.println(driver.findElement(By.cssSelector("div[class*='alert']>div")).getText());
	}
	
	public void loginWithWrongCredentials()
	{
		driver.findElement(By.cssSelector("a[href='#panel1']")).click();
		driver.findElement(By.cssSelector("input[type='text']")).sendKeys("anas");
		driver.findElement(By.cssSelector("input[type='password']")).sendKeys("ghfg");
		driver.findElement(By.cssSelector("input[type='submit']")).click();
		driver.findElement(By.cssSelector("a[href='#panel1']")).click();
		System.out.println(driver.findElement(By.cssSelector("div[class*='alert']>div")).getText());
	}
	
	
	
	public void timeSheet()
	{
		driver.findElement(By.cssSelector("span[class='icon_size time']")).click();
	}


		
	}


		
	

