package com.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import baseTest.BaseClassTest;

public class LoginTests extends BaseClassTest{
	
	@Test(priority = 0)

	public void checkforgetpwd_linkExist()
	{
		boolean status = fblogin.checkLink();
		Assert.assertTrue(status);
		
	}
	
	@Test(priority = 1)
	
	public void login()
	{
		fblogin.do_login();
	}
}
