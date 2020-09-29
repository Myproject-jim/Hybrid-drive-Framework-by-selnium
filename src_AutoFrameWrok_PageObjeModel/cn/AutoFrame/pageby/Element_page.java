package cn.AutoFrame.pageby;

import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


/*
 * 将当前项目某一模块的页面page element 封装成成员变量
 * 这里只是单一举个例子 具体根据实际项目来
 */
public class Element_page {
	
	@FindBy(xpath = "")
	public static WebElement  username;
	@FindBy(xpath = "")
	public  static WebElement password;
	@FindBy(xpath = "")
	public static WebElement loginbtu;
	@FindBy(xpath = "")
	public  static WebElement  selectServer ;
	@FindBy(xpath = "")
	public static WebElement setbuild;
	@FindBy(xpath = "")
	public  static WebElement  setbuildbtu;
	@FindBy(xpath = "")
	public static WebElement clearversion;
	


	

}
