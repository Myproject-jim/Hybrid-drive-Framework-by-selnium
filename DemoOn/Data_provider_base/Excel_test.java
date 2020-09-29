package Data_provider_base;

import org.testng.annotations.Test;

import Testng_01.Base_webdriver;

import org.testng.annotations.BeforeMethod;

import java.io.BufferedReader;
import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;

public class Excel_test  extends Base_webdriver{

	  @DataProvider
	  public Object[][] dp() throws IOException {
	    return Excel_until.exceluntio("C:\\Users\\JIAMING.YANG\\Desktop", "02.xlsx", "Sheet1");
	  }
  @Test(dataProvider = "dp")
  public void caseStep(String value1, String value2,String value3) {
	  driver.findElement(By.id("query")).sendKeys(value1+""+value2+value3);
	  
	  driver.findElement(By.id("stu")).click();
	  
	  
  }
  @BeforeMethod
  public void beforeMethod() {
	  super.windows();
  }

  @AfterMethod
  public void afterMethod() {
  }


}
