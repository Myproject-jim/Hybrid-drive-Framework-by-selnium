package cn.AutoFramk.ConfigUntil;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitUnit {
    /*
     * �?装元素等待时间的方法
     */
	
	public static void sleep(Long millis) {
		try {
			Thread.sleep(millis);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void Waitelement(WebDriver driver,long time,By xpathExpression) {
		WebDriverWait waitelemt = new WebDriverWait(driver, time);
		waitelemt.until(ExpectedConditions.presenceOfElementLocated(xpathExpression));
		
	}
	public static void title(WebDriver driver,long time ,String xpathExpression) {
		WebDriverWait waitelemt = new WebDriverWait(driver, time);
		waitelemt.until(ExpectedConditions.titleContains(xpathExpression));
	}
	 //当�?元素是�?�处于被选中的转�?
	public static void elementToBeSelected(WebDriver driver,long tiem ,By xpathExpression) {
		WebDriverWait waitelemt = new WebDriverWait(driver, tiem);
		waitelemt.until(ExpectedConditions.elementToBeSelected(xpathExpression));
	}
	//                 元素是�?��?�以被点击
	public static void elementToBeClickable(WebDriver driver,long tiem ,By xpathExpression) {
		WebDriverWait waitelemt = new WebDriverWait(driver, tiem);
		waitelemt.until(ExpectedConditions.elementToBeClickable(xpathExpression));
	}
	//                   当�?元素是�?�存在
	public static void presenceOfElementLocated(WebDriver driver,long tiem ,By xpathExpression) {
		WebDriverWait waitelemt = new WebDriverWait(driver, tiem);
		waitelemt.until(ExpectedConditions.elementToBeSelected(xpathExpression));
	}
	//                   当�?文本是�?�存在
	public static void textToBePresentInElementLocated(WebDriver driver,long tiem ,String xpathExpression) {
		WebDriverWait waitelemt = new WebDriverWait(driver, tiem);
		waitelemt.until(ExpectedConditions.textToBePresentInElementLocated(null, xpathExpression));
	}
	

	
}
