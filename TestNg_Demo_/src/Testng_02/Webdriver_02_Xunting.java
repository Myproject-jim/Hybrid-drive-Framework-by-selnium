package Testng_02;

import org.testng.annotations.Test;

import Testng_01.Base_webdriver;

import org.testng.annotations.BeforeMethod;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;

public class Webdriver_02_Xunting extends Base_webdriver {
  @Test
  public void testajaxoption() {
	  WebElement hanginputbox = driver.findElement(By.id("query"));
	  hanginputbox.click();
	  List<WebElement> suggestions = driver.findElements(By.xpath("//*[@id='vl']/div/ul/li"));
	  for (WebElement webElement : suggestions) {
		  //通过元素的文本事先判断 来进行实现事件点击
		if (webElement.getText().contains("6亿人月收入仅一千")) {
			System.out.println(webElement.getText());
			webElement.click();
			break;
		}else {
			
		}
	}
	 
	  WebElement suggestion = driver.findElement(By.xpath("//*[@id='vl']/div/ul/li"));
	  suggestion.click();
	  
	  WebElement mouse = driver.findElement(By.xpath("d"));
	  Actions action = new Actions(driver);
	  action=new Actions(driver);
	  action.moveToElement(mouse).perform();
	  action.click();
  }
  @BeforeMethod
  public void beforeMethod() {
   super.windows();
  
  }

  @AfterMethod
  public void afterMethod() {
  }

}
