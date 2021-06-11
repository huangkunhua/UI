package com.miao.testcases;

import org.apache.log4j.Logger;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import com.miao.base.BaseParpare;
import com.miao.pages.LoginPage;
import com.miao.pages.MemberSleepAssessment;

public class MemberSleepAssessmentTest extends BaseParpare {
	Logger logger = Logger.getLogger(MemberRiskTest.class.getName());

	// 登录
	@Test
	public void login() {
		LoginPage login = PageFactory.initElements(driver, LoginPage.class);
		login.load();
		String title = driver.getTitle();
		// System.out.println(title);
		// 断言
		Assert.assertEquals(title, "CWI健康管理系统");
		if (title.equals("CWI健康管理系统")) {
			logger.info("成功进入加拿大健康管理系统！");
		} else {
			logger.info("登录失败");
		}
	}
	@Test(dependsOnMethods="login")
	public void sleepAssessment() {
		//String expected="https://cmstest.morewellness.cn/#/member/v2/evaluate/sleep/";
		MemberSleepAssessment ms=PageFactory.initElements(driver, MemberSleepAssessment.class);
		ms.sleepAssessment();
		//String currenturl=driver.getCurrentUrl();
		//Assert.assertEquals(currenturl, expected);	
		logger.info("成功创建睡眠评估！");
		
	}
}
