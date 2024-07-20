package com.pages;

import org.openqa.selenium.By;

import baseTest.BaseClassTest;

public class LoginPage extends BaseClassTest{
	
	//by Locators
	By uname = By.id("email");
	By pwd = By.id("pass");
	By login = By.name("login");
	By forget_pwd = By.linkText("Forgotten password?");
	
	
	//Action and perform
	public boolean checkLink()
	{
		boolean status = driver.findElement(forget_pwd).isDisplayed();
		return status;
	}
	
	public void do_login()
	{
		driver.findElement(uname).sendKeys("Oranium");
		driver.findElement(pwd).sendKeys("Tech");
		driver.findElement(login).click();
	}

}
