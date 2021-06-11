package com.miao.testcases;

import org.apache.log4j.Logger;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.miao.base.BaseParpare;
import com.miao.pages.LoginPage;
import com.miao.pages.MemberNutrilonalAssessment;

public class MemberNutrilonalAssessmentTest extends BaseParpare {
	Logger logger = Logger.getLogger(MemberRiskTest.class.getName());

	// 登录
	@Test
	public void login() {
		LoginPage login = PageFactory.initElements(driver, LoginPage.class);
		login.load();
		String title = driver.getTitle();		
		// 断言
		Assert.assertEquals(title, "CWI健康管理系统");
		if (title.equals("CWI健康管理系统")) {
			logger.info("成功进入加拿大健康管理系统！");
		} else {
			logger.info("登录失败");
		}
	}
	@Test(dependsOnMethods="login")
	public void nutrilonEnter() {
		String expected="https://cmstest.morewellness.cn/#/member/v2/evaluate/nutrition/";
		MemberNutrilonalAssessment mn=PageFactory.initElements(driver, MemberNutrilonalAssessment.class);		
		mn.nutrilonAssessment();
		String currenturl=driver.getCurrentUrl();
		Assert.assertEquals(currenturl, expected);
		logger.info("营养评估录入成功 ！");
	}
}
