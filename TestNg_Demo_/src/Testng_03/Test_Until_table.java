package Testng_03;

import org.testng.annotations.Test;

import Testng_01.Base_webdriver;
import bsh.commands.dir;
import cn.AutoFramk.ConfigUntil.DatatimeUnit;

import org.testng.annotations.BeforeMethod;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;

public class Test_Until_table extends Base_webdriver {
  @Test
  public void casetest() throws InterruptedException, IOException {
//	  driver.findElement(By.xpath("/html/body/div[4]/div/div[5]/a[1]")).click();
//      Thread.sleep(3000);
//	  WebElement webtable = driver.findElement(By.className("el-table el-table--fit el-table--enable-row-hover el-table--enable-row-transition el-table--mini"));
//	  
//	  Test_table_until table = new Test_table_until(webtable);
//	  
//	  WebElement cell = table.getcell(3, 1);
//	
//	  table.getWebElementcell(2, 2, By.xpath(""));
		Date date=new Date();
		String picdir = "E:\\"+String.valueOf(DatatimeUnit.getyear(date));
		File file = new File(picdir);
		file.createNewFile();
  }
  @BeforeMethod
  public void beforeMethod() {
	  
//	  super.windows();
  }

  @AfterMethod
  public void afterMethod() {
//	 driver.quit();
  }

}
