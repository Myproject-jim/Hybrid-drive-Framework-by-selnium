package cn.AutoFrame.Until;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import cn.AutoFrame.pagebyProperties.intro_Page;

import org.apache.poi.ss.usermodel.CellType;
/*
 * 读取指定excel表格
 */
public class Excel_until {
	
	private static XSSFSheet excelsheet;
	private static XSSFWorkbook excelbook;
	private static XSSFCell excelCell;
	private static XSSFRow excelRow;
	//设定Excel路径 和名称  以便后续读写Excel使用 ，实例化加载excel
	public static void setExcelfile(String path,String Sheetname) {
		FileInputStream excelfile;
		try {
			//实例化excel文件的 fileinputstream的对象
			excelfile=new FileInputStream(path);
			//实例化workboot 对象
			excelbook=new XSSFWorkbook(excelfile);
			// 实例化xsssheet 对象 由于制定Excel文档中 sheet
			excelsheet=excelbook.getSheet(Sheetname);
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public static String getdata_excel(int rownum,int colnum) {
		
		excelCell=excelsheet.getRow(rownum).getCell(colnum);
		String celldata=excelCell.getCellType()==CellType.STRING?excelCell.getStringCellValue()+"":String.valueOf(Math.round(excelCell.getNumericCellValue()));
		return celldata;
	}
		
//根据行列设置 表格里面的值  
	public static void setdata_excel(int rownum,int colnum,String result) throws FileNotFoundException {
		excelRow = excelsheet.getRow(rownum);
		excelCell=excelRow.getCell(colnum);
		
		if (excelCell==null) {
			excelCell=excelRow.createCell(colnum);
			excelCell.setCellValue(result);
		}else {
			excelCell.setCellValue(result);
		}
		
		try {
			FileOutputStream fileout = new FileOutputStream(Constant.TESTDATAEXCELPATH_STRING);
			excelbook.write(fileout);
			//调用flush 强制刷新写入文件信息 
			fileout.flush();
			fileout.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
		
	}
	//动态循环数据    循环获取表格中的数据
	public static Object[][] auto_Getdata_excel(String filepath,String sheetname) throws IOException {
		//声明一个文件对象
		File file = new File(filepath);
		//加载文件
		FileInputStream filetream= new FileInputStream(file);
		String typefile=filepath.substring(filepath.indexOf("."));
		if (typefile.equals(".xlsx")) {
			//实例化对象
			excelbook=new XSSFWorkbook(filetream);
		}else if(typefile.equals(".xls")) {
			excelbook=new XSSFWorkbook(filetream);
		}else {
			System.out.println("file was error");
		}
			
			excelbook.getSheet(sheetname);
		
		List<Object[]> records = new ArrayList<Object[]>();
		
		int excelcount=excelsheet.getLastRowNum()-excelsheet.getFirstRowNum();
		XSSFRow Row;
		
			for (int i = 0; i <	excelcount; i++) {
				 Row = excelsheet.getRow(i);
				//排除表格最后两列 ， 最后两列 用于 填写结果 和状态  所以不参见操作
				String[] objlist=new String[Row.getLastCellNum()-2];
				//断言当前状态是否可以运行  row.getLastCellNum()索引值是从1开始的  列的总行-2是倒数第二列
				if (Row.getCell(Row.getLastCellNum()-2).equals("y")) {
				for (int j = 0; j <Row.getLastCellNum()-2; j++) {
					XSSFCell col = Row.getCell(j);
					String value = col.getStringCellValue();
					objlist[j]=value;
				}
				records.add(objlist);
				}
			}
		
			
		Object[][] objectlist = new Object[records.size()][];
		
		for (int i = 0; i < objectlist.length; i++) {
			objectlist[i]=records.get(i);
		}
		return objectlist;
		
	}

}
