package Testng_02;

import org.testng.annotations.Test;

import Testng_01.Base_webdriver;

import org.testng.annotations.BeforeMethod;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

public class Webdriver_Scroll extends Base_webdriver{
	JavascriptExecutor js;
  @Test(priority = 1)
  public void case1() {
	 

//	  WebElement hanginputbox = driver.findElement(By.id("query"));
//	  hanginputbox.click();
//	  List<WebElement> suggestions = driver.findElements(By.xpath("//*[@id='vl']/div/ul/li"));
//	  for (WebElement webElement : suggestions) {
//		  //通过元素的文本事先判断 来进行实现事件点击
//		if (webElement.getText().contains("6亿人月收入仅一千")) {
//			System.out.println(webElement.getText());
//			webElement.click();
//			break;
//		}else {
//			
//		}
//	}
//	  
//	  WebElement suggestion = driver.findElement(By.xpath("//*[@id='vl']/div/ul/li"));
//	  suggestion.click();
//	  WebDriverWait wait = new WebDriverWait(driver, 5);
//	  wait.until(new ExpectedCondition<Boolean>() {
//
//		@Override
//		public Boolean apply(WebDriver arg0) {
//			// TODO Auto-generated method stub
//			String text = driver.findElement(By.id("querybox_up")).getText();
//			Assert.assertEquals(text, "6亿人月收入仅一千");
//			return true;
//		}
//	});

	  
//   
//	 ((JavascriptExecutor)driver).executeScript("window.scrollBy(0,300)");
//	 try {
//		Thread.sleep(1000);
//	} catch (InterruptedException e1) {
//		// TODO Auto-generated catch block
//		e1.printStackTrace();
//	}
	//滑动到页面的最上方
     ((JavascriptExecutor)driver).executeAsyncScript("window.scrollTo(0,document.body.scrollBottom)");
	  try {
		Thread.sleep(3000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	  
  }
  @Test(priority = 2,enabled = false)
  public  void case2() {
	  
	  WebElement element = driver.findElement(By.xpath(""));
	  //根据元素位置的 将滚动条 定位到指定到元素定位到元素的位置
	 ((JavascriptExecutor)driver).executeAsyncScript("arguments[0].scrollIntoview();", element);
	  try {
		Thread.sleep(3000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	  
  }
  @Test(priority = 3,enabled = true)
  public void case3() {
	  
	  
	  JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
	  jsExecutor.executeAsyncScript("window.scrollBy(0,300)");
	  
	  try {
		Thread.sleep(3000);
	} catch (Exception e) {
		// TODO: handle exception
	}
  }
  @BeforeMethod
  public void beforeMethod() {
	  super.windows();
  }

  @AfterMethod
  public void afterMethod() {
  }

}
