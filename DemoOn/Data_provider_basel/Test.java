package Data_provider_basel;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.apache.poi.ss.formula.SheetNameFormatter;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.sun.istack.localization.NullLocalizable;
import com.sun.net.httpserver.Authenticator.Result;

import Data_provider_base.Excel_until;
import Data_provider_base.object_Until;

public class Test {
	

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
//		 Object[][] Result = Excel_until.exceluntio("C:\\Users\\JIAMING.YANG\\Desktop", "02.xlsx", "Sheet1");
//		 for (int i = 0; i < Result.length; i++) {
//			System.out.println(Result[i]);
//		}
		//加载文件路径
		File file=new File("C:\\Users\\JIAMING.YANG\\Desktop\\02.xlsx");
//		读取文件数据
		FileInputStream intputsteam = new FileInputStream(file);
//	   创建文件对象
		Workbook workbook=null;
		//使用xssworkbook进行文件初始化
		workbook=new XSSFWorkbook(intputsteam);
		//创建sheet 对象 获取表格元素
		Sheet SheetName = workbook.getSheet("Sheet1");
		//             声明数组的长度
		String list[]=new String[0];
		String list1[]= {"1"};
		String liste[][];
		liste=new String[2][1];
		
		liste[0]= new String[] {"1"};
//		liste[1][1]=new String("dd");
		int  base[]=new int[3];
		
		ArrayList<HashMap<Integer, String>> list2 = new ArrayList<HashMap<Integer, String>>();
		
		List<Object> value = new ArrayList<Object>();
		int rowcont=SheetName.getLastRowNum()-SheetName.getFirstRowNum();
		System.out.println(SheetName.getLastRowNum());
		HashMap<Integer, String> map=new HashMap<>();
		for (int i = 1; i < rowcont; i++) {
		   //获取行的 对象
			Row row = SheetName.getRow(i);
			System.out.println("ROW"+row);
			for (int j = 0; j < row.getLastCellNum(); j++) {
//				获取当前列的信息
				Cell red = row.getCell(j);
				//获取当前 某行某列的值
				System.out.println("-----------cell"+red);
				String cell = red.getStringCellValue();	
				System.out.println(red);	
				value.add(red);
				map.put(j, cell);
			}
			list2.add(map);
		}
		Object[][] listObjects=new Object[4][];
		
		Row row1 = SheetName.getRow(1);
		System.out.println("row：：：："+row1);
		System.out.println("value：：：："+row1.getCell(0).getStringCellValue());
	    
		System.out.println("map：：：："+list2);
		System.out.println("object：：：："+value);
	}

}
