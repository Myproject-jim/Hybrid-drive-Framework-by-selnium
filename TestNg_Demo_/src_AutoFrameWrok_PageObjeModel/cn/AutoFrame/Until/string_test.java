package cn.AutoFrame.Until;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import bsh.This;

public class string_test {

public static void main(String[] args) {
	char demo1='a';
	String demo2="ASBFF";
	char demo01='A';
	String demo02="ABfdfd546545CDE";
	 System.out.println(Character.toLowerCase('a'));
     System.out.println(Character.toLowerCase('A'));
 
	System.out.println(demo02.toLowerCase());
	
	
	//创建properties 对象
	  Properties	propertres;
    //加载读取文件
	  propertres = new Properties();
	  try {
		FileInputStream profile = new FileInputStream("E:\\eclipse\\TestNg_Demo_\\src_AutoFramwork\\ObjectMap.properties");  
		propertres.load(profile);
		profile.close();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		System.out.println("Reading file in error");
		e.printStackTrace();
	}
//	  String Locator = propertres.getProperty();
//		String elementtype=Locator.split(">")[0];
//		String elementvalue=Locator.split(">")[1];
}
	

}
