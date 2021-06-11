package com.miao.listener;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.testng.ITestResult;
import org.testng.TestListenerAdapter;

import com.miao.utils.ScreenshotManager;

/**
 * 监听测试用例执行状态
 * 当测试用例执行失败时，进行截图
 */

public class TestCaseListener extends TestListenerAdapter {

	public void onTestSuccess(ITestResult tr) {
		System.out.println(String.format("方法名=%s，测试执行成功", tr.getMethod().getMethodName()));
	}

	public void onTestFailure(ITestResult tr) {
		// 通过测试结果获取：失败的测试用例方法的名字
		String methodName = tr.getMethod().getMethodName();
		// 通过测试结果获取：失败的测试用例类的名字
		String className = tr.getTestClass().getName();

		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH-mm-ss");
		String date = dateFormat.format(new Date());		
		ScreenshotManager.getScreenshot(className + "." + methodName + date);
	}
}
