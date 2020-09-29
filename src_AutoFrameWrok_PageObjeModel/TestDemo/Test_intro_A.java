package TestDemo;

import org.testng.annotations.Test;

import cn.AutoFrame.AppMoules.Intro_Action;
import cn.AutoFrame.Until.Base_webdriver_browser;
import cn.AutoFrame.Until.Constant;
import cn.AutoFrame.Until.Excel_until;


import org.testng.annotations.BeforeMethod;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;

public class Test_intro_A extends Base_webdriver_browser {
	@Test
	public void Login() {
		
	}
  @Test(dataProvider = "dp",priority = 2)
  public void f(String user, String password,String token) {
	  Intro_Action.execute(driver, user, password, token);
	  Intro_Action.sogou(driver, "dd");
	  
  }
  @BeforeMethod
  public void beforeMethod() {
	  
	  
	  
	  
  }

  @AfterMethod
  public void afterMethod() {
  }


  @DataProvider
  public Object[][] dp() throws IOException {
	  return Excel_until.auto_Getdata_excel(Constant.TESTDATAEXCELPATH_STRING, Constant.TESTDATAEXCELPATH_STRING);
  }
}
