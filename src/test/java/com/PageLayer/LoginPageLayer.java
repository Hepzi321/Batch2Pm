package com.PageLayer;

import org.openqa.selenium.By;

import baseTest.BaseClassTest;

public class LoginPageLayer extends BaseClassTest{
	
// by location
	
	By uname = By.id("email");
	By pwd = By.id("pass");
	By login = By.name("login");
	By forget_pwd = By.linkText("Forgotten password?");
	
// Actions or methods
	
	
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
