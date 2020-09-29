package cn.AutoFramk.ConfigUntil;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.NoSuchElementException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
/*
 * 利用 java propertites 类 封装页面定位元素信息
 */
public class ObjectMap {
	
	 static Properties properties;
	 WebDriver driver;
	 public ObjectMap(String filepath)  {
		// TODO Auto-generated constructor stub
		 properties = new Properties();
		try {
			FileInputStream in = new FileInputStream(filepath);
			properties.load(in);
			in.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			 
	}
	 public  By getpageElement(String key_element) {
		 
		 String profile=properties.getProperty(key_element);
		 String[] filelist = profile.split(">");
		 //�?�数组第一个值， 
		 String type=filelist[0];
		 String elementvalue=filelist[1];
		 System.out.println("object"+elementvalue);
		 try {
			 if (type.toLowerCase().equals("id")) {
				  return By.id(elementvalue);
				}else if (type.toLowerCase().equals("xpath")) {
					return By.xpath(elementvalue);
				}else if ( type.toLowerCase().equals("className")) {
					return By.className(elementvalue);
				}else if (type.toLowerCase().equals("cssSelector")) {
					return By.cssSelector(elementvalue);
				}else if (type.toLowerCase().equals("linkText")) {
					return By.linkText(elementvalue);
				}else if (type.toLowerCase().equals("partialLinkText")) {
					return By.partialLinkText(elementvalue);
				}else if (type.toLowerCase().equals("name")) {
					return By.name(elementvalue);
				}else if (type.toLowerCase().equals("tagName")) {
					return By.tagName(elementvalue);
				}else {
					return null;
				}
		} catch (NoSuchElementException e) {
			// TODO: handle exception
			System.out.println("Find element error please check on your enter element");
		}
		return null;
		
		
		 
	 }
	 
	 
	 public By waitforElement(String key_elememnt) {
		return null;
		 
	 }

}
