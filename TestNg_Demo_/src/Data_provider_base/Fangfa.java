//package Data_provider_base;
//
//import java.io.File;
//import java.io.IOException;
//import java.util.ArrayList;
//import java.util.HashMap;
//import java.util.StringTokenizer;
//
//import org.apache.poi.ss.usermodel.Workbook;
//
//import jxl.read.biff.BiffException;
//
//public class Fangfa {
//  public static ArrayList<HashMap<String, String>>  redexcel(String lujing,String sheetname,int sheetindex)  throws BiffException, IOException{
//	// 加载文件 
//			File file=new File(lujing);
////			 加载成工作空间（把file  也就是sheet 加载成工作空间）
//			Workbook workbook=Workbook.getWorkbook(file);
////			通过工作空间取出 sheet
//			Sheet[] sheets = workbook.getSheets();
//////			获取 所有字段的名字
////			for (Sheet sheet : sheets) {
////				String jieguo = sheet.getName();
////				System.out.pr
////			for (Sheet sheet : sheets) {
////				String jieguo = intln(jieguo);
////			}
//			
//			Sheet sheet;
//			if (sheetname == null) {
//				sheet = workbook.getSheet(sheetindex);
//			} else {
//				sheet = workbook.getSheet(sheetname);
//			}
//			
////			通过数组下标 获取单个 sheet
////	    Sheet sheet_1= sheets[sheetindex];
////	    同过 字段名获取 sheet
////	    sheet_1=workbook.getSheet(sheetname);
//			ArrayList<HashMap<String, String>> list=new ArrayList<>();
//			
// 	  for (int hang = 1; hang <sheet.getRows() ; hang++) {
//// 		  
// 		 HashMap<String, String> map=new HashMap<>();
//		for (int lie = 0; lie <sheet.getColumns() ; lie++) {
////			取出  每行的值
//			Cell cell = sheet.getCell(lie, hang);
//			String map_value = cell.getContents();
////			取出key
//			Cell mapkey = sheet.getCell(lie,0);
//			String mapkey1= mapkey.getContents();
//			
//			
//			 System.out.println(mapkey+map_value);
//			 map.put(mapkey1, map_value);
////			Cell jieguo = sheet.getCell(hang, lei);
////			取出表 里 所有  内容
////			System.out.print(jieguo.getContents()+"     ");
//	   
//		}
//		    list.add(map);
//			System.out.println();
//			
//	}
// 	  
// 	 workbook.close();
// 	  return list;
// 	  
//  }
//}
