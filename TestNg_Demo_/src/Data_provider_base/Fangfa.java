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
//	// �����ļ� 
//			File file=new File(lujing);
////			 ���سɹ����ռ䣨��file  Ҳ����sheet ���سɹ����ռ䣩
//			Workbook workbook=Workbook.getWorkbook(file);
////			ͨ�������ռ�ȡ�� sheet
//			Sheet[] sheets = workbook.getSheets();
//////			��ȡ �����ֶε�����
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
////			ͨ�������±� ��ȡ���� sheet
////	    Sheet sheet_1= sheets[sheetindex];
////	    ͬ�� �ֶ�����ȡ sheet
////	    sheet_1=workbook.getSheet(sheetname);
//			ArrayList<HashMap<String, String>> list=new ArrayList<>();
//			
// 	  for (int hang = 1; hang <sheet.getRows() ; hang++) {
//// 		  
// 		 HashMap<String, String> map=new HashMap<>();
//		for (int lie = 0; lie <sheet.getColumns() ; lie++) {
////			ȡ��  ÿ�е�ֵ
//			Cell cell = sheet.getCell(lie, hang);
//			String map_value = cell.getContents();
////			ȡ��key
//			Cell mapkey = sheet.getCell(lie,0);
//			String mapkey1= mapkey.getContents();
//			
//			
//			 System.out.println(mapkey+map_value);
//			 map.put(mapkey1, map_value);
////			Cell jieguo = sheet.getCell(hang, lei);
////			ȡ���� �� ����  ����
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
