package com.AutoFramk.TestDemo;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import cn.AutoFrame.Until.string_test;
import cn.AutoFrame.pageAction.intro_action;
import cn.AutoFramk.Constants.Constant_s;

public class ReadExcelDemo {
	
	private XSSFWorkbook workbook;
	private XSSFSheet sheet;
	private XSSFRow row;
	private XSSFCell cell;
	File file;
	public  void Excel(String excelpath,String type,String sheename) throws FileNotFoundException {
	
	    file = new File(excelpath);
	   FileInputStream in = new FileInputStream(file);
	   String filetypeString=  type.substring(type.indexOf("."));
		if (filetypeString.equals("css")) {
			workbook=new XSSFWorkbook();
		}
		sheet=workbook.getSheet(sheename);
	}
	public String readexcel(int rowlocal,int celloal,String sheetname) {
		
		sheet=workbook.getSheet(sheetname);
		cell=sheet.getRow(rowlocal).getCell(celloal);
		//三原函数
		//这里判断如果是字符输出字符�?�则输出数字
		String value=cell.getCellType()==CellType.STRING?cell.getStringCellValue()+"":String.valueOf(Math.round(cell.getNumericCellValue()));
				
		return value;
	}
	public int allstep(String sheetname) {
		
		sheet=workbook.getSheet(sheetname);
		int casecount=sheet.getLastRowNum()-sheet.getFirstRowNum();
		return casecount;
		
	}
	public int FirstNOofcase(String CaseID,int CaseIDlocal,String sheetname) {
		
		int count=allstep(sheetname);
		int caseno=0;
		for (int i=0; i < count; i++) {
			if (readexcel(i, Constant_s.TestcaseIDbystep, sheetname).equals(CaseID)) {
				break;	
			}
		}
		return caseno;
	}
	public int casestepnumber(String CaseID,int CaseIDlocal,String sheetname) {
		
		int count=allstep(sheetname);
		int casestepno=0;
		for (int i=0; i < count; i++) {
			if (readexcel(i, Constant_s.TestcaseIDbystep, sheetname).equals(CaseID)) {
				casestepno++;
				break;	
			}
		}
		return casestepno;
	}
	
	public void SetExcel(int hang,int lie,String sheename,String setcontent) throws IOException {
		
	    sheet=workbook.getSheet(sheename);
	    row = sheet.getRow(hang);  
		cell = row.getCell(lie);
		XSSFCell setcount=null;
		if(cell==null) {
			setcount = row.createCell(lie);
		  cell.setCellValue(setcontent);
		}else if(cell !=null) {
		   cell.setCellValue(setcontent);
		}
		FileOutputStream out = new FileOutputStream(file);
		workbook.write(out);
		out.flush();
		out.close();
		
	}
}
class demo{
	
   
	
	
}
