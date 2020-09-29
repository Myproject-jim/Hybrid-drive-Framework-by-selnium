package Data_provider_PageUntil;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Testng_01.Base_webdriver;

public class Writr_Email  extends Base_webdriver{
	WebDriver driver;
  @Test
  public void loging() throws InterruptedException {
	  //创建登录类对象
	  email_login login = new email_login(driver);
	  //自动加载load 方法 加载被测页面
	  login.get();
	  //调用登录方法
	  Home_page home_page = login.login();
	  //断言当前页面是否正确
	 Assert.assertTrue(login.getscource().contains("content"));
	  
	  
  }
  @Test
  public void logerror() {
	  email_login loginerror = new email_login(driver);
	  
	  loginerror.get();
	  
	  loginerror.loginerror();
	  
	  Assert.assertTrue(loginerror.getscource().contains("content"));
  }
  
  @Test
  public void witerEmail() throws InterruptedException {
	  Home_page write = new Home_page(driver);
	  
	  write.get();
	  
	  write.writenemail();
	  
	  
  }
  @BeforeMethod
  public void bforeMethod() {
	  System.setProperty("webdriver.chrome.driver","C:\\Program Files (x86)\\Google\\Chrome\\Application\\chromedriver.exe");
	  driver = new ChromeDriver();  
  }
}
