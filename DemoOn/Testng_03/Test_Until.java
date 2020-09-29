package Testng_03;

import org.testng.annotations.Test;

import Testng_01.Base_webdriver;
import Testng_04_log4j.Log;


import org.testng.annotations.BeforeMethod;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.sql.Driver;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

public class Test_Until extends Base_webdriver {
  @Test
  public void testcaseuntil() {
	  	driver.findElement(By.id("query")).sendKeys("^^^^^");;
	  	Log.info("sendkes");
	  	driver.findElement(By.id("stb")).click();
	  	Log.info("this is click");
	  	TakeScreen(driver, "E:\\");
	  	try {
		    Assert.assertTrue(driver.getPageSource().contains("sougddd"));
		} catch (NoSuchElementException e) {
			// TODO: handle exception	
			e.printStackTrace();
			Log.warn("this is error");
		}

  }
  @BeforeMethod
  public void beforeMethod() {
	  
	  super.windows();
  }

  @AfterMethod
  public void afterMethod() {
	  
	  
	  
  }
  public void TakeScreen(WebDriver driver,String path) {
	Date date=new Date();
    String	picdir=path+String.valueOf(Data_time.getyear(date)+"-"+String.valueOf(Data_time.getmonth(date)+"-"+String.valueOf(Data_time.getday(date))));
    if (! new File(picdir).exists()) {
    	File_Until.createdir(picdir);
	}
    
    String filepath=picdir+"\\"+String.valueOf(Data_time.gethour(date)+"-"+String.valueOf(Data_time.getminute(date))+"-"+String.valueOf(Data_time.getsecond(date)))+".png";
    System.out.println(filepath);	
    
    //截图保存
	TakesScreenshot screenShot = (TakesScreenshot) driver;
	File file = screenShot.getScreenshotAs(OutputType.FILE);
	try {
		FileUtils.copyFile(file, new File(filepath));
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
    
   

    
    
    
}

}
