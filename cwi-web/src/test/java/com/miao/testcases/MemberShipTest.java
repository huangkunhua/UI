package com.miao.testcases;



import org.apache.log4j.Logger;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.miao.base.BaseParpare;
import com.miao.pages.LoginPage;
import com.miao.pages.MemberRisk;
import com.miao.pages.MemberShip;

public class MemberShipTest extends BaseParpare  {
	Logger logger=Logger.getLogger(MemberShipTest.class.getName());	
	//登录	
	@Test
	public void login(){	
		LoginPage login=PageFactory.initElements(driver, LoginPage.class);
		login.load();
		String title=driver.getTitle();
		//断言
		Assert.assertEquals(title, "CWI健康管理系统");
		if(title.equals("CWI健康管理系统")){
			logger.info("成功进入加拿大健康管理系统！");
		}else{
			logger.info("登录失败");
		} 							
	}
	//录入血液检测结果
	@Test(dependsOnMethods="login")
	public void enteringBlood() throws Exception{
		MemberShip ms=PageFactory.initElements(driver, MemberShip.class);	
		ms.dtailBlood();
		String current_url=	driver.getCurrentUrl();
		String	expected="https://cmstest.morewellness.cn/#/member/v2/evaluate/blood/";
		Assert.assertEquals(current_url, expected);
		logger.info("成功录入血液检测结果");
		
	}

}
