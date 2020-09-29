package cn.AutoFrame.AppMoules;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cn.AutoFrame.Until.string_test;
import cn.AutoFrame.pagebyProperties.intro_Page;
/*
 * 事件 封装基础的action事件 基于propertie文件
 */
public class Intro_Action {
	public static void execute(WebDriver driver,String write,String cl,String token) {
		
		intro_Page page_intro = new intro_Page(driver);
		
		page_intro.checkbox().sendKeys(write);
		
		page_intro.intro_btu().click();
		
		WebDriverWait wait_intro = new WebDriverWait(driver, 10);
		wait_intro.until(ExpectedConditions.elementToBeSelected(By.xpath("query")));
		
	}
	
	public static void sogou(WebDriver driver,String write) {
		intro_Page page_intro = new intro_Page(driver);
		page_intro.checkbox().sendKeys(write);
		page_intro.intro_btu().click();
		WebDriverWait wait_intro = new WebDriverWait(driver, 10);
		wait_intro.until(ExpectedConditions.elementToBeSelected(By.xpath("query")));
		
	}
	
	


}
