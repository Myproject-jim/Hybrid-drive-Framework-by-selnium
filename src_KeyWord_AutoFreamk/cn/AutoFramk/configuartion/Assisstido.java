package cn.AutoFramk.configuartion;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebElement;
import org.testng.Assert;

import com.paybank.cn.AssistidoScript;

import cn.AutoFrame.Until.Constant;
import cn.AutoFrame.Until.ObjectMap;
/*
 * 动态封装 Assisstido page 界面元素 参数化
 */
import cn.AutoFramk.Constants.Constant_s;
import cn.AutoFramk.Drivebase.Base_webdriver_browser;

public class Assisstido extends Base_webdriver_browser{
	 private static ObjectMap objectmap=new ObjectMap(Constant_s.PATH_PROPERITES);
	 private static WebElement element;
	  
		public void inspectpage(String checkelement,String parm) {
			element=driver.findElement(objectmap.getlocator(checkelement));
			try {
				 assertEquals(element, "Assistido");
			} catch (Exception e) {
				// TODO: handle exception
				AssistidoScript.verifyStepStatus=false;
			}	   
		}
	 	
	    public void  meniuElement(String menuelemnt,String parm) {
	    	try {
	    		element=driver.findElement(objectmap.getlocator(menuelemnt));
				element.click();
			} catch (Exception e) {
				// TODO: handle exception
				AssistidoScript.verifyStepStatus=false;
			}
			
			
		}
		public void  payacount(String payelement,String emailadress) {
			try {
	    		element=driver.findElement(objectmap.getlocator(payelement));
				element.click();
				element.sendKeys(emailadress);
			} catch (Exception e) {
				// TODO: handle exception
				AssistidoScript.verifyStepStatus=false;
			}
			
		}
		public void  receiveacount(String receivelement,String emailadress) {
			try {
	    		element=driver.findElement(objectmap.getlocator(receivelement));
				element.click();
				element.sendKeys(emailadress);
			} catch (Exception e) {
				// TODO: handle exception
				AssistidoScript.verifyStepStatus=false;
			}
		}
		
		public void  receiveName(String receivelement,String name) {
			try {
	    		element=driver.findElement(objectmap.getlocator(receivelement));
				element.click();
				element.sendKeys(name);
			} catch (Exception e) {
				// TODO: handle exception
				AssistidoScript.verifyStepStatus=false;
			}
		}
		public void  transfer(String transferelment,String paynumaber) {
			try {
	    		element=driver.findElement(objectmap.getlocator(transferelment));
				element.click();
				element.sendKeys(paynumaber);
			} catch (Exception e) {
				// TODO: handle exception
				AssistidoScript.verifyStepStatus=false;
			}
		
		}
		
		public void  setpbtu(String stepbtuelement,String paynumaber) {
			try {
	    		element=driver.findElement(objectmap.getlocator(stepbtuelement));
				element.click();
			} catch (Exception e) {
				// TODO: handle exception
				AssistidoScript.verifyStepStatus=false;
			}
			
		}
		public void  sumbit(String sumbitelement,String paynumaber) {
			try {
	    		element=driver.findElement(objectmap.getlocator(sumbitelement));
				element.click();
			} catch (Exception e) {
				// TODO: handle exception
				AssistidoScript.verifyStepStatus=false;
			}
			
		}
		public void  actionstep(String actionstepelement,String parm) {
			element=driver.findElement(objectmap.getlocator(actionstepelement)); 
		    if(element.isEnabled()==false) {
		    	AssistidoScript.verifyStepStatus=false;
		    }
		}
}
