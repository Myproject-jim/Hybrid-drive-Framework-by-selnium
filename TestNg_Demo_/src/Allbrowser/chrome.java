package Allbrowser;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

public class chrome {
   public WebDriver driver;
   String baserurl="http://localhost:8080/#/";
  @BeforeClass
  public void brfor(String Browser) {
			  System.setProperty("webdriver.chrome.driver","C:\\Program Files (x86)\\Google\\Chrome\\Application\\chromedriver.exe");
				 driver =new ChromeDriver();
				
		
  }
   @Test
   public void f() {
 	  driver.get(baserurl);
 	  driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[2]/div/div/div/div/div/div/div[1]/div/div[1]/div[1]/button")).click();;
   }


  @AfterMethod
  public void afterMethod() {
	  driver.quit();
  }

}
