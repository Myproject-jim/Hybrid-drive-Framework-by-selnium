package cn.AutoFramk.ConfigUntil;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

import com.sun.istack.localization.NullLocalizable;
/*
 * 封装键盘操作
 */
public class KeyBordUnit {
	
	public  static void keyBord_Tab() {
		Robot robot=null;
		
		try {
			robot=new Robot();
		} catch (AWTException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);
	}
	
	public static void keybord_Enter() {
	Robot robot=null;
		
		try {
			robot=new Robot();
		} catch (AWTException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
	}
	public static void keybord_Ctrl_v_c(String ctrl_string) {
		//设定剪贴版的内容
		StringSelection ctrl_select = new StringSelection(ctrl_string);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ctrl_select, null);
		
		
	   Robot robot=null;
	   
	   try {
		robot=new Robot();
	} catch (Exception e) {
		// TODO: handle exception
	}
	   robot.keyPress(KeyEvent.VK_CONTROL);
	   robot.keyPress(KeyEvent.VK_V);
	   robot.keyRelease(KeyEvent.VK_CONTROL);
	   robot.keyRelease(KeyEvent.VK_V);
		
	}
//	any methods  根据项目需要引用
	/*
	 * 操作键盘的另一中方法 声明action事件
	 */
	public static void action_keybord(WebDriver driver) {
	  Actions action = new Actions(driver);
	  action.keyDown(Keys.UP);
	  action.keyUp(Keys.UP);
	}

}
