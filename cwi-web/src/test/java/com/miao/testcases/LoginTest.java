package com.miao.testcases;


import org.apache.log4j.Logger;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.miao.base.BaseParpare;
import com.miao.pages.LoginPage;
public class LoginTest extends BaseParpare {
	Logger logger=Logger.getLogger(LoginTest.class.getName());
	@Test
	public void login(){	
		LoginPage login=PageFactory.initElements(driver, LoginPage.class);
		login.load();
		String title=driver.getTitle();
		System.out.println(title);
		//断言
		Assert.assertEquals(title, "CWI健康管理系统");
		if(title.equals("CWI健康管理系统")){
			logger.info("成功进入加拿大健康管理系统！");
		}else{
			logger.info("登录失败");
		} 
		
								
	}
}
