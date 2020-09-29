package com.AutoFramk.TestDemo;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

import cn.AutoFrame.Until.Base_webdriver_browser;
import cn.AutoFramk.ConfigUntil.ObjectMap;
import cn.AutoFramk.Constants.Constant_s;
import cn.AutoFramk.configuartion.KeywordsAction;

import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.testng.annotations.AfterMethod;

public class Test_Objectmap extends Base_webdriver_browser {

	
  @Test
  public void testant() throws InterruptedException {
//	  ObjectMap_keyword objectmap = new ObjectMap_keyword(Constant_s.PATH_PROPERITES);
//	  driver.findElement(objectmap.getpageElement("login.uesrname")).sendKeys("dd");;
//	  
//	  driver.findElement(objectmap.getpageElement("login.password")).sendKeys("dd");
//	  driver.findElement(objectmap.getpageElement("login.click")).click();
    KeywordsAction keyrow = new KeywordsAction();
	 keyrow.input_username("admin");
   

		Thread.sleep(5000);
	  keyrow.input_password("ant.design");
	  keyrow.click("begin");
	  try {
		Thread.sleep(9000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	driver.findElement(By.xpath("//*[@id=\"root\"]/div/section/aside/div/ul/li[2]/div/span/span[2]")).click();
	try {
		Thread.sleep(9000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	  keyrow.select_from1("2");
	  keyrow.Enter_payaccount("d");
  }
  @BeforeMethod
  public void beforeMethod() {
	  super.chrome();
	  driver.get("https://preview.pro.ant.design/user/login?redirect=https%3A%2F%2Fpreview.pro.ant.design%2Fdashboard%2Fanalysis");
  }

  @AfterMethod
  public void afterMethod() {
  }

}
