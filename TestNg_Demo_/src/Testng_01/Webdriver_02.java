package Testng_01;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

public class Webdriver_02 extends Base_webdriver{
// Select 选择框   断言  匹配 元素
  @Test
  public void toolscase() {
//	  /html/body/div[7]/div/div[5]/a[1]
	  driver.findElement(By.xpath("/html/body/div[7]/div/div[5]/a[1]")).click();
//	  driver.manage().window().maximize();
	  driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[2]/div/div/div/div/div/div/div[1]/div/div[2]/div[1]/div/span")).click();
	  Select droplist = new Select(driver.findElement(By.cssSelector("#app > div > div:nth-child(2) > div > div > div > div > div > div > div.ivu-col.ivu-col-span-24 > div > div.ivu-select.ivu-select-single.ivu-select-default > div.ivu-select-selection > div > span")));
	  //ismultiple 表示下拉是否允许多选 被测网页是一个单选的下拉列表   下面判断事flase
	  Assert.assertFalse(droplist.isMultiple());
	  //断言当前选中的选项是否和预期的结果相一致	  
	  Assert.assertEquals("BJ11", droplist.getFirstSelectedOption().getText());
	  //断言通过select index 断言 
	  droplist.selectByIndex(3);//选中select list 列表中的value 相当于click
	  Assert.assertEquals("BJ11", droplist.getFirstSelectedOption().getText());
	  //断言通过 value 属性
	  droplist.selectByValue("bj11");
	  Assert.assertEquals("BJ12", droplist.getFirstSelectedOption().getText());
	  //通过选项文字来进行选中
	  droplist.selectByVisibleText("bj14");
	  Assert.assertEquals("bj14",droplist.getFirstSelectedOption().getText());
	  //-------------------------------------------------------------------------------------
	  //检查单选列表选项文字 符合预期
	  List<String> expect_options=Arrays.asList((new String[] {"bj11","bj12"}));
	  List<String> actual_option = new ArrayList<String>();
	  for(WebElement options:droplist.getOptions()) {
		  actual_option.add(options.getText());
//		  断言两个数组里面的值是否完全一致 toArray遍历数组
		  Assert.assertEquals(expect_options.toArray(),actual_option.toArray());  
	  }
//	  多选
	  Assert.assertTrue(droplist.isMultiple());//断言是否支持多选
      droplist.deselectAll();
      droplist.selectByIndex(0);
      droplist.selectByIndex(1);
      droplist.selectByValue("bj11");
//      操作单选框 redio的某一选项
       WebElement redio = driver.findElement(By.xpath("ddd"));
//       此状态位被选中，则调用click的方法i
       if(!redio.isSelected()) {
    	  redio.click();   
//    	  isselected 表示当前对象是否是被选中的转态
    	  Assert.assertTrue(redio.isSelected());
    	 
    	  
       }
       List<WebElement> divs = driver.findElements(By.xpath("all div"));
	     for(  WebElement div1:divs) {
	    	 if(div1.getAttribute("value").equals("bj11")) {
	    		 if(!div1.isSelected()) {
	    			 div1.click();
//	    			 断言当前元素是被选中的转态
	    			 Assert.assertTrue(div1.isSelected());
	    			 break;
	    		 }
	    		 
	    		 
	    	 }
	     }
	  
//	 操作复选框
	     WebElement checkbox = driver.findElement(By.xpath("chebox"));
	     if (checkbox.isSelected()) {
			checkbox.click();
			Assert.assertTrue(!checkbox.isSelected());
		}
	    
	     if(!checkbox.isSelected()) {
	    	 checkbox.click();
	    	 Assert.assertTrue(checkbox.isSelected());
	     }
	    List<WebElement> allchekbox = driver.findElements(By.xpath("allcheckbox"));
	     for(WebElement alldivs:allchekbox) {
	    	 alldivs.click();
	    	 Assert.assertTrue(alldivs.isSelected());
	     }
//	     进程
	     
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.setProperty("webdriver.chrome.driver","C:\\Program Files (x86)\\Google\\Chrome\\Application\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.get("http://localhost:8080/#/");
//	  driver.manage().window().maximize();
  }

  @AfterMethod
  public void afterMethod() {
	
  }

}
