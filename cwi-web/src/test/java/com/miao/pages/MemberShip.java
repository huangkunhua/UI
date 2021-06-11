package com.miao.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;

import com.miao.base.BasePage;

public class MemberShip extends BasePage{
	//定位：详情
	@FindBy(xpath="/html/body/div[1]/section/section/section/main/div[2]/div[2]/div[4]/div[2]/table/tbody/tr[1]/td[8]/div/span")
	WebElement detail_btn; 
	//录入血液检测结果
	@FindBy(linkText="录入检测结果")
	WebElement enterblood;
	@FindBy(xpath="/html/body/div[1]/section/section/section/main/div[2]/div[2]/div[1]/form/div[1]/div/div[1]/input")
	WebElement en1;
	@FindBy(xpath="/html/body/div[1]/section/section/section/main/div[2]/div[2]/div[1]/form/div[2]/div/div/input")
	WebElement en2;
	@FindBy(xpath="/html/body/div[1]/section/section/section/main/div[2]/div[2]/div[1]/form/div[3]/div/div[1]/input")
	WebElement en3;
	@FindBy(xpath="/html/body/div[1]/section/section/section/main/div[2]/div[2]/div[1]/form/div[4]/div/div/input")
	WebElement en4;
	@FindBy(xpath="/html/body/div[1]/section/section/section/main/div[2]/div[2]/div[1]/form/div[5]/div/div[1]/input")
	WebElement en5;
	@FindBy(xpath="/html/body/div[1]/section/section/section/main/div[2]/div[2]/div[1]/form/div[6]/div/div/input")
	WebElement en6;
	@FindBy(xpath="/html/body/div[1]/section/section/section/main/div[2]/div[2]/div[2]/button[1]")
	WebElement save_btn;
	
	
	public  void dtailBlood() throws Exception{		
	  BasePage bp=new BasePage();
	  bp.click(detail_btn);
	  bp.click(enterblood);
//		detail_btn.click();
//		enterblood.click();	  
	  en1.sendKeys("8");
	  en2.sendKeys("6");
	  en3.sendKeys("6");
	  en4.sendKeys("6");
	  en5.sendKeys("6");
	  en6.sendKeys("6");	  
	  save_btn.click();
	  Thread.sleep(2000);
	  
  }
  
}
