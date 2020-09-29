package Data_provider_base;

import org.testng.annotations.Test;

import Testng_01.Base_webdriver;
import net.bytebuddy.asm.Advice.Return;

import org.testng.annotations.BeforeMethod;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;

public class CSV_Test extends Base_webdriver {
  @Test(dataProvider = "testdata")
  public void f(String n, String s,String b) {
	  driver.findElement(By.id("query")).sendKeys(n+""+s+b);
	  
  }
  @BeforeMethod
  public void beforeMethod() {
	  super.windows();
  }

  @AfterMethod
  public void afterMethod() {
  }


  @DataProvider
  public Object[][] testdata() throws IOException {
    return CSV_Until.getdata("C:\\Users\\JIAMING.YANG\\Desktop\\01.csv");
  }
}
