package TestDemo;

import org.testng.annotations.Test;

import cn.AutoFrame.AppMoules.Intro_Action;
import cn.AutoFrame.Until.Base_webdriver_browser;
import cn.AutoFrame.Until.Constant;
import cn.AutoFrame.Until.Excel_until;
import cn.AutoFrame.Until.Log;

import org.testng.annotations.BeforeMethod;

import static org.testng.Assert.assertTrue;

import java.io.FileNotFoundException;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

public class Excel_test extends Base_webdriver_browser {
  @Test
  public void read_setexcel() throws InterruptedException {
		Log.Start_test("111");
	  String username = Excel_until.getdata_excel(1, 1);
	  
	  String password = Excel_until.getdata_excel(1, 2);
	  
	  String login_token=Excel_until.getdata_excel(1, 3);
	  
	  Intro_Action.execute(driver, username, password, login_token);
	  Thread.sleep(5000);
	  assertTrue(driver.getPageSource().contains(username));
	  
	  assertTrue(driver.getPageSource().contains(password));
	  
	  assertTrue(driver.getPageSource().contains("successful"));
	  
	  WebDriverWait wait = new WebDriverWait(driver, 5);
	  
	  wait.until(ExpectedConditions.elementToBeSelected(By.xpath("div")));
	  
	  try {
		Excel_until.setdata_excel(1, 4, "执行�?功");
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
  }
  @BeforeMethod
  public void beforeMethod() {
//	  super.chrome();
//	  driver.get(Constant.URL_STRING);
  }

  @AfterMethod
  public void afterMethod() {
  }
  //加载excel表格
  @BeforeClass 
  public void beforclass() {
	  Excel_until.setExcelfile(Constant.TESTDATAEXCELPATH_STRING, Constant.EXCEL_SHEET_STRING);
  }

}
