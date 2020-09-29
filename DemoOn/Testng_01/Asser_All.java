package Testng_01;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

public class Asser_All {
	public WebDriver driver;

	
  @Test(enabled=false)
  public void Case1() {
	  System.out.println("run");
//	   xpath定位  //*[@id="app"]/div/div[2]/div/div/div/div/div/div/div[3]/div/div/div/div[2]/div[1]/div[5]/div[1]/div/div[1]/div/button
	   WebElement dd = driver.findElement(By.xpath("//*[@id=\"app\"]//button"));
	   dd.click();
	   driver.findElement(By.name("user namer"));
	    //元素 name 定位   <input name="password“></input>
//	   CSS 定位
	   driver.findElement(By.className("ivu-btn ivu-btn-primary ivu-btn-ghost")); 
	   driver.findElement(By.cssSelector("html>body>div>input[type='button']"));
	   //文字定位
//	   link text连接名字
	   driver.findElement(By.linkText("Linux count:"));
//	    link 部分连接名字
	   driver.findElements(By.partialLinkText("linux"));
	  //ID
	   driver.findElement(By.id(""));
	 //*[@id="app"]/div/div[2]/div/div/div/div/div/div/div[1]/div/button[1]/span
	 //*[@id="app"]/div/div[2]/div/div/div/div/div/div/div[1]/div/div[3]/div[1]/div/input
	 //*[@id="app"]/div/div[2]/div/div/div/div/div/div/div[1]/div/button[2]
	   driver.findElement(By.xpath("//"));
	   
	   driver.findElement(By.cssSelector(""));
	   //判断当前元素是否存在
	Assert.assertTrue(dd.isDisplayed());
	
//	Assert.assertFalse(dd.isDisplayed())；
		
	 
  }
  @Test
  public void case2() throws InterruptedException {
	  driver.findElement(By.xpath("/html/body/div[7]/div/div[5]/a[1]")).click();
	//*[@id="app"]/div/div[1]/div/div[1]/div[2]/a/button/span
	//*[@id="app"]/div/div[2]/div/div/div/div/div/div/div[1]/div/button[1]
	//*[@id="app"]/div/div[2]/div/div/div/div/div/div/div[1]/div/button[1]/span
//	   driver.findElement(By.xpath("//*[@id=\"app\"]//button/span")).click();
       driver.findElement(By.className("ivu-icon ivu-icon-md-settings")).click();;
//       driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[2]/div/div/div/div/div/div/div[3]/div/div/div/div[2]/div[2]/div/div[1]/div[2]/table/tbody/tr[3]/td/div/div/button/span")).click();
       
//       List<WebElement> table = driver.findElements(By.className("ivu-table-tbody"));
//	for(  WebElement rows:table) {
//		  List<WebElement> cols = rows.findElements(By.tagName("td"));
//		  for(WebElement col:cols) {
//			  System.out.printf(col.getText());
//		  }
//	}
	  System.out.printf("tiem out"); 
	  
	  
	
  }
  @BeforeMethod
  public void beforeMethod() {
	  
	  System.setProperty("webdriver.chrome.driver","C:\\Program Files (x86)\\Google\\Chrome\\Application\\chromedriver.exe");
		 driver =new ChromeDriver();
		 driver.get("http://localhost:8080/#/");
		 
		 driver.getTitle();
		 
  }

  @AfterMethod
  public void afterMethod() {
//	  driver.quit();
  }

}
