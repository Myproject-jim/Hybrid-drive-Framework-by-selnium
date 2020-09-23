package cn.AutoFrame.pagebyProperties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import cn.AutoFrame.Until.ObjectMap;
/*
 * 
 *page �?装当�?功能�?�的 page 元素  将元素�?装在   properites文件中
 * 
 */
public class intro_Page {
	
	
	private WebElement element=null;
	
	private ObjectMap  objectmap=new ObjectMap("E:\\eclipse\\TestNg_Demo_\\src_AutoFramwork\\ObjectMap.properties");
	
	private WebDriver webDriver;
	
	public intro_Page(WebDriver driver) {
		this.webDriver=driver;
	}
	
	public WebElement checkbox() {
		element=webDriver.findElement(objectmap.getlocator("inntro.checkbox"));
		return element;
		
	}
	public WebElement search() {
		element=webDriver.findElement(objectmap.getlocator("inntro.search"));
		return element;
	}
	public WebElement intro_btu() {
		element=webDriver.findElement(objectmap.getlocator("inntro.search"));
		return element;
	}
	

}
