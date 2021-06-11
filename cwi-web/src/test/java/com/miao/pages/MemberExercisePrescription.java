package com.miao.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.miao.base.BasePage;

public class MemberExercisePrescription {
	// 定位：详情按钮
	@FindBy(xpath = "/html/body/div[1]/section/section/section/main/div[2]/div[2]/div[4]/div[2]/table/tbody/tr[1]/td[8]/div/span")
	WebElement detail_btn;
	//运动处方按钮
	@FindBy(xpath = "/html/body/div/section/section/aside/div/div[2]/div/ul/li[2]/ul/li/span")
	WebElement ep;
	//创建处方按钮
	@FindBy(xpath = "/html/body/div/section/section/section/main/div[2]/div[2]/div/div[2]/a")
	WebElement ep_create;
	//选择目标按钮	
	@FindBy(xpath = "/html/body/div/section/section/section/main/div[2]/div[2]/div[1]/form/div[1]/div/div/div[2]/button")
	WebElement target_se;
	//目标输入框
	@FindBy(xpath = "/html/body/div[1]/section/section/section/main/div[3]/div/div[2]/div/div/input")
	WebElement target_in;
	//查询
	@FindBy(xpath = "/html/body/div[1]/section/section/section/main/div[3]/div/div[2]/div/button")
	WebElement target_search;
	//选择目标
	@FindBy(xpath = "/html/body/div[1]/section/section/section/main/div[3]/div/div[2]/ul/li[1]")
	WebElement target_su;
	//确认按钮
	@FindBy(xpath = "/html/body/div[1]/section/section/section/main/div[3]/div/div[3]/span/button[1]")
	WebElement taruget_sa;
	//兴趣
	@FindBy(xpath = "/html/body/div[1]/section/section/section/main/div[2]/div[2]/div[1]/form/div[2]/div/div[1]/input")
	WebElement interest;
	//练习多久
	@FindBy(xpath="/html/body/div[1]/section/section/section/main/div[2]/div[2]/div[1]/form/div[3]/div/div[1]/input")
	WebElement training;
	
	//有氧-频率、强度、时间、种类
	@FindBy(xpath="/html/body/div[1]/section/section/section/main/div[2]/div[2]/div[1]/form/div[5]/div[1]/div[1]/div/div/div[1]/input")
	WebElement rate;	
	@FindBy(xpath="/html/body/div[1]/section/section/section/main/div[2]/div[2]/div[1]/form/div[5]/div[1]/div[2]/div/div/div[1]/input")
	WebElement strength;
	@FindBy(xpath="/html/body/div[1]/section/section/section/main/div[2]/div[2]/div[1]/form/div[5]/div[1]/div[3]/div/div/div[1]/input")
	WebElement duration;
	@FindBy(xpath="/html/body/div[1]/section/section/section/main/div[2]/div[2]/div[1]/form/div[5]/div[2]/div/div/div[1]/input")
	WebElement kind;
	//力量-频率、强度、时间、种类
	@FindBy(xpath="/html/body/div[1]/section/section/section/main/div[2]/div[2]/div[1]/form/div[6]/div[1]/div[1]/div/div/div[1]/input")
	WebElement rate1;
	@FindBy(xpath="/html/body/div[1]/section/section/section/main/div[2]/div[2]/div[1]/form/div[6]/div[1]/div[2]/div/div/div[1]/input")
	WebElement strength1;
	@FindBy(xpath="/html/body/div[1]/section/section/section/main/div[2]/div[2]/div[1]/form/div[6]/div[1]/div[3]/div/div/div[1]/input")
	WebElement duration1;
	@FindBy(xpath="/html/body/div[1]/section/section/section/main/div[2]/div[2]/div[1]/form/div[6]/div[2]/div/div/div[1]/input")
	WebElement kind1;
	//柔韧-频率、强度、时间、种类
	@FindBy(xpath="/html/body/div[1]/section/section/section/main/div[2]/div[2]/div[1]/form/div[7]/div[1]/div[1]/div/div/div[1]/input")
	WebElement rate2;
	@FindBy(xpath="/html/body/div[1]/section/section/section/main/div[2]/div[2]/div[1]/form/div[7]/div[1]/div[2]/div/div/div[1]/input")
	WebElement strength2;
	@FindBy(xpath="/html/body/div[1]/section/section/section/main/div[2]/div[2]/div[1]/form/div[7]/div[1]/div[3]/div/div/div[1]/input")
	WebElement duration2;
	@FindBy(xpath="/html/body/div[1]/section/section/section/main/div[2]/div[2]/div[1]/form/div[7]/div[2]/div/div/div[1]/input")
	WebElement kind2;
	
