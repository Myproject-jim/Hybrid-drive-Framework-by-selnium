package com.antdesgin;

import org.testng.annotations.Test;

import cn.AutoFrame.Until.Base_webdriver_browser;
import cn.AutoFrame.Until.Constant;
import cn.AutoFramk.ConfigUntil.ExcelUnit;
import cn.AutoFramk.Constants.Constant_s;
import cn.AutoFramk.configuartion.KeywordsAction;

import org.testng.annotations.BeforeMethod;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.annotations.AfterMethod;
/*
 * 通过java �??射机制 对excel的�?一个数�?�相应读�?�，至此通过此框架实现了测试用例定义和测试代�?相分离的目标，增强了的代�?的�?�维护行，�?低了�?本，简化了编写脚本的执行过程
 */
public class Setversion extends Base_webdriver_browser {
	public static Method method[];
	public static String keyword;
	public static String value;
	public static KeywordsAction KeywordsAction;
	public static boolean case_status=true;
	
  @Test
  public void Setversion() throws InvalidFormatException, IOException, InterruptedException {
	  //声明一个关键动作类的实例
	  KeywordsAction=new KeywordsAction();
	  //获�?�keywordaction 下的所有方法
	  method=KeywordsAction.getClass().getMethods();
	  String excelpath=Constant_s.PATH_EXCEL;
	  ExcelUnit.setexcelfile(excelpath, Constant_s.PATH_EXCEL_TYPE );
	  
	  //读�?��?行的第4列 和第 5列
	  for (int irow = 1; irow < method.length; irow++) {
		 keyword = ExcelUnit.Readbylocationexcel(irow, Constant_s.KEYACTION,Constant_s.SHEET_TESTSTEP);
		 value =ExcelUnit.Readbylocationexcel(irow, Constant_s.KEYVALUE,Constant_s.SHEET_TESTSTEP);
		 System.out.println("######"+keyword);
		 System.out.println("******"+value);
		 
		 try {
			  //调用映射方法
			 allstep_Action();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated Constantscatch block
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 Thread.sleep(12000);
		 if (this.case_status==true) {
			ExcelUnit.setbylocation(irow, 6, "Pass", Constant_s.SHEET_TESTSTEP);
		}else if (this.case_status==false) {
			ExcelUnit.setbylocation(irow, 6, "NO", Constant_s.SHEET_TESTSTEP);
		}
			
		
	}  

  }
  //
  private static void allstep_Action() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
	for (int i = 0; i < method.length; i++) {
		if (method[i].getName().equals(keyword)) {
			//找到keywordacition方法�?�， 调用 invoke 方法完�?映射方法的调用
			method[i].invoke(KeywordsAction, value);
			break;
		}
	}  
  }
  
  @BeforeMethod
  public void beforeMethod() {
	  super.chrome();
	  driver.get("https://preview.pro.ant.design/user/login?redirect=https%3A%2F%2Fpreview.pro.ant.design%2Fdashboard%2Fanalysis");
	  try {
		Thread.sleep(5000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
  }

  @AfterMethod
  public void afterMethod() {
  }

}
