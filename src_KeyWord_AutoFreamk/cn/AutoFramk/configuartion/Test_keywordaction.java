package cn.AutoFramk.configuartion;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;

import cn.AutoFrame.pagebyProperties.intro_Page;
import cn.AutoFramk.ConfigUntil.ExcelUnit;
/*
 * java 映射机制 具体可看官网具体教程     https://www.cnblogs.com/onlywujun/p/3519037.html
 * 作用 ：通过
 * 
 * 
 */
import cn.AutoFramk.Constants.Constant_s;

public class Test_keywordaction {
	private static Method methods[];
	private static KeywordsAction keywordsAction;
	public static void main(String[] args) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException, InvalidFormatException, IOException {
		keywordsAction=new KeywordsAction();
		
		methods=keywordsAction.getClass().getMethods();
		
		System.out.println(methods+"-----------methods");
		
		ExcelUnit.setexcelfile(Constant_s.PATH_EXCEL, "javaUntil.xlsx");
	
		all_ste();
		for (int i = 0; i < 5; i++) {
			System.out.println(ExcelUnit.Readbylocationexcel(i,4,Constant_s.SHEET_TESTSTEP));
		}
	}
	@SuppressWarnings("unlikely-arg-type")
	private static void  all_ste() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
	
		for (int i = 0; i < methods.length; i++) {
			if (methods[i].getName().equals("input_username")) {
				methods[i].invoke(keywordsAction,"1111");
			  System.out.println(methods[i]);
			}
		}
	}

}
