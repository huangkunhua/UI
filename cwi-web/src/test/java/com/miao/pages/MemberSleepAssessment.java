package com.miao.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.miao.base.BasePage;

public class MemberSleepAssessment extends BasePage {
		// 定位：详情按钮
		@FindBy(xpath = "/html/body/div[1]/section/section/section/main/div[2]/div[2]/div[4]/div[2]/table/tbody/tr[1]/td[8]/div/span")
		WebElement detail_btn;
		//睡眠评估按钮
		@FindBy(xpath="/html/body/div[1]/section/section/aside/div/div[2]/div/ul/li[1]/ul/li/ul/li[5]")
		WebElement sleepAss;
		//创建评估按钮
		@FindBy(xpath="/html/body/div[1]/section/section/section/main/div[2]/div[2]/div/div[2]/a")
		WebElement sleepAss_crt;
		//睡眠评估问卷
		@FindBy(xpath="/html/body/div[1]/section/section/section/main/div[2]/div[2]/div[1]/form/div/div[1]/div[2]/div/button[1]")
		WebElement sleepAss1;
		@FindBy(xpath="/html/body/div[1]/section/section/section/main/div[2]/div[2]/div[1]/form/div/div[2]/div/div/button[1]")
		WebElement sleepAss2;
		
		@FindBy(xpath="/html/body/div[1]/section/section/section/main/div[2]/div[2]/div[1]/form/div/div[3]/div/div/button[1]")
		WebElement sleepAss3;
		@FindBy(xpath="/html/body/div[1]/section/section/section/main/div[2]/div[2]/div[1]/form/div/div[4]/div/div/button[1]")
		WebElement sleepAss4;
		
		@FindBy(xpath="/html/body/div[1]/section/section/section/main/div[2]/div[2]/div[1]/form/div/div[5]/div/div/button[1]")
		WebElement sleepAss5;
		@FindBy(xpath="/html/body/div[1]/section/section/section/main/div[2]/div[2]/div[1]/form/div/div[6]/div/div/button[1]")
		WebElement sleepAss6;
		
		@FindBy(xpath="/html/body/div[1]/section/section/section/main/div[2]/div[2]/div[1]/form/div/div[7]/div/div/button[1]")
		WebElement sleepAss7;
		@FindBy(xpath="/html/body/div[1]/section/section/section/main/div[2]/div[2]/div[1]/form/div/div[8]/div/div/button[1]")
		WebElement sleepAss8;
		
		@FindBy(xpath="/html/body/div[1]/section/section/section/main/div[2]/div[2]/div[1]/form/div/div[9]/div/div/button[1]")
		WebElement sleepAss9;
		//计算睡眠得分
		@FindBy(xpath="/html/body/div[1]/section/section/section/main/div[2]/div[2]/div[2]/button[1]")
		WebElement sleepAss_save;
		//确定按钮
		@FindBy(xpath="/html/body/div[2]/div/div[3]/button")
		WebElement save;
		public void sleepAssessment(){
			BasePage bp = new BasePage();
			bp.click(detail_btn);
			bp.click(sleepAss);
			bp.click(sleepAss_crt);
			bp.waitForElementToLoad(10);
			bp.click(sleepAss1);
			bp.click(sleepAss2);
			bp.click(sleepAss3);
			bp.click(sleepAss4);
			bp.click(sleepAss5);
			bp.click(sleepAss6);
			bp.click(sleepAss7);
			bp.click(sleepAss8);
			bp.click(sleepAss9);
			bp.click(sleepAss_save);
//			bp.waitForElementToLoad(10);
//			bp.click(save);
			bp.sleep(3000);
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
}
