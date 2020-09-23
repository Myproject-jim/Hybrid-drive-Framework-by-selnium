package Testng_01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base_webdriver {
  public WebDriver driver;
  
  public void windows() {
	  System.setProperty("webdriver.chrome.driver","C:\\Program Files (x86)\\Google\\Chrome\\Application\\chromedriver.exe");
	   driver = new ChromeDriver();
//	   driver.get("http://mrbj-auto-01.mr.ericsson.se/BuildService/#/");
	   driver.get("https://www.sogou.com/");
	   driver.manage().window().maximize();
	   
	  
	
  }
}
