package cn.AutoFrame.pagebyProperties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import cn.AutoFrame.Until.Constant;
import cn.AutoFrame.Until.ObjectMap;

public class FormulárioAssistido {
	
	private  WebElement  Element=null;
    
	private ObjectMap objectMap=new ObjectMap(Constant.OBJECTMAP_STRING);
	
	private WebDriver webDriver;
	
	public  WebElement meniuElement() {
		Element=webDriver.findElement(objectMap.getlocator("Assistido.menu"));	
		return Element;
		
	}
	public WebElement payacount() {
		Element=webDriver.findElement(objectMap.getlocator("Assistido.payacount"));	
		return Element;
	}
	public WebElement receiveacount() {
		Element=webDriver.findElement(objectMap.getlocator("Assistido.receiveacount"));	
		return Element;
	}
	
	public WebElement receiveName() {
		Element=webDriver.findElement(objectMap.getlocator("Assistido.receiveName"));	
		return Element;
	}
	public WebElement transfer() {
		Element=webDriver.findElement(objectMap.getlocator("Assistido.transfer"));	
		return Element;
	}
	
	public WebElement setpbtu() {
		 Element=webDriver.findElement(objectMap.getlocator("Assistido.transfer"));
		 return Element;
	}
	public WebElement sumbit() {
		 Element=webDriver.findElement(objectMap.getlocator("Assistido.transfer"));
		 return Element;
	}
	public WebElement actionstep() {
		 Element=webDriver.findElement(objectMap.getlocator("Assistido.transfer"));
		 return Element;
	}
}
