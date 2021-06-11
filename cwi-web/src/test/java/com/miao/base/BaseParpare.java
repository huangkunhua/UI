package com.miao.base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.log4testng.Logger;

import com.miao.utils.BrowserManager;

public class BaseParpare {
	//private static Logger logger = Logger.getLogger(BaseParpare.class);
	public WebDriver driver;	
	@BeforeClass
	public void setUpClass() {
		driver = BrowserManager.getWebDriver("chrome");
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}

	@AfterClass
	public void teraDownClass()  {
		//driver.close();
		//driver.quit();
	}

}
