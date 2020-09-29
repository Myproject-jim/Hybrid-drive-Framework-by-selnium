package Testng_02;

import org.testng.annotations.Test;

import Testng_01.Base_webdriver;

import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;

public class Heighlyelement extends Base_webdriver{
  @Test
  public void case1() throws InterruptedException {
	  WebElement searchinpubox = driver.findElement(By.id("query"));
	  WebElement sunbutton = driver.findElement(By.id("stb"));
	
	  heightly(searchinpubox);
	  searchinpubox.sendKeys("offical");
	  Thread.sleep(3000);
	  heightly(sunbutton);
	  Thread.sleep(3000);
	  heightly(sunbutton);
	 
  }
  public void heightly(WebElement element) {
	JavascriptExecutor js=(JavascriptExecutor)driver;
	/*
	 * arguments对象是所有（非箭头）函数中都可用的局部变量。你可以使用arguments对象在函数中引用函数的参数。此对象包含传递给函数的每个参数，第一个参数在索引0处
	 * */
//	js.executecScript();  通过javascript 来控制 高亮的点 
	
	 js.executeScript("arguments[0].setAttribute('style',arguments[1]);", element," color: rgb(226, 113, 21);");
	  
}
  @BeforeMethod
  public void beforeMethod() {
	  
	super.windows();  
	  
  }

  @AfterMethod
  public void afterMethod() {
  
  
  }

}
