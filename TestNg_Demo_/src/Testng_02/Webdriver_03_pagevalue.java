package Testng_02;

import org.testng.annotations.Test;

import Testng_01.Base_webdriver;

import org.testng.annotations.BeforeMethod;

import javax.swing.text.html.CSS.Attribute;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;

public class Webdriver_03_pagevalue extends Base_webdriver {
	/*
	 *模拟被测页面  <input value="setversion"  type="test" class='ddd'></input>
	*/
	//目的：当有些div页面元素 不能按照正常的方式去进行 操作 ，这时我们就需要通过修改JavaScript来修改 元素的属性 从而进行元素操作
  @Test
  public void setpagevalue() {
	  WebElement testbox = driver.findElement(By.id("text"));
	  //设置文本框的属性值
	  setattribute(driver, testbox, "value", "EXCHANGE VALUE ON INPUT");
	  //设置文本框的size
	  setattribute(driver, testbox, "size", "10");
	  //
	  
  }
  public void setattribute(WebDriver webDriver,WebElement element,String attributeName,String value) {
	  //执行javascript的类   创建 执行javascript的对象
	JavascriptExecutor js=(JavascriptExecutor)driver;
	//设置JavaScript 的相关属性
	js.executeScript("arguments[0].setAttribute(arguments[1],arguments[2])", element,attributeName,value);
}
  public void removermethods(WebDriver webDriver,WebElement element,String attributeName,String value) {
	JavascriptExecutor js = (JavascriptExecutor)driver;
	
	js.executeScript("arguments[0].removeAttribute(arguments[1],arguments[2])", element,attributeName,value);
}
  
  @Test
  public void testdatapicker() {
	  //直接定位 日历对话框
	 WebElement datapicker = driver.findElement(By.id("datapicker"));
	 //创建firefox 的对象，通过setpreference 来设置 brower 的相关属性以及类型文件
	  FirefoxProfile Profiles = new FirefoxProfile();
	  
	  Profiles.setPreference("", "");
	  
	  
	  
	  /*
	   * 通过 定位 页面元素上传文件
	   * 
	   * */
	  //上传文件
	  WebElement fileinbox = driver.findElement(By.xpath("file"));
	  fileinbox.sendKeys("file path");
	  WebDriverWait wait = new WebDriverWait(driver, 10);
	  //显示等待时间 判断  当前按钮是否为可点击的状态
	  wait.until(ExpectedConditions.elementToBeClickable(By.id("btu")));
	  
	  WebElement inpustbElement=driver.findElement(By.id("filement"));
	  inpustbElement.click();
	  //显示等待 下载过程  断言 title 是否符合预期结果
	  wait.until(ExpectedConditions.titleContains("THE FILE WAS down load"));
	   Alert alert = driver.switchTo().alert();
	  alert.getText();
	  /*
	   *
	   *通过第三方工具 完成上传的文件的操作 autolt 第三方工具
	   *
	   * 
	   * 
	   */
	  
	  
	  
	  
  }
  @BeforeMethod
  public void beforeMethod() {
	  super.windows();
  }

  @AfterMethod
  public void afterMethod() {
  }

}
