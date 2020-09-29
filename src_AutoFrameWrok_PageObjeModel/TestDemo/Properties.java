package TestDemo;

import java.nio.channels.NonWritableChannelException;
import java.util.function.IntPredicate;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ById;

import cn.AutoFrame.Until.Base_webdriver_browser;
import cn.AutoFrame.Until.ObjectMap;
import cn.AutoFrame.pagebyProperties.intro_Page;

public class Properties extends Base_webdriver_browser{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		ObjectMap Properfile = new ObjectMap("E:\\eclipse\\TestNg_Demo_\\src_AutoFramwork\\ObjectMap.properties");
//		
//		
//		driver.findElement(	Properfile.getlocator("inntro.checkbox"));
//		
//		driver.findElement(Properfile.getlocator("inntro.search"));
//	
		String str = "I am a chinese"; // 注�?,�?个�?��?使用空格分开的
		String[] strArr = str.split(" "); // 分割字符是空格,注�?
		System.out.println(strArr[1]);
		String string1=strArr[1];//== str.split(" ")[1];
		
		String string=str.split(" ")[1];
		System.out.println(string);
		int [] intlist=new int [1];
		
		String typeString="file.xlxlx";
		int s = typeString.indexOf(".");
		    String s1 = typeString.substring(typeString.indexOf("."));
		
		System.out.println(s);
		System.out.println(s1);
		
	}

}