	//热身
	@FindBy(xpath="/html/body/div[1]/section/section/section/main/div[2]/div[2]/div[1]/form/div[9]/div/div/div[1]/input")
	WebElement warm;
	//拉伸
	@FindBy(xpath="/html/body/div[1]/section/section/section/main/div[2]/div[2]/div[1]/form/div[10]/div/div/div[1]/input")
	WebElement draw;
	//有氧运动-种类、频率、强度、时间
	@FindBy(xpath="/html/body/div[1]/section/section/section/main/div[2]/div[2]/div[1]/form/div[11]/div[1]/div[1]/div[1]/div/div/div[1]/input")
	WebElement kind3;
	@FindBy(xpath="/html/body/div[1]/section/section/section/main/div[2]/div[2]/div[1]/form/div[11]/div[1]/div[1]/div[2]/div[1]/div/div/div[1]/input")
	WebElement rate3;
	@FindBy(xpath="/html/body/div[1]/section/section/section/main/div[2]/div[2]/div[1]/form/div[11]/div[1]/div[1]/div[2]/div[2]/div/div/div[1]/input")
	WebElement strength3;
	@FindBy(xpath="/html/body/div[1]/section/section/section/main/div[2]/div[2]/div[1]/form/div[11]/div[1]/div[1]/div[2]/div[3]/div/div/div[1]/input")
	WebElement duration3;
	//器材介绍
	@FindBy(xpath="/html/body/div[1]/section/section/section/main/div[2]/div[2]/div[1]/form/div[11]/div[2]/div/div/div[1]/input")
	WebElement introduction;
	//多大强度适合
	@FindBy(xpath="/html/body/div[1]/section/section/section/main/div[2]/div[2]/div[1]/form/div[11]/div[3]/div/div[2]/div[1]/div/div/span[2]/div/div/input")
	WebElement age;
	@FindBy(xpath="/html/body/div[1]/section/section/section/main/div[2]/div[2]/div[1]/form/div[11]/div[3]/div/div[2]/div[2]/div/div/span[2]/div/div/input")
	WebElement low;
	@FindBy(xpath="/html/body/div[1]/section/section/section/main/div[2]/div[2]/div[1]/form/div[11]/div[3]/div/div[2]/div[3]/div/div/span[2]/div/div/input")
	WebElement top;
	
	//休息放松
	@FindBy(xpath="/html/body/div[1]/section/section/section/main/div[2]/div[2]/div[1]/form/div[11]/div[4]/div/div/div[1]/input")
	WebElement relax;
	//负重训练
	@FindBy(xpath="/html/body/div[1]/section/section/section/main/div[2]/div[2]/div[1]/form/div[11]/div[5]/div/div[1]/div[1]/div[1]/div/div/div[1]/input")
	WebElement kind4;
	@FindBy(xpath="/html/body/div[1]/section/section/section/main/div[2]/div[2]/div[1]/form/div[11]/div[5]/div/div[1]/div[1]/div[2]/div/div/div[1]/input")
	WebElement rate4;
	@FindBy(xpath="/html/body/div[1]/section/section/section/main/div[2]/div[2]/div[1]/form/div[11]/div[5]/div/div[1]/div[1]/div[3]/div/div/div[1]/input")
	WebElement number;
	@FindBy(xpath="/html/body/div[1]/section/section/section/main/div[2]/div[2]/div[1]/form/div[11]/div[5]/div/div[1]/div[2]/div[1]/div/div/div[1]/input")
	WebElement group;
	@FindBy(xpath="/html/body/div[1]/section/section/section/main/div[2]/div[2]/div[1]/form/div[11]/div[5]/div/div[1]/div[2]/div[2]/div/div/div[1]/input")
	WebElement week;
	//器材介绍
	@FindBy(xpath="/html/body/div[1]/section/section/section/main/div[2]/div[2]/div[1]/form/div[11]/div[6]/div/div/div[1]/textarea")
	WebElement introduction1;
	//保存
	@FindBy(xpath="/html/body/div[1]/section/section/section/main/div[2]/div[2]/div[2]/button[1]")
	WebElement save;
	
	public void exercisePrescriptionEnter(){
		BasePage bp=new BasePage();
		bp.click(detail_btn);
		bp.click(ep);
		bp.waitForElementToLoad(10);
		bp.click(ep_create);
		bp.click(target_se);
		bp.sendKeys(target_in, "运动");
		bp.click(target_search);
		bp.click(target_su);
		bp.click(taruget_sa);
		bp.sleep(2000);
		
		bp.sendKeys(interest, "测试");		
		bp.sendKeys(training, "练习2周");
		
		
		bp.sendKeys(rate, "每组20次");		
		bp.sendKeys(strength, "中等");		
		bp.sendKeys(duration, "30分钟");		
		bp.sendKeys(kind, "跑步机");
		
		
		bp.sendKeys(rate1, "每组20次");		
		bp.sendKeys(strength1, "中等");		
		bp.sendKeys(duration1, "30分钟");		
		bp.sendKeys(kind1, "跑步机");
		
		
		bp.sendKeys(rate2, "每组20次");		
		bp.sendKeys(strength2, "中等");		
		bp.sendKeys(duration2, "30分钟");		
		bp.sendKeys(kind2, "跑步机");
		
		
		bp.sendKeys(warm, "慢跑30分钟");		
		bp.sendKeys(draw, "拉伸10分钟");
		
		
		bp.sendKeys(kind3, "自行车");
		bp.sendKeys(rate3, "每组20分钟");		
		bp.sendKeys(strength3, "中等");		
		bp.sendKeys(duration3, "30分钟");		
				
		bp.sendKeys(introduction,"跑步机神器");
		bp.sendKeys(age, "28");
		bp.sendKeys(low, "65");
		bp.sendKeys(top, "200");
		
		bp.sendKeys(relax, "慢走10分钟，瑜伽2分钟");
		
		bp.sendKeys(kind4, "坐式单车");
		bp.sendKeys(rate4, "运动20分钟");
		bp.sendKeys(number, "5次");
		bp.sendKeys(group, "5组");
		bp.sendKeys(week, "每周2次");
		
		bp.sendKeys(introduction1, "动感单车基本与普通单车相似，包括车把、车座、蹬板和轮子几个部分，车身稳固地联结为一个整体。");
		bp.click(save);	
		bp.sleep(3000);
		
	}	
}
