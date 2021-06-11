package com.miao.utils;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.google.common.io.Files;

public class ScreenshotManager {
	public static void getScreenshot(String fileName) {
		String currentPath = System.getProperty("user.dir");
		// 浏览器当前界面，截图，并保存成一个文件
		File srcFile = ((TakesScreenshot) BrowserManager.getWebDriver()).getScreenshotAs(OutputType.FILE);
		String filePath = currentPath + File.separator + "image" + File.separator + fileName + ".png";
		// 接下来把源文件，保存到路径下面
		// srcFile是一个对象，它保存在内存中
		// 通过google的Files类的copy方法，把源文件从内存拷贝到新文件
		// new File(filePath)是在这个路径创建一个新文件的意思
		try {
			Files.copy(srcFile, new File(filePath));
		} catch (IOException e) {
			e.printStackTrace(); // 当发生异常时，打印堆栈信息
			System.out.println(fileName + "截图失败");

		}
	}
}
