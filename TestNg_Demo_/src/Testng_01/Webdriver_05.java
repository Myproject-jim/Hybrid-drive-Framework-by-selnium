package Testng_01;

import org.testng.annotations.Test;
import org.testng.log4testng.Logger;

import Allbrowser.chrome;
import org.testng.annotations.BeforeMethod;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

public class Webdriver_05 extends Base_webdriver {
@Test
  public void identityWindowstitle() {
	//使用title 识别判断当前弹出的浏览器窗口
	String identityw=driver.getWindowHandle();
	WebElement link = driver.findElement(By.xpath("//a"));
	link.click();
	Set<String> allhandles = driver.getWindowHandles();
	//isempty判断句柄的存储是否为空有在做进一步判断
	if (!allhandles.isEmpty()) {
//		循环遍历当前页面所有的句柄
		 for (String windowshandles : allhandles) {
			 try {
				 // 
					driver.switchTo().window(windowshandles).getTitle();
				 	System.out.println(windowshandles);
				 	//通过title进行判断当前页面是否zhunque
				 	
				 	driver.switchTo().window(identityw).getPageSource();
				 	if (driver.switchTo().window(windowshandles).getTitle().equals("MTBF_TOOLS")) {
						driver.findElement(By.xpath("")).sendKeys("当前浏览器页面zhengque");
					}
			} catch (NoSuchElementException e) {
				Assert.fail("no");
				// TODO: handle exception
			}
			 
			}	
	}
	driver.switchTo().window(identityw);
	Logger("done");
    WebDriverWait watitime = new WebDriverWait(driver, 5);
    watitime.until(new ExpectedCondition<Boolean>() {

		@Override
		public Boolean apply(WebDriver el) {
			// TODO Auto-generated method stub
			
			return el.getTitle().equals("搜狗");
		}
	});
	//alert弹出框断言
    WebElement buton = driver.findElement(By.xpath("div/div"));
     buton.click();
     try {
    	 //自动获取alert 的弹出框 
		Alert alertt = driver.switchTo().alert();
		Assert.assertEquals("alert content",alertt.getText() );
		//点击alert的确定按钮
		alertt.accept();
		//alert  抛异常
	} catch (NoAlertPresentException e) {
		// TODO: handle exception
	}
    //confirm弹出框 与 alert  弹出框用法相同
     Alert adlert = driver.switchTo().alert();
     adlert.accept();
     adlert.getText();
     //点击弹框取消按钮
     adlert.dismiss();
     //弹出框填写的相关数据
     adlert.sendKeys("ddd");
     
     
     
     
     
     
  }
  private void Logger(String string) {
	// TODO Auto-generated method stub
	System.out.println("done");
}
@BeforeMethod
  public void beforeMethod() {
	  super.windows();
	  
  }

  @AfterMethod
  public void afterMethod() {
  }

}
