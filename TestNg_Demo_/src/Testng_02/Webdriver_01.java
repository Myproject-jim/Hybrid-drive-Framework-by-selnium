package Testng_02;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Testng_01.Base_webdriver;

public class Webdriver_01 extends Base_webdriver {
    JavascriptExecutor js;
	@Test
  public void advancetest() {
	 //使用java script executor对象实现页面单击操作
	  WebElement sendbox = driver.findElement(By.id("query"));
	  WebElement btu = driver.findElement(By.id("sb"));
	  sendbox.sendKeys("me");
	  //通过调用构造的函数来实现相关点击
	  javascriptclick(btu);
	  
  }
	public void javascriptclick(WebElement element) {
		try {
			if (element.isDisplayed()&&element.isEnabled()) {
				
				//通过javascript 来实现事件点击~
				((JavascriptExecutor)driver).executeScript("arguments[0].click()", element);
			}else {
				System.out.println("not found element");
			}
		} catch (NoSuchElementException e) {
			// TODO: handle exception
			//打印出错的堆栈信息
			System.out.println("页面元素没有赋在网页中"+e.getStackTrace());
			
		
		}
	}
	//鼠标悬停 单击事件

  @BeforeMethod
  public void beformethod() {
	  super.windows();
  }
}
