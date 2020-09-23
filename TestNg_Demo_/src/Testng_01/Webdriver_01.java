package Testng_01;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

public class Webdriver_01 extends Base_webdriver {
  String url1="http://www.sogou.com";
  String url2="http://www.baidu.com";
  @Test
  public void case1() throws InterruptedException {
	  //前进后退当前页面的方法 模拟单机网页功能
	  driver.manage().window().maximize();//windowpage is to max
	  driver.navigate().to(url1);
	  Thread.sleep(1000);

	  driver.navigate().to(url2);
	  driver.navigate().back();
	  driver.navigate().forward();
	  driver.wait(10000);
	  //刷新当前网页
	  driver.navigate().refresh();
	  driver.manage().window();
	  //操作当前浏览器窗口
	  Point point = new Point(150,150);
	  Dimension dimension = new Dimension(500,500);
	  driver.manage().window().setPosition(point);
	  System.out.println(driver.manage().window().getPosition());
	  driver.manage().window().setSize(dimension);
	  System.out.println(driver.manage().window().getSize());
//	  driver.switchTo().window(arg0).getPageSource();
	  driver.manage().window().maximize();
	 //获取当前页面的源码 and title
	  String title = driver.getTitle();
	  System.out.println(title);
	  //断言当前获取的名称是否和预期的结果相一致
	  Assert.assertEquals("搜dd索", title);
	  //断言当前源码中是否有要匹配额字符
	  Assert.assertTrue(driver.getPageSource().contains("sougou"));
	  //判断url
	  Assert.assertEquals("www.sougou.com", driver.getCurrentUrl());
	  // 单机事件  输入内容  清除原有输入框的内容
	  WebElement btu = driver.findElement(By.xpath("div/div/div3/input"));
	  btu.clear();
	  btu.sendKeys("ddd");
	  btu.click();
	  //双击某个元素的
	  WebElement intput = driver.findElement(By.xpath("div/div/div3/input"));
	  //声明action事件
	  Actions act = new Actions(driver);
	  //在输入框元素中进行鼠标的双击操作
	  act.doubleClick(intput).build().perform();
	  //操作单选下拉列的表-------------------------------------------------------------------
	  
	  
	  
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.setProperty("webdriver.chrome.driver","C:\\Program Files (x86)\\Google\\Chrome\\Application\\chromedriver.exe");
	  driver=new ChromeDriver();
	  
  }

  @AfterMethod
  public void afterMethod() {
	  
	  
  }

}
