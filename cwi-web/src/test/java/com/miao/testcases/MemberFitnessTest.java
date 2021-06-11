package com.miao.testcases;

import org.apache.log4j.Logger;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.miao.base.BaseParpare;
import com.miao.pages.LoginPage;
import com.miao.pages.MemberFitness;

public class MemberFitnessTest extends BaseParpare {
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
	public void fitnessEnter()  {
		MemberFitness mf = PageFactory.initElements(driver, MemberFitness.class);
		String expected="https://cmstest.morewellness.cn/#/member/v2/evaluate/fitness/";
		
		// 心肺耐力测试-录入
		mf.enterCept();
		String currenturl=driver.getCurrentUrl();
		Assert.assertEquals(currenturl, expected);
		logger.info("心肺耐力测试-录入成功！");
		
		// 坐位体前屈-录入
		mf.enterSitReach();
		Assert.assertEquals(currenturl, expected);
		logger.info("坐位体前屈-录入成功！");
		
		//握力测试-录入
		mf.gripSTesting();
		Assert.assertEquals(currenturl, expected);
		logger.info("握力测试-录入成功！");
		//俯卧撑-录入
		mf.push_Up();
		Assert.assertEquals(currenturl, expected);
		logger.info("俯卧撑-录入成功！");
		//单腿平衡测试-录入
		mf.oneLegBalanceTest();
		Assert.assertEquals(currenturl, expected);
		logger.info("单腿平衡测试-录入成功！");
	}
}
