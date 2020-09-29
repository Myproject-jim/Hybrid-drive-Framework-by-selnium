package Testng_01;

import org.testng.annotations.Test;

import org.testng.annotations.BeforeMethod;

import static org.testng.Assert.assertEquals;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.*;
import org.apache.*;
import org.apache.commons.io.FileUtils;
public class Webdriver_03 extends Base_webdriver{
@Test
  public void windowsprocessofkill() {
	  
	//kill进程
	
	
	// take photo 
	TakesScreenshot screenShot = (TakesScreenshot) driver;
	File file = screenShot.getScreenshotAs(OutputType.FILE);
	try {
		FileUtils.copyFile(file, new File("C:\\Picture\\test.png"));
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	//check page element
	WebElement webelemntd = driver.findElement(By.xpath("//[p1]"));
	String cogtext=webelemntd.getText();
	Assert.assertEquals("Requestion version", cogtext);
	Assert.assertTrue(cogtext.contains("Requestion"));
	Assert.assertTrue(cogtext.startsWith("request"));
	Assert.assertTrue(cogtext.endsWith("version"), "version");
	//run javascript
	JavascriptExecutor js=(JavascriptExecutor)driver;
	String tile=(String) js.executeScript("return  document.title");
	//拖拽element
	WebElement picture = driver.findElement(By.xpath("div>divv"));
	
	for (int i = 0; i < 5; i++) {
		new Actions(driver).dragAndDropBy(picture, 0,12).build().perform();
		 Actions act = new Actions(driver);
		 act.doubleClick(picture).build().perform();
	}
	//模拟键盘操作
	Actions kebd = new Actions(driver);
	//keyDOWN && KEYUP 分别按下 和释放 当前事件
	kebd.keyDown(Keys.CANCEL);
	kebd.keyUp(Keys.CANCEL);
	kebd.keyDown(Keys.DOWN);
	kebd.keyDown(Keys.SHIFT).sendKeys("abcdefg");

	//模拟鼠标单击事件
	Actions mouseaction = new Actions(driver);
	mouseaction.contextClick(driver.findElement(By.xpath("div/div"))).perform();;
	mouseaction.contextClick();
	//鼠标悬停
	Actions mousex = new Actions(driver);
	WebElement btu = driver.findElement(By.xpath(""));
	//moveTOELEMENT actions 鼠标悬停的方法
	mousex.moveToElement(btu).perform();
	//悬停等待时间
	try {
		Thread.sleep(5000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	//单击鼠标左键 长按5秒不松
     mousex.clickAndHold(btu);
 	try {
		Thread.sleep(5000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

 	//获取 当前元素信息
 	WebElement cheobox = driver.findElement(By.xpath("div/div1"));
  cheobox.sendKeys("3.5.3555.33.");
  String build="3.5.555.3";
  ////value 表示当前元素的value 值
  String getvalue = cheobox.getAttribute("value");
  Assert.assertEquals(getvalue, build);
  //获取css 属性值
  	String cssasert = cheobox.getCssValue("height");
     assertEquals(cssasert, "25px");
   
 try {
	
} catch (Exception e) {
	// TODO: handle exception
}

}
  @BeforeMethod
  public void beforeMethod() {
	  System.setProperty("webdriver.chrome.driver","C:\\Program Files (x86)\\Google\\Chrome\\Application\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.get("http://localhost:8080/#/");
  }

  @AfterMethod
  public void afterMethod() {
  }

}
