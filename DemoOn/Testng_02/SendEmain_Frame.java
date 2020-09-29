package Testng_02;

import org.testng.annotations.Test;
import org.yaml.snakeyaml.tokens.KeyToken;

import Testng_01.Base_webdriver;
import okhttp3.internal.connection.RouteSelector.Selection;

import org.testng.annotations.BeforeMethod;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;

public class SendEmain_Frame extends Base_webdriver {
  @Test
  public void writenEmain() {
	   WebElement user = driver.findElement(By.id("username"));  
	   
	   WebElement password = driver.findElement(By.id("password"));
	   
	   WebElement btu = driver.findElement(By.xpath("btu"));
	   user.sendKeys("");
	   
	   password.sendKeys("");
	   
	   btu.click();
	   
	   WebElement RE=driver.findElement(By.xpath(""));
	   RE.sendKeys("this only re name");
	   //切换frame 道富文本编辑框
	   driver.switchTo().frame("htmlEditor");
	   
	   JavascriptExecutor js=(JavascriptExecutor)driver;
	   //通过javascript 写入富文本框中
	   js.executeAsyncScript("document.getElementByTagName('body')[0].innerHTML='<b>content</b>'");
	   //返回默认区域
	   driver.switchTo().defaultContent();
	  //方法二 通过 robot录入键盘操作 进而操作富文本kuang
	   
	   
	   
  }
  //封装键盘的方法
  public void Keybord_CTRL_V_C(String string) {
	  //通过 stringselection 对象完成参数化
	StringSelection Selectionf = new StringSelection(string);
	//将对象中的数据传入剪贴板中
	Toolkit.getDefaultToolkit().getSystemClipboard().setContents(Selectionf, null);
	Robot robot = null; 
	try {
		new Robot();
	} catch (Exception e) {
		// TODO: handle exception
	}
	robot.keyPress(KeyEvent.VK_CONTROL);
	robot.keyPress(KeyEvent.VK_V);
	robot.keyRelease(KeyEvent.VK_CONTROL);
	robot.keyRelease(KeyEvent.VK_V);
		
}
  public void Tabkebord() {
	  Robot robot=null;
	try {
		robot = new Robot();
	} catch (Exception e) {
		// TODO: handle exception
	}
	robot.keyPress(KeyEvent.VK_TAB);
	robot.keyRelease(KeyEvent.VK_TAB);
	
	
}
  @BeforeMethod
  public void beforeMethod() {
	  super.windows();
  }

  @AfterMethod
  public void afterMethod() {
  }

}
