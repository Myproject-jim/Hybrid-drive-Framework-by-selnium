package cn.AutoFramk.ConfigUntil;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.RowIdLifetime;

import org.apache.logging.log4j.core.impl.ReusableLogEventFactory;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.binary.XSSFBRecordType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import Constants.Constant_s;
import bsh.This;
import cn.AutoFrame.Until.string_test;
import cn.AutoFrame.pagebyProperties.intro_Page;
/*
 * 封装excel工具类 在后续写测试脚本时需要常常调用
 * 具体封装的功能如下：
 * 1.*初始化excel的对象加载 excel表格数据
 * 2.获取指定表格位置 value值  根据  row col来获取 ，具体看下面操作方法
 * 3.获取表格的 总行数（case的数量，.....）
 * 4.*获取的相关参数  根据 row col  写入相关数据
 * 
 * 
 */
public class ExcelUnit {

	private static XSSFWorkbook workbook;
	private static XSSFSheet sheet;
	private static XSSFRow row;
	private static XSSFCell cell;
	private static File file;
	
	public   static void setexcelfile(String path,String filetype) throws InvalidFormatException, IOException {
		    file = new File(path+"\\"+filetype);
		  try {
			FileInputStream fileinput = new FileInputStream(file);
			
			String type=filetype.substring(filetype.indexOf("."));
			if (type.equals(".xlsx")) { 
				workbook=new XSSFWorkbook(fileinput);
			}else {
			System.out.println("file is error");
			}	
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	//读�?�指定sheet 相关excel 表格数�?�
	public static String Readbylocationexcel(int row,int col,String sheetname) throws FileNotFoundException {
		  sheet=workbook.getSheet(sheetname);	
		   XSSFCell cellobject = sheet.getRow(row).getCell(col);
		   String celldata=cellobject.getCellType()==CellType.STRING?cellobject.getStringCellValue()+"":String.valueOf(Math.round(cellobject.getNumericCellValue()));
		   return celldata; 
	
	}
	
	public static void Readbylist() {
		
	}
	//获�?�指定的表格的总行数
	public static int getallrow(String sheetname) {
		 sheet=workbook.getSheet(sheetname);
		 int Rolnum = sheet.getLastRowNum();
		return Rolnum;
	}
	//获�?�当�?表个的总行�?�
	public static int getallcount() {
		int colcount=sheet.getLastRowNum();
		return colcount;
	}
	//在excel的指定的sheet 中，获�?�第一次包�?�指定测试用例文字的行�?�
	public static int getFistRowConatainsTestcaseID(String Case_step_sheet_name,String CaseID,int CaseID_location) throws FileNotFoundException {
		
		int rowcount=getallrow(Case_step_sheet_name);
		int i;
		sheet=workbook.getSheet(Case_step_sheet_name);
		try {
			for ( i = 1; i < rowcount; i++) {
				if (Readbylocationexcel(i,CaseID_location , Case_step_sheet_name).equalsIgnoreCase(CaseID)) {
					break;
				}
				
			}
			return i;
		} catch (Exception e) {
			// TODO: handle exception
			
			return 0000;
		}
	
	
		
		
	}
	//获�?�指定sheet 中�?个测试的用例个数
//	 public static int getTestSteprow(String sheetname,String testcaseID,int testcasestartnumner) throws FileNotFoundException {
//	
//		 try {
//			 sheet=workbook.getSheet(sheetname);
//			 //从包�?�指定测试id 开始�??历直到�?一行�?�?出现 跳出循环 ，  目的 case 和 step 之间的�?�系
//			 for (int i = testcasestartnumner; i < ExcelUnit.getallrow(sheetname); i++) {
//				 //constant_s.TESTID
//				if (!testcaseID.equals(ExcelUnit.Readbylocationexcel(i, Constant_s.STEPCaseId, sheetname))){
//					int casesum=0;
//					return casesum;
//					
//				
//				}
//			}
//			 System.out.println("======"+testcasestartnumner);
//			 int casesum=sheet.getLastRowNum()-testcasestartnumner;
//		
//				return casesum;
//		} catch (Exception e) {
//			// TODO: handle exception
//			return 0;
//		}	 
//	 }
	//计算某单一模块的用例步骤数量
	public static int getTestSteprow(int FristStepNO,String CaseName,String CassStep_SheetName) throws FileNotFoundException {
		
		int stepcountsize=ExcelUnit.getallrow(Constant_s.SHEET_TESTSTEP);
		int stepcount=0;
		for (int i = FristStepNO; i < stepcountsize; i++) {	
			//
		    if (CaseName.equals(ExcelUnit.Readbylocationexcel(i, Constant_s.STEPCaseId, CassStep_SheetName))) {
				stepcount++;
			}				
		}
		return stepcount;
	}
	 //写入表格数�?�
		public static void setbylocation(int Row,int col,String content,String sheetname) throws FileNotFoundException {
		     sheet=workbook.getSheet(sheetname);	
	       //调用flush 强制刷新写入文件信�?� 
	         try {
	        	 /*
	        	  * 详细说明 ：
	        	  * 当�?代�?是设置表格整行的 数值，与下�?��?�?�，如果想设置�?一�?置 必须想获�?� Row，进而�?作
	        	  * row=sheet.createrow();
	        	  * xssfcell cell=row.createcell();
	        	  * cell.setcellvalue();
	        	  */
	        	 //获�?�当�?信�?�所在行 确定 唯一的�?置
	        	  row = sheet.getRow(Row);  
	        	  cell = row.getCell(col);
	        	 XSSFCell setcontent = null;
	        	 if (cell==null) {
	        	 setcontent = row.createCell(col);
				 setcontent.setCellValue(content);
				}else {
					setcontent.setCellValue(content);
				}
	        	  	 
	  	       //加载�?装好路径的excel的表格,实例化表格         onstant_s.PATH_EXCEL+"\\"+Constant_s.PATH_EXCEL_TYPE
	  	          FileOutputStream fileout = new FileOutputStream(file);
	  	         if (fileout!=null) {
					System.out.println("Write status successful");
				}else {
					System.out.println("please check on you file status");
				}
	  	         workbook.write(fileout);
	  	       fileout.flush();
	  	     fileout.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				System.out.println("wriet messesage was faild");
			} finally {
			}
	       
	        	
	}
	
	
	
}
