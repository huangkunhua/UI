package com.miao.base;

import java.util.concurrent.TimeUnit;


import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.miao.utils.BrowserManager;

public class BasePage {
	public void sendKeys(WebElement webElement,String keys){
//      这样以后使用自定义的sendKeys方法，就可以把clear和sendKeys封装在一起了
		webElement.clear();
		webElement.sendKeys(keys);
	}		
	public void click(WebElement webElement){
      System.out.println(webElement.getText() + "页面元素正在被点击");
//      有些元素可以被定位，但是不能被点击
		try {
			webElement.click();
		} catch (Exception e) {
			Actions actions=new Actions(BrowserManager.getWebDriver());
			actions.click(webElement).perform();
		}
	}	
	public void removeAttribute(WebElement webElement,String attribute){
//      arguments[0]是一个固定写法，表示字符串后面的第一个参数，此时表示webElement
//      removeAttribute 删除属性的意思
//      arguments[1]表示字符串后面的第二个参数，此时表示attribute
//      javascript语言的代码写错，很难调试，所以把javascript语句封装在basepage中，以后直接调用这个方法
//      可以避免每次重新写javascript
		((JavascriptExecutor)BrowserManager.getWebDriver()).executeScript("arguments[0].removeAttribute(arguments[1])", webElement,attribute);
	}
	public void jsclick(WebElement webelement){
		//原因：用selenium模拟用户单击元素时，JS有一个操作鼠标悬浮的时候会对元素进行修改
		//解决办法：用JS来操作元素
		((JavascriptExecutor)BrowserManager.getWebDriver()).executeScript("arguments[0].click", webelement);
	}
	//等待页面加载完毕
	public void waitForElementToLoad(int pageLoadTime){
		//int pageLoadTime=10;
		BrowserManager.getWebDriver().manage().timeouts().pageLoadTimeout(pageLoadTime, TimeUnit.SECONDS);
	}
	
	//强制等待
	public void sleep(long time){
		try {
			Thread.sleep(time);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();			
		}
	}
	
	//进入iframe
	public void iframe(WebElement webElement){
		BrowserManager.getWebDriver().switchTo().frame(webElement);
	}
	//跳出当前的Iframe
	public void iframeDefault(WebElement webElement){
		BrowserManager.getWebDriver().switchTo().defaultContent();
	}
	
	//select下拉框操作-index
	public void select(WebElement webElement,int index){
		Select se=new Select(webElement);
		se.selectByIndex(index);
	}
	
	//alert弹窗-确定
	public void alert(){
		BrowserManager.getWebDriver().switchTo().alert().accept();
	}
	
	
	
	
	
}
