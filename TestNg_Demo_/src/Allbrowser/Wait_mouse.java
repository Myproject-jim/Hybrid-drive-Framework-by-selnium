package Allbrowser;

import org.testng.annotations.Test;

import Testng_01.Base_webdriver;

import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;

public class Wait_mouse  extends Base_webdriver{
  @Test
  public void case12() throws InterruptedException {
	  
	  WebElement wati = driver.findElement(By.className("m-arr"));
	  Actions action = new Actions(driver);
	  action.moveToElement(wati).perform();
	  Thread.sleep(5000);
	 WebElement map = driver.findElement(By.xpath("//*[@id=\"map\"]"));
	  map.click();
  }
  @BeforeMethod
  public void beforeMethod() {
	  super.windows();
  }

  @AfterMethod
  public void afterMethod() {
  }

}
