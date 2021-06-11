package com.miao.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class BrowserManager {
	private static 	WebDriver driver;
	public static WebDriver getWebDriver(String browerName){
		if(browerName==null || "".equals(browerName) ){
			System.out.println("请先选择浏览器！");
		}else if("chrome".equals(browerName)){
			ChromeOptions options = new ChromeOptions();
			//解决浏览器出现"正在受到测试流程控制"
			options.addArguments("disable-infobars");
			//加载默认配置文件
			options.addArguments("--user-data-dir=C:\\Users\\Administrator\\AppData\\Local\\Google\\Chrome\\User Data");
			driver=new ChromeDriver(options);
		}else if("firefox".equals(browerName)){
			driver=new FirefoxDriver();
		}else if("ie".equals(browerName)){
			driver=new InternetExplorerDriver();
		}else{
			System.out.println("不支持该浏览器"+browerName);
		}
		return driver;
	}
	public static WebDriver getWebDriver(){
		return driver;
	}
}
