package Testng_02;

import org.testng.annotations.Test;

import Testng_01.Base_webdriver;

import Testng_02.*;
import org.testng.annotations.BeforeMethod;

import java.io.IOException;

import org.openqa.selenium.NotFoundException;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

public class ObjectMap_intro extends Base_webdriver{
  @Test
  public void objectmap() {
	  ObjectMap_tools objectMap_tools = null  ;
	  
	  try {
		objectMap_tools=new ObjectMap_tools("E:\\eclipse\\TestNg_Demo_\\src\\Testng_02\\ObjectMap.properties");
		
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		System.out.println("intro object error");
	}
	
	  
	  try {
		  WebElement setversionElement=driver.findElement(objectMap_tools.getlocalor("Setvserion.Homepage.id=id:query"));
		  
			 setversionElement.sendKeys("today");
			 
			 Assert.assertTrue(driver.getPageSource().contains("sougou"));
	} catch (NotFoundException e) {
		// TODO: handle exception
		e.printStackTrace();
	}
	
	 
	
	  
	  
  }
  @BeforeMethod
  public void beforeMethod() {
	  super.windows();
  }

  @AfterMethod
  public void afterMethod() {
	  
  }

}
