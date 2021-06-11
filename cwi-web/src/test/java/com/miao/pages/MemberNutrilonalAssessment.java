package com.miao.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.miao.base.BasePage;

public class MemberNutrilonalAssessment {
	// 定位：详情按钮
	@FindBy(xpath = "/html/body/div[1]/section/section/section/main/div[2]/div[2]/div[4]/div[2]/table/tbody/tr[1]/td[8]/div/span")
	WebElement detail_btn;
	//营养评估按钮
	@FindBy(xpath = "/html/body/div[1]/section/section/aside/div/div[2]/div/ul/li[1]/ul/li/ul/li[6]")
	WebElement nutrilonAssessment;
	//创建评估
	@FindBy(xpath = "/html/body/div[1]/section/section/section/main/div[2]/div[2]/div/div[2]/a")
	WebElement na_create;
	//保存
	@FindBy(xpath = "/html/body/div[1]/section/section/section/main/div[2]/div[2]/div[2]/button[1]")
	WebElement na_save;
	//营养评估-录入
	public void nutrilonAssessment(){
		BasePage bp=new BasePage();
		bp.click(detail_btn);
		bp.click(nutrilonAssessment);
		bp.click(na_create);
		bp.waitForElementToLoad(10);
		bp.click(na_save);
		bp.sleep(3000);
						
	}
}
