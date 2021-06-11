package com.miao.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.miao.base.BasePage;

public class MemberFrammingham extends BasePage {
	// 定位：详情按钮
	@FindBy(xpath = "/html/body/div[1]/section/section/section/main/div[2]/div[2]/div[4]/div[2]/table/tbody/tr[1]/td[8]/div/span")
	WebElement detail_btn;
	// Frammingham
	@FindBy(xpath = "/html/body/div/section/section/aside/div/div[2]/div/ul/li[1]/ul/li/ul/li[4]")
	WebElement frammingham;
	// 创建评估
	@FindBy(xpath = "/html/body/div/section/section/section/main/div[2]/div[2]/div/div[2]/a")
	WebElement frammingham_create;

	// frammingham问卷
	@FindBy(xpath = "/html/body/div/section/section/section/main/div[2]/div[2]/div[1]/form/div[1]/div[1]/div/div/div[1]/input")
	WebElement LDL;
	@FindBy(xpath = "/html/body/div/section/section/section/main/div[2]/div[2]/div[1]/form/div[1]/div[2]/div/div/div/input")
	WebElement HDL;
	@FindBy(xpath = "/html/body/div/section/section/section/main/div[2]/div[2]/div[1]/form/div[2]/div[1]/div/div/div[1]/input")
	WebElement cholesterol;
	@FindBy(xpath = "/html/body/div/section/section/section/main/div[2]/div[2]/div[1]/form/div[2]/div[2]/div/div/div/input")
	WebElement apo_B;
	@FindBy(xpath = "/html/body/div/section/section/section/main/div[2]/div[2]/div[1]/form/div[3]/div[1]/div/div/div[1]/input")
	WebElement SBP;
	@FindBy(xpath = "/html/body/div/section/section/section/main/div[2]/div[2]/div[1]/form/div[3]/div[2]/div/button[1]")
	WebElement treated;
	@FindBy(xpath = "/html/body/div/section/section/section/main/div[2]/div[2]/div[1]/form/div[4]/div/button[1]")
	WebElement smoking;
	@FindBy(xpath = "/html/body/div/section/section/section/main/div[2]/div[2]/div[1]/form/div[5]/div/button[1]")
	WebElement IDF;
	@FindBy(xpath = "/html/body/div/section/section/section/main/div[2]/div[2]/div[1]/form/div[6]/div/button[1]")
	WebElement family;
	// 计算得分
	@FindBy(xpath = "/html/body/div/section/section/section/main/div[2]/div[2]/div[2]/button[1]")
	WebElement scored;

	public void frammingham() {
		BasePage bp = new BasePage();
		bp.click(detail_btn);
		bp.click(frammingham);
		bp.click(frammingham_create);
		bp.waitForElementToLoad(10);
		bp.sendKeys(LDL, "2");
		bp.sendKeys(HDL, "2");
		bp.sendKeys(cholesterol, "2");
		bp.sendKeys(apo_B, "2");
		bp.sendKeys(SBP, "150");
		bp.click(treated);
		bp.click(smoking);
		bp.click(IDF);
		bp.click(family);
		bp.click(scored);		
		bp.sleep(3000);
	}

}
