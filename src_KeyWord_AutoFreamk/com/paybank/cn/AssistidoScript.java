package com.paybank.cn;

import org.testng.annotations.Test;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import  java.lang.reflect.Method;

import cn.AutoFrame.pageAction.intro_action;
import cn.AutoFramk.ConfigUntil.ExcelUnit;
import cn.AutoFramk.Constants.Constant_s;
import cn.AutoFramk.DataUtil.TestNGbyReadexcel;
import cn.AutoFramk.Drivebase.Base_webdriver_browser;
import cn.AutoFramk.configuartion.Assisstido;

import org.testng.annotations.BeforeMethod;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.annotations.AfterMethod;

public class AssistidoScript extends Base_webdriver_browser {
	
	public static Boolean verifyStepStatus=true;
	private static Assisstido assisstido=new Assisstido();
	private static Method[] methods;
	
	private static String Casestepname;
	private static String Casestepelement;
	private static String Casestepvalue;
  @Test
  public void Assistido() throws IOException, InvalidFormatException {
	  methods=assisstido.getClass().getMethods();
	  
	  //初始化加载数据
	  ExcelUnit.setexcelfile(Constant_s.PATH_EXCEL,Constant_s.PATH_EXCEL_TYPE);
	  int casecount = ExcelUnit.getallrow(Constant_s.SHEET_TESTSUITE);
	   for (int i = 0; i < casecount; i++) {
			String Testcasename = ExcelUnit.Readbylocationexcel(i, Constant_s.cases_ID, Constant_s.SHEET_TESTSUITE);
			String testcaseSatus= ExcelUnit.Readbylocationexcel(i,Constant_s.casestatus , Constant_s.SHEET_TESTSUITE);
		   if (testcaseSatus.toLowerCase().equals("y")) {
			   //开始的caseID
			   int StartCase=ExcelUnit.getFistRowConatainsTestcaseID(Constant_s.SHEET_TESTSTEP, Testcasename,Constant_s.STEPCaseId);
			   //每个模块的用例总数
			   int Allstepcase=ExcelUnit.getTestSteprow(StartCase, Testcasename, Constant_s.SHEET_TESTSTEP);
			   
			   for (int Case = StartCase; StartCase < Allstepcase; StartCase++) {
				   //读取每个用例步骤多要用到的参数
				   Casestepname=ExcelUnit.Readbylocationexcel(Constant_s.Casestepname, StartCase, Constant_s.SHEET_TESTSTEP);
				   Casestepelement=ExcelUnit.Readbylocationexcel(Constant_s.Casestepelement_KEY, StartCase, Constant_s.SHEET_TESTSTEP);
				   Casestepvalue=ExcelUnit.Readbylocationexcel(Constant_s.Casestepvalue, StartCase, Constant_s.SHEET_TESTSTEP);
				   //运行所有事件
				   this.AssistidoCasestep();
				   //验证当前步骤是否通过
				   	if (verifyStepStatus==true) {
				   		ExcelUnit.setbylocation(1, 2, "PASS",Constant_s.SHEET_TESTSUITE );
					}else if (verifyStepStatus==false) {
						ExcelUnit.setbylocation(1, 2, "NO",Constant_s.SHEET_TESTSUITE );
					}  
			}	
		}                                                         

	}  
  }
  public static void AssistidoCasestep() throws FileNotFoundException{
	for (int i = 0; i < methods.length; i++) {
		if (methods[i].getName().equals(Casestepname)) {
			try {
				methods[i].invoke(assisstido, Casestepelement,Casestepvalue);
				ExcelUnit.setbylocation(1, 2, "pass", Constant_s.SHEET_TESTSTEP);
			} catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			   ExcelUnit.setbylocation(1, 2, "no", Constant_s.SHEET_TESTSTEP);
			}
		}
	}
	  
	  
  }
  @BeforeMethod
  public void beforeMethod() {
	  super.chrome();
	  driver.get("https://preview.pro.ant.design");
  }

  @AfterMethod
  public void afterMethod() {
  }

}
