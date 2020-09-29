package Data_provider_base;

import org.testng.annotations.Test;

import Testng_01.Base_webdriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;

import javax.naming.directory.SearchResult;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

public class Data_Testng  extends Base_webdriver{
   
	private static final CharSequence SearchResult = "sougou";
 
	
	@DataProvider(name="data2")
	public Object[][] data2(){
		 return new Object[][] {
			 
		 };
	}
	
	@DataProvider(name="seachnames")
	  public Object[][] dp() {
	    return new Object[][] {
//	      new Object[] { 1,"build"},
//	      new Object[] { 2, "b" },
	    	{"sougou","ff","sss"},
	    	
	    };
	  }
	
  @Test(dataProvider = "seachnames")
  public void data_test(String snm1,String snm2,String snm3) {
	  driver.findElement(By.id("query")).sendKeys(snm1+""+snm2);
	
	  try {
		Thread.sleep(3000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	  Assert.assertTrue(driver.getPageSource().contains(snm3));
  }
  @BeforeMethod
  public void beforeMethod() {
	  super.windows();
  }

  @AfterMethod
  public void afterMethod() {
  }

}
class data2{
	
	
}
