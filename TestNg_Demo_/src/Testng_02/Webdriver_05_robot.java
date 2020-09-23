package Testng_02;

import org.testng.annotations.Test;

import Testng_01.Base_webdriver;

import org.testng.annotations.BeforeMethod;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;

public class Webdriver_05_robot extends Base_webdriver {
  @Test
  public void f() {
	  WebDriverWait waitime = new WebDriverWait(driver, 1000);
	  waitime.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.id("query")));
	  //调用封装的方法
	  this.selectionkey("build");
	  
	  this.Tablekey();
	  
	  this.Enterkey();
	  
  }
  @BeforeMethod
  public void beforeMethod() {
	  super.windows();
  }

  @AfterMethod(enabled = false)
  public void selectionkey(String string) {
//	  将现有的参数传进  stringselection 函数中 完成实例化
	 StringSelection Selection = new StringSelection(string);
	 //使用toolkit 的setcontents 方法 函数内容放到剪贴板中
	  Toolkit.getDefaultToolkit().getSystemClipboard().setContents(Selection, null);
	  
	 Robot robot=null;
	 
	 try {
		robot=new Robot();
	} catch (AWTException e) {
		// TODO: handle exception
		e.printStackTrace();
	}
	 robot.keyPress(KeyEvent.VK_CONTROL);
     robot.keyPress(KeyEvent.VK_V);
     //释放当前按钮
     robot.keyRelease(KeyEvent.VK_V);
     robot.keyRelease(KeyEvent.VK_CONTROL);
	 
  }
  public void Tablekey() {
	  Robot robot = null;
	  try {
		  robot = new Robot();
	}catch (AWTException e) {
		// TODO: handle exception
		e.printStackTrace();
	}
	 robot.keyPress(KeyEvent.VK_TAB);
	 
	 robot.keyRelease(KeyEvent.VK_TAB);
	 
  }
  public void Enterkey() {
	  Robot robot = null;
	  try {
		  robot =  new Robot();
	} catch (AWTException e) {
		// TODO: handle exception
		e.printStackTrace();
	}
	 robot.keyPress(KeyEvent.VK_ENTER);
	 
	 robot.keyRelease(KeyEvent.VK_ENTER);
	 
  }
  

}
