package Testng_01;

import org.testng.annotations.Test;
import org.testng.log4testng.Logger;
import org.testng.annotations.BeforeMethod;
import java.awt.Button;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Timeouts;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

public class Webdriver_04 extends Base_webdriver {
  @Test
  public void timeowait() {
	  //隐式等待 解释：implictlywait 等带元素  如果被查元素没有立刻被找到   自动进入设定等待时长 缺点：元素在设定时间内被找到也不立刻执行而是等过所设定时间在执行
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  try {
		WebElement btu = driver.findElement(By.xpath(""));
		btu.click();
	   System.out.println("found element");
		
		
		
	} catch (Exception e) {
		// TODO: handle exception
	Assert.fail();
	
	}
	  //显示等待时间
	  WebElement onselect = driver.findElement(By.xpath("div/div"));
	 WebDriverWait welement=new WebDriverWait(driver, 10);
	 //显示等待 html title 在 设定时间内 ，满足当前条件即可判断当前元素有效时间内 pass
	 welement.until(ExpectedConditions.titleContains(""));
	 //当前元素是否处于被选中的转态
	 welement.until(ExpectedConditions.elementToBeSelected(onselect));
	 //当前元素是否可用并且是否可以被点击
	 welement.until(ExpectedConditions.elementToBeClickable(onselect));
	 //当前页面元素是否存在
	 welement.until(ExpectedConditions.presenceOfElementLocated(By.xpath("dd")));
	 
	 //当前页面文本是否包含特定的文本
	 welement.until(ExpectedConditions.textToBePresentInElementLocated(By.xpath("dd"), "di"));
	 
	 welement.until(ExpectedConditions.textToBePresentInElementValue(By.xpath("div"), "enter version"));
	 
	 //自定义等待时间  在设定是时间内是否可以满足所设定的条件，满足即可跳出通过
	 WebDriverWait waitelement = new WebDriverWait(driver, 10);
	 try {
		 
		 Boolean byassert = waitelement.until(new ExpectedCondition<Boolean>() {

				@Override
				public Boolean apply(WebDriver DRIVER) {
					// TODO Auto-generated method stub
					WebElement elemnt = DRIVER.findElement(By.xpath("div"));
					//当前元素是否可见
					elemnt.isDisplayed();
					elemnt.getText().contains("version");
					return elemnt.getText().contains("version");
				}
			});  
		 Assert.assertFalse(byassert);
		 waitelement.until(new ExpectedCondition<Boolean>() {

			@Override
			public Boolean apply(WebDriver arg0) {
				// TODO Auto-generated method stub
				//当前元素是否可用
				return driver.findElement(By.xpath("div")).isEnabled();
				
			}
		});
	} catch (NoSuchElementException e) {
		Assert.fail("elementnot found");
		e.printStackTrace();
		// TODO: handle exception
	}
	//判断页面元素是否存在
	if (iselement(By.id("qurter"))) {
		WebElement chebox = driver.findElement(By.id("qurter"));
		if (chebox.isEnabled()) {
			chebox.click();
			System.out.println("element found");
		}else {
			Assert.fail("element not foound");
		}
		
	}
	 
	 
	 
  }
  
  //构造一个 判断的方法
  private Boolean iselement(By by) {
	try {
		driver.findElement(by);
		return true;
	} catch (NoSuchElementException e) {
		return false;
		// TODO: handle exception
	}
	
	
}
  @BeforeMethod
  public void beforeMethod() {
      System.setProperty("webdriver.chrome.driver","C:\\Program Files (x86)\\Google\\Chrome\\Application\\chromedriver.exe");
	 driver=new ChromeDriver();
	 driver.get("\"http://localhost:8080/#/\"");
  
  }

  @AfterMethod
  public void afterMethod() {
  
  
  }

}
