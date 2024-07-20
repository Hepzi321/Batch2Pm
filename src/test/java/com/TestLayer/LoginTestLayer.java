package com.TestLayer;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

import baseTest.BaseClassTest;

public class LoginTestLayer extends BaseClassTest{
	
	@Test(priority = 0)
	public void checkforgetpwd_linkExist()
	{
		boolean status = fblog.checkLink();
		Assert.assertTrue(status);
		
	}
	
	@Test(priority = 1)
	public void login()
	{
		fblog.do_login();
	}

}
