package com.miao.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.FindBy;
import com.miao.base.BaseParpare;
import com.miao.utils.BrowserManager;

public class LoginPage extends BaseParpare {
	
	public void load(){
		
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\Administrator\\AppData\\Local\\Google\\Chrome\\Application\\chrome.exe");		
		//ChromeOptions options = new ChromeOptions();
		//options.addArguments("disable-infobars");//忽略提示
		//加载默认配置文件
		//options.addArguments("--user-data-dir=C:\\Users\\Administrator\\AppData\\Local\\Google\\Chrome\\User Data");
		//WebDriver driver=new ChromeDriver(options);
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//driver.manage().window().maximize();
		String Url="https://cmstest.morewellness.cn/#/platform/home/slider/";
		BrowserManager.getWebDriver().get(Url);

		
	
		
	}
}
