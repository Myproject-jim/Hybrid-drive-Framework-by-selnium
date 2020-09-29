package com.AutoFramk.TestDemo;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.xssf.usermodel.XSSFSheet;

import cn.AutoFrame.pagebyProperties.intro_Page;
import cn.AutoFramk.ConfigUntil.ExcelUnit;
import cn.AutoFramk.Constants.Constant_s;

public class Test_byexcle {
	
	public static void main(String[] args) throws InvalidFormatException, IOException {
		
	  ExcelUnit.setexcelfile(Constant_s.PATH_EXCEL, Constant_s.PATH_EXCEL_TYPE);
	  
	  ExcelUnit.Readbylist();
	
	  int allstep = ExcelUnit.getallrow(Constant_s.SHEET_TESTSTEP);
	  int c=ExcelUnit.getallcount();
	  int col_count=ExcelUnit.getallrow(Constant_s.SHEET_TESTSUITE);
      int startcaseno = ExcelUnit.getFistRowConatainsTestcaseID(Constant_s.SHEET_TESTSTEP,"Form_page01",Constant_s.STEPCaseId);
      int value1=ExcelUnit.getTestSteprow(startcaseno, "Login_01", Constant_s.SHEET_TESTSTEP);
      
		   System.out.println("start NO "+startcaseno);
		   System.out.println("all step"+allstep);
		   System.out.println("step no "+value1);
		 
		   int cunent = step_count(startcaseno, "Form_page01", Constant_s.SHEET_TESTSTEP);
		   System.out.println(cunent);
		   
	}
	public static int step_count(int startstepNO,String TestcaseID,String sheetname) throws FileNotFoundException {
		
		int stepcountsize=ExcelUnit.getallrow(Constant_s.SHEET_TESTSTEP);
		int stepcount=0;
		int ng=82;
		for (int i = startstepNO; i < stepcountsize; i++) {
			
			if (TestcaseID.equals(ExcelUnit.Readbylocationexcel(i, Constant_s.STEPCaseId, sheetname))) {
				 stepcount++;
			}
		}
		return stepcount;
		
	}
	
	
	
	

}
