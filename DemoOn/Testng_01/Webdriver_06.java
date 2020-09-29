package Testng_01;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.awt.Button;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

public class Webdriver_06 extends Base_webdriver{
  @Test
  public void SwicheFrame() {
//	  driver.switchTo().frame("left");
//	  WebElement leftframe = driver.findElement(By.xpath("div"));
//	  leftframe.click();
//	  driver.switchTo().defaultContent();
//	  driver.switchTo().frame("right");
//	  WebElement rightframe = driver.findElement(By.xpath("div"));
//	  Assert.assertEquals("content", rightframe.getText());
//	  
////	  通过此方法来跳出当前frame元素
//	  driver.switchTo().defaultContent();
//	 
//	  //通过索引的方式进入frame
//	  driver.switchTo().frame(3);
//	  //目的：通过在Frames的list中 去查找 元素集中去定位 某一个frame
//	  //遍历出当前页面中的所有frame
//	  List<WebElement> fraems = driver.findElements(By.tagName("frame"));
//	  for (WebElement webElement : fraems) {
//		  //
//		if (driver.getPageSource().contains("build")) {
////			通过其中frame的唯一个特定的元素去定位 和一些其他的操作
//			WebElement contentelememt = driver.findElement(By.xpath("div"));
//			//断言当前所定位的元素 是否存在
//			Assert.assertTrue(contentelememt.isDisplayed());
//			driver.switchTo().defaultContent();
//			break;
//			
//			  
//		}
//	  driver.switchTo().defaultContent();
//	}
	  driver.switchTo().frame("gg");
	  //设置cookie 通过seleinum
//	   1：遍历出当前页面所有的cookie
	  Set<Cookie> curretcookies = driver.manage().getCookies();
	  Cookie newCookie = new Cookie ("Cookiename","Cookievalue");
	  System.out.println(String.format("Domain->name->value->expiry->path"));
	 
	  for (Cookie cookie : curretcookies) {
		System.out.println(String.format(cookie.getName()));
	}
	  driver.manage().deleteCookie(newCookie);
	  driver.manage().deleteAllCookies();
	  driver.manage().deleteCookieNamed(".sogou.com");
  }
  @BeforeMethod
  public void beforeMethod() {
	  super.windows();
	  
  }

  @AfterMethod
  public void afterMethod() {
  }

}
