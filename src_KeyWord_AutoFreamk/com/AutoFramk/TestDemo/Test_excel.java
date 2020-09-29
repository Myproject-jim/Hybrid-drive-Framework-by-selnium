package com.AutoFramk.TestDemo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.RowIdLifetime;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.streaming.SXSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import cn.AutoFramk.ConfigUntil.ExcelUnit;
import cn.AutoFramk.Constants.Constant_s;

public class Test_excel {
 
	@SuppressWarnings("resource")
	public static void main(String [] args) throws IOException, InvalidFormatException {
		HSSFWorkbook workbook1;
		XSSFWorkbook workbook = null;
		XSSFCell cell;
		XSSFRow row;
		XSSFSheet sheet = null;
	    String	path="C:\\Users\\JIAMING.YANG\\Desktop\\javaUtil.xlsx";
	    String sheetname="Assistidostep";
	
		
	    File file = new File(path);
	    FileInputStream in = new FileInputStream(file);
	    FileInputStream in1 =new  FileInputStream(file);
	    workbook=new XSSFWorkbook(in);
	    
	    sheet=workbook.getSheet(sheetname);
	     System.out.println(sheet.getRow(1).getCell(1)); 
	      row=sheet.getRow(2);
	     XSSFCell value = row.getCell(1);
	      System.out.println(value);
	     	
	     	//获�?�行对象
	       XSSFRow cle = sheet.createRow(2);
		   
	  
	   for (int i = 1; i <6; i++) {
		   row=sheet.getRow(i);
		   XSSFCell conent = row.createCell(7);
		  conent.setCellValue("pass");
		   
	}
	    
	   FileOutputStream out = new FileOutputStream(file);
	   if(out!=null) {
		   System.out.println("successful");
	   }else {
		System.out.println("error");
	}
	   workbook.write(out);
	   out.flush();
	   workbook.close();
	}
	


}
