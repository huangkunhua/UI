package com.miao.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.miao.base.BasePage;

public class MemberFitness   extends BasePage {
	BasePage bp = new BasePage();
	// 定位：详情按钮
	@FindBy(xpath = "/html/body/div[1]/section/section/section/main/div[2]/div[2]/div[4]/div[2]/table/tbody/tr[1]/td[8]/div/span")
	WebElement detail_btn;
	// 体适能测试按钮
	@FindBy(xpath = "/html/body/div/section/section/aside/div/div[2]/div/ul/li[1]/ul/li/ul/li[3]")
	WebElement fitness_btn;

	// 心肺耐力测试-录入
	@FindBy(xpath = "/html/body/div/section/section/section/main/div[2]/div[3]/div[1]/div/div[2]/a")
	WebElement cept_en;
	@FindBy(xpath = "/html/body/div/section/section/section/main/div[2]/div[2]/div/form/div[5]/div/div/input")
	WebElement vo2max;
	@FindBy(xpath = "/html/body/div/section/section/section/main/div[2]/div[3]/button[1]")
	WebElement save_v;

	// 心肺耐力测试-录入
	public void enterCept() {
		// 进入会员详情页面
		detail_btn.click();

		bp.click(fitness_btn);
		bp.waitForElementToLoad(10);
		bp.click(cept_en);
		bp.sendKeys(vo2max, "88");
		bp.click(save_v);
		bp.sleep(5000);
	}

	// 坐位体前屈测试-录入
	@FindBy(xpath = "/html/body/div/section/section/section/main/div[2]/div[2]/label[2]/span")
	WebElement sit_reach;
	@FindBy(xpath = "/html/body/div/section/section/section/main/div[2]/div[3]/div[1]/div/div[2]/a")
	WebElement sit_en;
	@FindBy(xpath = "/html/body/div/section/section/section/main/div[2]/div[2]/form/div/div/div/input")
	WebElement sit_and_reach;
	@FindBy(xpath = "/html/body/div/section/section/section/main/div[2]/div[3]/button[1]")
	WebElement sit_and_reach_save;

	public void enterSitReach()  {
		bp.click(sit_reach);
		bp.click(sit_en);
		bp.waitForElementToLoad(10);
		bp.sendKeys(sit_and_reach, "28");
		bp.click(sit_and_reach_save);
		bp.sleep(3000);
	}

	// 握力测试-录入
	@FindBy(xpath = "/html/body/div/section/section/section/main/div[2]/div[2]/label[3]/span")
	WebElement griptest;

	@FindBy(xpath = "/html/body/div/section/section/section/main/div[2]/div[3]/div[1]/div/div[2]/a")
	WebElement griptest_en;

	@FindBy(xpath = "/html/body/div/section/section/section/main/div[2]/div[2]/form/div/div/div[1]/input")
	WebElement gripstrength;
	@FindBy(xpath = "/html/body/div/section/section/section/main/div[2]/div[3]/button[1]")
	WebElement gripstrength_save;

	public void gripSTesting()  {
		bp.click(griptest);
		for (int i = 0; i < 3; i++) {
			if (i == 0) {
				bp.click(griptest_en);
				bp.sendKeys(gripstrength, "999.99");
				bp.click(gripstrength_save);
			}
			if (i == 1) {
				bp.click(griptest_en);
				bp.sendKeys(gripstrength, "0.01");
				bp.click(gripstrength_save);
			}
			if (i == 2) {									
					
						bp.click(griptest_en);
						bp.sendKeys(gripstrength, "100");
						bp.click(gripstrength_save);
						bp.sleep(3000);																																						
			}
		}
	}
	
	//俯卧撑
	@FindBy(xpath="/html/body/div/section/section/section/main/div[2]/div[2]/label[4]/span")
	WebElement push_up;
	@FindBy(xpath="/html/body/div/section/section/section/main/div[2]/div[3]/div[1]/div/div[2]/a")
	WebElement push_up_en;
	@FindBy(xpath="/html/body/div/section/section/section/main/div[2]/div[2]/form/div/div/div[1]/input")
	WebElement push_up_value;
	@FindBy(xpath="/html/body/div/section/section/section/main/div[2]/div[3]/button[1]")
	WebElement push_up_save;
	public void push_Up() {
		bp.click(push_up);
		bp.click(push_up_en);
		bp.sendKeys(push_up_value, "50");
		bp.click(push_up_save);
		bp.sleep(3000);
	}
	//单腿平衡测试
	@FindBy(xpath="/html/body/div/section/section/section/main/div[2]/div[2]/label[5]/span")
	WebElement oneLegBalance;
	@FindBy(xpath="/html/body/div/section/section/section/main/div[2]/div[3]/div[1]/div/div[2]/a")
	WebElement oneLeg_en;	
	@FindBy(xpath="/html/body/div/section/section/section/main/div[2]/div[2]/form/div/div/div[1]/input")
	WebElement oneLegBalance_value;	
	@FindBy(xpath="/html/body/div/section/section/section/main/div[2]/div[3]/button[1]")
	WebElement oneLegBalance_save;
	public void oneLegBalanceTest() {
		bp.click(oneLegBalance);
		bp.click(oneLeg_en);
		bp.sendKeys(oneLegBalance_value, "180");
		bp.click(oneLegBalance_save);
		bp.sleep(3000);
		
	}
}
