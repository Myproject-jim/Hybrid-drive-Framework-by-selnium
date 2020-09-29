package com.antdesgin;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import cn.AutoFrame.Until.Base_webdriver_browser;
import cn.AutoFrame.Until.string_test;
import cn.AutoFrame.pagebyProperties.intro_Page;
import cn.AutoFramk.ConfigUntil.ExcelUnit;
import cn.AutoFramk.Constants.Constant_s;
import cn.AutoFramk.configuartion.KeywordsAction;

/*
 * function case  具体的功能测试case集
 */

public class Testsuiebyexcel extends Base_webdriver_browser {
	public static Method Methods[];
	public static KeywordsAction keywordsAction;
	public static String value;
	public static String keyaction;
	public static boolean result;
	public static boolean case_status=true;
	@Test
	public void Testsuite() throws InvalidFormatException, IOException, InterruptedException {
	/*
	 * �??射
	 * 
	 * why �??射是个什么个鸡儿  �??射 是java中的一�? 机制  套路， 在�?行状�?下所有的类都�?� 获�?� 本�??射类的所有方法和属性
	 * 对于任�?一个对象，都能够调用它的任�?一个方法和属性；这�?动�?获�?�的信�?�以�?�动�?调用对象的方法的功能称为java语言的�??射机制。
	 * 
	 * why  映射是个什么个鸡儿  是一�? 对应关系  没有实质的�?�系   猫：cat  狗：dog  
	 * 
	 * 
	 */
//-------------------------------------------------------------
	//获�?�keywordsaction的所有方法
	keywordsAction=new KeywordsAction();
	//加载当�?对象的所有方法
	Methods=keywordsAction.getClass().getMethods();
	               
//------------------------------------------------------------------
	
	
	//设定excel表格信�?�
	ExcelUnit.setexcelfile(Constant_s.PATH_EXCEL,Constant_s.PATH_EXCEL_TYPE);
	//读�?�用例集�?�中的sheet的用例总数  行数
	int testcount = ExcelUnit.getallrow(Constant_s.SHEET_TESTSUITE);
	System.out.println(testcount);
	for (int i = 1; i < testcount; i++) {
		//Test suite 
		String TestcaseID = ExcelUnit.Readbylocationexcel(i, Constant_s.cases_ID, Constant_s.SHEET_TESTSUITE);
		String testcaseSatus= ExcelUnit.Readbylocationexcel(i,Constant_s.casestatus , Constant_s.SHEET_TESTSUITE);
		System.out.println("testcaseid"+TestcaseID);
		System.out.println("testcaseStatus"+testcaseSatus);
		if (testcaseSatus.toLowerCase().equals("y")) {
			//caseID 为 “。。。。。。。�? 第一�?�用例所在的行�?��?置
			 int  startcaseno = ExcelUnit.getFistRowConatainsTestcaseID(Constant_s.SHEET_TESTSTEP,TestcaseID,Constant_s.STEPCaseId);
			 System.out.println("STARTNO   "+startcaseno);
			//caseID 为 “。。。。。。。�?  最�?�一�?�用例所在的行�?��?置
			int Testlast=ExcelUnit.getTestSteprow(startcaseno, TestcaseID, Constant_s.SHEET_TESTSTEP);
			 System.out.println( "EDD   "+Testlast);
			for (int j = startcaseno; startcaseno< Testlast; j++) {
				
				/*
				 * 通过映射的关系 对应  configaction中方法 具体�? excel表格
				 */
				value=ExcelUnit.Readbylocationexcel(j, Constant_s.KEYVALUE,Constant_s.SHEET_TESTSTEP);
				keyaction=ExcelUnit.Readbylocationexcel(j, Constant_s.KEYACTION,Constant_s.SHEET_TESTSTEP);
				/*																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																	
				 *映射关系 
				 */
				//调用 �??射机制类中的方法
				this.keywordmethods();
				Thread.sleep(15000);
				//写入用例通过状�?
				if (case_status==true) {
					ExcelUnit.setbylocation(i, Constant_s.Casepass_status, "pass", Constant_s.SHEET_TESTSUITE);
				}
				if (case_status==false) {
					ExcelUnit.setbylocation(i, Constant_s.Casepass_status, "NO", Constant_s.SHEET_TESTSUITE);
				}	
			}
				
		}
	}
			
	}

	private static void keywordmethods() {
		try {
			for (int i = 0; i < Methods.length; i++) {
				//判断�??射方法中的 所�?�到了的 方法�??
				if (Methods[i].getName().equals(keyaction)) {
					  //�??射 methos所有方法
						Methods[i].invoke(keywordsAction, value);
						if (case_status==false) {
							ExcelUnit.setbylocation(i, Constant_s.STEPSTATUS, "pass", Constant_s.SHEET_TESTSTEP);
						}else if (case_status==true)  {
							ExcelUnit.setbylocation(i, Constant_s.STEPSTATUS, "NO", Constant_s.SHEET_TESTSTEP);
						}
						
					}
				}
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		}
	@BeforeMethod
	public void beforemethod() {
		super.chrome();
		driver.get("https://preview.pro.ant.design");
		
	}
	@AfterMethod
	public void aftermethod() {
		
	}
}
