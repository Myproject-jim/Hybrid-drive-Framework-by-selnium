package TestDemo;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.impl.WorkbookDocumentImpl;


import Data_provider_base.object_Until;
import cn.AutoFrame.pageAction.intro_action;

public class Readexcel_Object {
	public static void main(String[] args) {
		
		String[] aString=new String[8];
		aString[1]="12";
		aString[3]="1222";
		aString[2]="4554456";
		List<Object[]>  LIST=new ArrayList<Object[]>();
	     for (int i = 0; i < aString.length; i++) {
			LIST.add(aString);
		}
	     
	     for (int i = 0; i < LIST.size(); i++) {
			Object[] vlue = LIST.get(i 	);
			for (int j = 0; j < vlue.length; j++) {
				
				System.out.println(vlue.getClass().getName());
			}
		}
	}
	

}
class readexcel{
	
	public  static XSSFWorkbook workbook;
	public static XSSFSheet sheet;
	public  static XSSFCell cell;
	public  static XSSFRow row;
	
	public  static Object[][] readexcel(String filepath,String sheetname) throws IOException {
		
		File File = new File(filepath);
	    FileInputStream FileInputStream = new FileInputStream(File);
		
	    workbook=new XSSFWorkbook(FileInputStream);
		sheet=workbook.getSheet(sheetname);
	
		String [][]  list=new String[1][];
		
		List<Object[]> olist=new ArrayList<Object[]>();
		int  numcount=sheet.getLastRowNum()-sheet.getFirstRowNum();
		for (int j = 1; j < numcount; j++) {
			if (sheet.getRow(2).getCell(j).equals("y")) {
				row=sheet.getRow(j);
				String[] savevalue=new String[numcount];
				for (int i = 0; i < list.length; i++) {
					 String cellvalue = row.getCell(i).getStringCellValue();
					 savevalue[i]=cellvalue;				 
				}
				olist.add(savevalue);	
			}
		}
	
		Object[][] objectlist=new  Object[olist.size()][];
		for (int i = 0; i < objectlist.length; i++) {
			objectlist[i]=olist.get(i);
		}
		
		return objectlist;
		
	}
}
