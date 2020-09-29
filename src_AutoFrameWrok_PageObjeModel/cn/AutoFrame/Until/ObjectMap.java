package cn.AutoFrame.Until;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.channels.NonWritableChannelException;
import java.util.NoSuchElementException;
import java.util.Properties;

import org.openqa.selenium.By;

/*
 * 
 *实现在外部配置文件来完成定位表达式
 */
public class ObjectMap {
	Properties propertres;
// 定义构造方法
	public ObjectMap(String filepath)  {
		//创建properties 对象
	        
	     //加载读取文件
		  propertres = new Properties();
		  try {
			FileInputStream profile = new FileInputStream(filepath);  
			System.out.println(profile);
			propertres.load(profile);
			profile.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("Reading file in error");
			e.printStackTrace();
		}
		  
	}
	//处理 elenemnt元素， 封装定位方法
	public  By getlocator(String filename_element) {
		String Locator = propertres.getProperty(filename_element);
		String[] elementlist=Locator.split(">");
		String elementtype1=elementlist[1];
		String elementtype=Locator.split(">")[0];
		String elementvalue=Locator.split(">")[1];
		System.out.println("######"+Locator+"######");
		System.out.println("######"+elementtype+"######");
		System.out.println("######"+elementvalue+"######");
	
		try {
			
		} catch (NoSuchElementException e) { 
			// TODO: handle exception
			System.out.println("NO Such element please verify your enter element");
		}
		if (elementtype.toLowerCase().equals("id")) {
			return By.id(elementvalue);
		}else if (elementvalue.equals("xpath")) {
			return By.xpath(elementvalue);
		}else if (elementvalue.toLowerCase().equals("tagName")) {
			return By.tagName(elementvalue);
		}else if (elementtype.toLowerCase().equals("className")) {
			return By.className(elementvalue);
		}else if (elementtype.toLowerCase().equals("cssSelector")) {
			return By.cssSelector(elementvalue);
		}else if (elementtype.toLowerCase().equals("linkText")) {
			return By.linkText(elementvalue);
		}else if (elementtype.toLowerCase().equals("partialLinkText")) {
			return By.partialLinkText(elementvalue);
		}else {
			return null;
		}
		
		
		
	}
	

}
