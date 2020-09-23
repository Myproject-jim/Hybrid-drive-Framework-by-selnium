package cn.AutoFramk.configuartion;

import static org.testng.Assert.assertTrue;

import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.antdesgin.Setversion;
import com.antdesgin.Testsuiebyexcel;

import Constants.Constant_s;
import cn.AutoFrame.Until.Base_webdriver_browser;
import cn.AutoFrame.Until.Log;
import cn.AutoFrame.Until.string_test;
import cn.AutoFramk.ConfigUntil.KeyBordUnit;
import cn.AutoFramk.ConfigUntil.ObjectMap;
import cn.AutoFramk.ConfigUntil.WaitUnit;
import net.bytebuddy.implementation.bind.annotation.Super;


/*\
 * 封装脚本事件流，CaseStep，本类对应的功能模块的具体操作流程 使得action 事件与 参数想分离 ，
 * 每个方法对应 某一功能模块的的而具体造作做步骤 
 * try  cach  why  ：  通过try catch  报出异常  if 当前元素没有找到  传值给 case 的定义的参数 Testsuiebyexcel.case_status 这里自定义的参数
 */

public class KeywordsAction extends Base_webdriver_browser   {
	
	private static  ObjectMap objectMap = new ObjectMap(Constant_s.PATH_PROPERITES);
	
	public static void input_username(String username) {
		try {
			driver.findElement(objectMap.getpageElement("login.uesrname")).clear();
			driver.findElement(objectMap.getpageElement("login.uesrname")).sendKeys(username);
		} catch (Exception e) {
			// TODO: handle exception
			//执行打印log日志
//			Log.error("this case was fail");
			Setversion.case_status=false;
			Testsuiebyexcel.case_status=false;
		}
		
	}
	public static void input_password(String password) {
		try {
			driver.findElement(objectMap.getpageElement("login.password")).clear();
			driver.findElement(objectMap.getpageElement("login.password")).sendKeys(password);	
		} catch (Exception e) {
			// TODO: handle exception
			Setversion.case_status=false;
			Testsuiebyexcel.case_status=false;
		}
		
	}
	public static void click(String status) {
		try {
			driver.findElement(objectMap.getpageElement("login.click")).click();
		} catch (Exception e) {
			// TODO: handle exception
			Setversion.case_status=false;
			Testsuiebyexcel.case_status=false;
		}
	}
	public static void waitfor_element(String xpathExpression) {
		try {
			WebDriverWait wait = new WebDriverWait(driver, 15);
			wait.until(ExpectedConditions.elementToBeSelected(By.xpath(xpathExpression)));
		} catch (Exception e) {
			// TODO: handle exception
			Setversion.case_status=false;
			Testsuiebyexcel.case_status=false;
		}
		
	}
	
// 当前页面的key
//	from.page
//	payacount.item
//	repayacount.item
//	payname.item
//	transfer.item
//	nstep.item
//	confirem.item

	
	public static void select_from0(String selectfrom) {
	try {
		 WebElement del = driver.findElement(objectMap.getpageElement("form.page0"));
		 del.click();
	} catch (Exception e) {
		// TODO: handle exception
		Setversion.case_status=false;
		Testsuiebyexcel.case_status=false;
	}
		
	}
	public static void select_from1(String selectfrom) {
		try {
			WaitUnit.Waitelement(driver, 30, objectMap.getpageElement("from.page1"));
			driver.findElement(objectMap.getpageElement("from.page1")).click();
		} catch (Exception e) {
			// TODO: handle exception
			Setversion.case_status=false;
			Testsuiebyexcel.case_status=false;
		}
		
	}
	public static void Enter_payaccount(String payacount) {
		try {
			WaitUnit.Waitelement(driver, 10, objectMap.getpageElement("payacount.item"));
			driver.findElement(objectMap.getpageElement("payacount.item")).click();
		} catch (Exception e) {
			// TODO: handle exception
			Setversion.case_status=false;
			Testsuiebyexcel.case_status=false;
		}
		
	}
	public static void Enter_repayaccont(String repayaccount) {
		
		try {
			WaitUnit.Waitelement(driver, 10, objectMap.getpageElement("repayacount.item"));
			driver.findElement(objectMap.getpageElement("repayacount.item")).clear();
			driver.findElement(objectMap.getpageElement("repayacount.item")).sendKeys(repayaccount);	
		} catch (Exception e) {
			// TODO: handle exception
			Setversion.case_status=false;
			Testsuiebyexcel.case_status=false;
		}
	}
	public static void Enter_pay_name(String payname) {
		WaitUnit.Waitelement(driver, 10, objectMap.getpageElement("payname.item"));
		driver.findElement(objectMap.getpageElement("payname.item")).clear();
		driver.findElement(objectMap.getpageElement("payname.item")).sendKeys(payname);
	try {
			
		} catch (Exception e) {
			// TODO: handle exception
			Setversion.case_status=false;
			Testsuiebyexcel.case_status=false;
		}
	}
	public static void	Transfer_amount(String TsMount) {
	
	try {
		WaitUnit.Waitelement(driver, 10, objectMap.getpageElement("payname.item"));
		driver.findElement(objectMap.getpageElement("transfer.item")).sendKeys(TsMount);
		} catch (Exception e) {
			// TODO: handle exception
			Setversion.case_status=false;
			Testsuiebyexcel.case_status=false;
		}
	}
	public static void click_next_step(String status) {
		
	try {
		WaitUnit.Waitelement(driver, 10, objectMap.getpageElement("nstep.item"));
		driver.findElement(objectMap.getpageElement("nstep.item")).click();
		} catch (Exception e) {
			// TODO: handle exception
			Setversion.case_status=false;
			Testsuiebyexcel.case_status=false;
		}
	}
	public static void click_next_confirm(String status) {
	
	try {
		driver.findElement(objectMap.getpageElement("confirem.item")).click();	
		} catch (Exception e) {
			// TODO: handle exception
			Setversion.case_status=false;
			Testsuiebyexcel.case_status=false;
		}
	}

	
	
	
	
	
	
}
