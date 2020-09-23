package cn.AutoFramk.DataUtil;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import cn.AutoFrame.pagebyProperties.intro_Page;
/*
 * 封装Testng  dataprovider 读取excel表格
 */
public class TestNGbyReadexcel {
	public static XSSFWorkbook workbook;
	public static XSSFSheet sheet;
	public static XSSFRow row;
	public static XSSFCell cell;
	public static ArrayList<Object[]> list;
	public static void  dataprovider(String pathname,String sheetname) throws IOException {
		
		
		File file = new File(pathname);
		FileInputStream io = new FileInputStream(file);
		String filetype=pathname.substring(pathname.indexOf("."));
		//只识别 xlsx csv 类型文件
		if (filetype.equals(".xlsx")) {
			workbook=new XSSFWorkbook(io);
		}else if (filetype.equals(".csv")) {
			workbook=new XSSFWorkbook(io);
		}
	
		sheet=workbook.getSheet(sheetname);
		
		list = new ArrayList<Object[]>();
		int size=sheet.getLastRowNum()-sheet.getFirstRowNum();
		for (int j = 1; j < size; j++) {
			String[] datalist=new String[row.getLastCellNum()];
		    row = sheet.getRow(j);
		    for (int i = 0; i < row.getLastCellNum(); i++) {
				cell=row.getCell(i);
				String value = cell.getStringCellValue();
				datalist[i]=value;
			}
		    
			list.add(datalist);
		}
	
	}
	public static Object[][] provider (){
		Object[][] result = new Object[list.size()][];
		for (int i = 0; i < result.length; i++) {
			result[i]=list.get(i);
		}
		return result;
		
	}

}
