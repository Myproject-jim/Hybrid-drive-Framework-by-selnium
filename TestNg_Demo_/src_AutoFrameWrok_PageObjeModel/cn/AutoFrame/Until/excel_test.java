package cn.AutoFrame.Until;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.StringJoiner;

import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFFactory;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import Constants.Constant_s;
import cn.AutoFrame.pagebyProperties.intro_Page;


public class excel_test {


	public static void main(String[] args) throws IOException {
		 String path=Constant_s.PATH_EXCEL+"\\"+Constant_s.PATH_EXCEL_TYPE;
		 String sheetname=Constant_s.SHEET_TESTSTEP;
		FileInputStream fileinto = new FileInputStream(path);
		
		//创建workbook
	     XSSFWorkbook workbook = new XSSFWorkbook(fileinto);
	     //创建sheet 加载单元格中的sheet 
	     XSSFSheet sheet = workbook.getSheet(sheetname);
		int row_value = 1;
		int col_vlaue=1;
	        XSSFRow row = sheet.getRow(row_value);
	     
	    	XSSFCell col = row.getCell(col_vlaue);
	    	System.out.println(col.getStringCellValue()
	    			+"----------------"+row+"/t"+col);
	    	System.out.println("*******"+col);
	    	
	    	
	    	
	    //设置表格内容	
	   XSSFRow row1 = sheet.getRow(12);
	   XSSFCell colvalue = row1.createCell(5);
	   colvalue.setCellValue("ddd");
	   String path1=Constant_s.PATH_EXCEL+"\\"+Constant_s.PATH_EXCEL_TYPE;
	   FileOutputStream fileintput = new FileOutputStream(path1);
	   
	  XSSFWorkbook woo = new XSSFWorkbook();
	  
	  woo.write(fileintput);
	   fileintput.flush();
	   fileintput.close();
	   
	   
	   /*
	    * 获取表格内容  xml 文档 及表格原理
	    */
	   
	   
	   col=sheet.getRow(1).getCell(1);
		String celldata=col.getCellType()==CellType.STRING?col.getStringCellValue()+"":String.valueOf(Math.round(col.getNumericCellValue()));
		System.out.println("value:"+celldata);
		
		String pathString="aaa.xlsc";
		String pathd=pathString.substring(pathString.indexOf("."));
		System.out.println("-###########3"+pathd);
		System.out.println(row.getLastCellNum());
		System.out.println("cell value"+sheet.getRow(1).getCell(row.getLastCellNum()));
//	
	}
	
	public void getexcel(String row,String col) {
		
		
		
		
	}

}
