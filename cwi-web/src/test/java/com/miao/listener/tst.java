package com.miao.listener;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.ProfilesIni;
import org.openqa.selenium.remote.DesiredCapabilities;


public class tst {
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:\\Program Files\\Mozilla Firefox\\geckodriver.exe");
		ProfilesIni pi=new ProfilesIni();
		FirefoxProfile profile=pi.getProfile("yy");
		DesiredCapabilities capa=DesiredCapabilities.firefox();
		capa.setCapability(FirefoxDriver.PROFILE, profile);
	
		WebDriver dr=new FirefoxDriver(capa);		
		dr.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		dr.get("https://cmstest.morewellness.cn/#/home/slider/");
		
	}
}
