package Allbrowser;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class Browser_s {
	public WebDriver driver;
	String url="http://localhost:8080/#/";
	  @Parameters("browser")
	  @BeforeClass
	  public void beforeClass(String Browser) {
		   if(Browser.equalsIgnoreCase("chrome")) {
			  System.setProperty("webdriver.chrome.driver","C:\\Program Files (x86)\\Google\\Chrome\\Application\\chromedriver.exe");
				 driver =new ChromeDriver();
				 
				 driver.getTitle();
		  }
		  
	  }
  @Test
  public void case1() {
	  driver.get(url);  
	  driver.findElement(By.xpath("/html/body/div[7]/div/div[5]/a[1]")).click();
      driver.findElement(By.className("ivu-icon ivu-icon-md-settings")).click();;
  }


  @AfterClass
  public void afterClass() {
  }

}
