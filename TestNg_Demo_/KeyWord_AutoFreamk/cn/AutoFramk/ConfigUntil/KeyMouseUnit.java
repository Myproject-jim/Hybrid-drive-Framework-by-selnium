package cn.AutoFramk.ConfigUntil;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
/*
 * 封装鼠标操作
 */
public class KeyMouseUnit {

	public static  void KeyMouse_doubleclick(WebDriver mouseDriver) {
		Actions action =new Actions(mouseDriver);
		action.doubleClick();
	}
	public static void KeyMouse_Waitelement(WebDriver mouseDriver,WebElement Waitelement) {
		Actions action =new Actions(mouseDriver);
//		设置悬停的等待时间
		try {
			Thread.sleep(5000);
		} catch (Exception e) {
			// TODO: handle exception
		}
		action.moveToElement(Waitelement).perform();
		
	}
	public static void KeyMouse_hold(WebDriver mouseDriver,WebElement Waitelement) {
		Actions action =new Actions(mouseDriver);
	
		action.clickAndHold(Waitelement);
		//设置时间等待时间
		try {
			Thread.sleep(5000);
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		action.release();
	}
	//右击鼠标
	public static void KeyMouse_right(WebDriver mouseDriver,WebElement element) {
		Actions action = new Actions(mouseDriver);
		action.contextClick(element).perform();
	}
	//拖拽元素
	public static void KeyMouse_dragpage(WebDriver mouseDriver,WebElement element) {
		Actions action = new Actions(mouseDriver);
		for (int i = 0; i < 5; i++) {
			//                           x坐标  y坐标  指代页面上面
			action.dragAndDropBy(element, 0,10);
		}
	}
	
	
}
