package cn.Atuoframk.HTML5_config;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
/*
 * 通过JavaScript 控制HTML流的输出
 */
public class Html5_videoUtil {
	public static void Html5_video(WebDriver driver,By element,String screenpath) throws InterruptedException {
		
		
		File screenFile=null;
		//获取video 的标签
		WebElement vedioplayer = driver.findElement(element);
		//声明一个javascript的对象
		JavascriptExecutor javascriptExecutor = (JavascriptExecutor)driver;
		//获取 video URL
		String video=(String)javascriptExecutor.executeScript("return arguments[0].currentSrc", vedioplayer);
		// 断言加载URl 是否正确
		Assert.assertEquals(video, "www.////./////");
		//查看video 时长
		double vediotime=(double)javascriptExecutor.executeScript("return artuments[0].duration", vedioplayer);
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//开始播放流
		javascriptExecutor.executeScript("return aruguments[0].paly()", video);
		Thread.sleep(3000);
		//停止播放流
		javascriptExecutor.executeScript("return arguments[0].pause()", video);
		//当前流播放截图
		TakesScreenshot TakesScreenshot = (TakesScreenshot)driver;
		screenFile=TakesScreenshot.getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(screenFile,new File(screenpath));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	

}
