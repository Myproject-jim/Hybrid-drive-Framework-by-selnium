package TestDemo;

import org.testng.annotations.Test;

import Constants.Constant_s;

import org.testng.annotations.BeforeMethod;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.By;
import org.testng.annotations.AfterMethod;

import cn.AutoFrame.Until.Constant;
import cn.AutoFrame.Until.Log;
import cn.AutoFrame.pagebyProperties.intro_Page;
import cn.AutoFramk.ConfigUntil.ExcelUnit;
import cn.AutoFramk.ConfigUntil.ObjectMap;

public class Logtest {
  @Test
  public void f() throws FileNotFoundException {
//	   DOMConfigurator.configure("log4.xml");
//	  Log.Start_test("upgrade");
//	  Log.end_test("up");
//	  String teString="login.uesrname=id>admin";
//	  String[] String = teString.split(">");
//	  boolean status=false;
//	  System.out.println(String[0]);
//	  String type=String[0];
//	  if (type.toLowerCase().equals("id")) {
//		  System.out.println("true");
//	}else {
//		System.out.println("flase");
//	}
//	ObjectMap_keyword objectMap = new ObjectMap_keyword(Constant_s.PATH_PROPERITES);
//	  System.out.println(this.protect());
//	  By vaue = objectMap.getpageElement("login.uesrname");
//	  System.out.println("properites"+vaue);
	  ExcelUnit.setbylocation(1, 6, "ddd", Constant_s.SHEET_TESTSTEP);
	  
  }
  public int protect() {
	  Properties propertres = new Properties();
	  try {
		FileInputStream profile = new FileInputStream(Constant_s.PATH_PROPERITES);  
		System.out.println(profile);
		propertres.load(profile);
		profile.close();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		System.out.println("Reading file in error");
		e.printStackTrace();
	}
	
	 String getvalue = propertres.getProperty("login.uesrname");
	 System.out.println("***********"+getvalue);
	 String[] locator = getvalue.split("==");
	 System.out.println("###########"+locator);
	 String type=locator[0];
	
	 if (type.toLowerCase().equals("id")) {
		return 1;
	}  else {
		return 2;
	}
	  
	  
	  
	  
	  
  }
  @BeforeMethod
  public void beforeMethod() {
  }

  @AfterMethod
  public void afterMethod() {
  }

}
