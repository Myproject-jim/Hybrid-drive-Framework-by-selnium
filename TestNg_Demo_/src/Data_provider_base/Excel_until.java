package Data_provider_base;

import org.testng.annotations.Test;

import com.sun.jdi.Value;

import org.testng.annotations.BeforeMethod;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.logging.log4j.core.appender.rolling.FileExtension;
import org.apache.poi.hwpf.usermodel.Fields;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.util.WorkbookUtil;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;

public class Excel_until {
  public static Object[][] exceluntio(String filepath,String  filename,String sheetname) throws IOException{
	  //加载文件
	  File file = new File(filepath+"\\"+filename);
	  
	  //读取文件的数据
	  FileInputStream inputstream = new FileInputStream(file);
	  //声明work对象
	  Workbook workbook=null;
	  
	  
	  //获取 文件格式 并且判断 是 xls xl 的格式
	  String FileExtensionname = filename.substring(filename.indexOf("."));
	  if (FileExtensionname.equals(".xlsx")) {
		  workbook=new XSSFWorkbook(inputstream);
	  }else if(FileExtensionname.equals(".xls")){
		  workbook=new XSSFWorkbook(inputstream);
	}
	  
	  
	  
	  //通过sheetname  生成sheet对象
	 Sheet sheet = workbook.getSheet(sheetname);
	 int rowconnt=sheet.getLastRowNum()-sheet.getFirstRowNum();
	 List<Object[]> record = new ArrayList<Object[]>();
	 //除第一行的开始遍历数据
	 for (int i = 1; i < rowconnt; i++) {
//		 获取行的对象
		Row row = sheet.getRow(i);
		//声明一个一维数组来 存储文件值   定义当前一维数组的长度
		String files[]=new String[row.getLastCellNum()];
		
		//循环添加到数组中
		for (int j = 0; j < row.getLastCellNum(); j++) {
			//循环每个值添加到数组中
			 files[j] = row.getCell(j).getStringCellValue();
			
		}
		//添加object对象的数组中
		record.add(files);
	}
	//转换成object 二维数组  --
	 Object[][] resultObjects=new Object[record.size()][];
	 for (int i = 0; i < resultObjects.length; i++) {
		resultObjects[i]=record.get(i);
		
	}
	
	return resultObjects;
	  
  }
}
