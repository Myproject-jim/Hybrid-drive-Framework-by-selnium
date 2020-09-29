package cn.AutoFramk.ConfigUntil;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
/*
 * 封装自定义等待时间
 */

public class WatiautoUnit {
	
	public static void waitauto_time(WebDriver driver,long time,By element) {
		WebDriverWait driverwait=new WebDriverWait(driver, time);
		try {
			Boolean status = driverwait.until(new ExpectedCondition<Boolean>() {
				@Override
				public Boolean apply(WebDriver arg0) {
					// TODO Auto-generated method stub
					driver.findElement(element);
					return true;
				}
			});
			//断言当前方法是否为true
			Assert.assertTrue(status);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("not found such element");
		}
		
	}
	//等待对话框是否可见
	public static void waieauto_box_visable(WebDriver driver,long time,By element) {
		try {
			WebDriverWait driverwait = new WebDriverWait(driver, time);
			Boolean status = driverwait.until(new ExpectedCondition<Boolean>() {

				@Override
				public Boolean apply(WebDriver arg0) {
					// TODO Auto-generated method stub
					return driver.findElement(element).isDisplayed();
				}
			});
			Assert.assertTrue(status);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("not found such element");
		}

	}

}
