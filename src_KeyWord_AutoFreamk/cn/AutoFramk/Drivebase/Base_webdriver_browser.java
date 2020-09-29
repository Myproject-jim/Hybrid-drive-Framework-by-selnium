package cn.AutoFramk.Drivebase;

import java.sql.DriverManager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/*
 * �?装 �?览器驱动
 */
public class Base_webdriver_browser {
	
	
	public static WebDriver driver;
	
	public  static void chrome() {
		 System.setProperty("webdriver.chrome.driver","C:\\Program Files (x86)\\Google\\Chrome\\Application\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
	}
	public static void Firefox() {
		 System.setProperty("webdriver.chrome.driver","C:\\Program Files (x86)\\Google\\Chrome\\Application\\chromedriver.exe");
		driver=new FirefoxDriver();
		driver.manage().window().maximize();
	}

}
