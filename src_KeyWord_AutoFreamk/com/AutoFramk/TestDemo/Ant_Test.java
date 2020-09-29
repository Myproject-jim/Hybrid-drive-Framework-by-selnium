package com.AutoFramk.TestDemo;

import org.testng.annotations.Test;

import cn.AutoFrame.Until.Base_webdriver_browser;
import cn.AutoFramk.ConfigUntil.ObjectMap;
import cn.AutoFramk.Constants.Constant_s;

import org.testng.annotations.BeforeMethod;

import java.io.FileNotFoundException;

import org.openqa.selenium.By;
import org.testng.annotations.AfterMethod;

public class Ant_Test  extends Base_webdriver_browser{
  @Test
  public void f() throws InterruptedException, FileNotFoundException {
	 ObjectMap objectmap = new ObjectMap(Constant_s.PATH_PROPERITES);
	  driver.findElement(By.id("userName")).sendKeys("admin");
	  Thread.sleep(2000);
	  driver.findElement(By.id("password")).sendKeys("ant.design");
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div/form/div[3]/div/div/div/button/span")).click();
	  Thread.sleep(2000);
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
