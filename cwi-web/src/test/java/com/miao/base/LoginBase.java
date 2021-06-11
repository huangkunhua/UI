package com.miao.base;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.miao.pages.LoginPage;
import com.miao.testcases.LoginTest;
import com.miao.utils.BrowserManager;

public class LoginBase {	
	Logger logger=Logger.getLogger(LoginTest.class.getName());
	public WebDriver driver;
	@BeforeClass
	public void login(){	
		driver = BrowserManager.getWebDriver("chrome");
		String Url="https://cmstest.morewellness.cn/#/platform/home/slider/";
		driver.get(Url);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();		
		
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
	@AfterClass
	public void teraDownClass()  {
		//driver.close();
		//driver.quit();
	}
	
}
