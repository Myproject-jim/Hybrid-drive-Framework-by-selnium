package Testng_02;

import java.awt.Button;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.channels.NonReadableChannelException;
import java.util.Properties;

import org.openqa.selenium.By;

public class ObjectMap_tools {
	
	Properties properties;
	
	public ObjectMap_tools (String properfile) throws IOException  {
		
					try {
						FileInputStream in = new FileInputStream(properfile);
						properties.load(in);
						in.close();
					} catch (FileNotFoundException e) {
						// TODO Auto-generated catch block
						System.out.println("file was error");
						e.printStackTrace();
					}
					
		
	}
	public By getlocalor(String elementfile) {
		
		String  localfile=properties.getProperty(elementfile);
		
		String localtype = localfile.split(":")[0];
		String localvalue= localfile.split(":")[1];
		
		System.out.println("element type"+localtype+"element value"+localvalue);
		
		if (localtype.toLowerCase().equals("id")) {
			return By.id(localvalue);
		}else if (localtype.toLowerCase().equals("className")){
			return By.className(localvalue);
		}else if(localtype.toLowerCase().equals("tagName")) {
			return By.tagName(localvalue);
			
		}else if(localtype.toLowerCase().equals("Linktext")) {
			return By.linkText(localvalue);
		}else if (localtype.toLowerCase().equals("partlink")) {
			return By.partialLinkText(localvalue);
		}else if(localtype.toLowerCase().equals("cssseletor")) {
			return By.cssSelector(localvalue);
		}else if (localtype.toLowerCase().equals("xpath")) {
			return By.xpath(localvalue);
		}else {
			System.out.println("输入内容未定义");
			return null;
		}
			
	}

}
