package com.miao.testcases;


import org.apache.log4j.Logger;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.miao.base.BaseParpare;
import com.miao.pages.LoginPage;
import com.miao.pages.MemberRisk;

public class MemberRiskTest extends BaseParpare {
	Logger logger=Logger.getLogger(MemberRiskTest.class.getName());	
	// 登录
	@Test
	public void login() {
		LoginPage login = PageFactory.initElements(driver, LoginPage.class);
		login.load();
		String title=driver.getTitle();
		//System.out.println(title);
		//断言
		Assert.assertEquals(title, "CWI健康管理系统");
		if(title.equals("CWI健康管理系统")){
			logger.info("成功进入加拿大健康管理系统！");
		}else{
			logger.info("登录失败");
		} 
	}
	@Test(dependsOnMethods="login")
	public void enterRisk() throws Exception {
		MemberRisk mr = PageFactory.initElements(driver, MemberRisk.class);
		//创建风险评估
		mr.risk();
		String current_url1=driver.getCurrentUrl();
		String	expected1="https://cmstest.morewellness.cn/#/member/v2/evaluate/risk/";
		Assert.assertEquals(current_url1, expected1);
		logger.info("成功创建风险评估！");
		//查看风险评估结果		
		mr.cat();		
		logger.info("成功查看风险评估结果");
		
	}

}
