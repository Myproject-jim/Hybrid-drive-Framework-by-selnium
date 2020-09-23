package cn.AutoFramk.ConfigUntil;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import bsh.This;

/*
 * 封装  alert弹出弹出框封装  传入 driver定位元素，调用 alert.accept方法
 */
public class AlertUnit {
	//confrim
	public static void Confrimalert(WebDriver driver) {
		Boolean status;
		try {
			Alert alert = driver.switchTo().alert();
			
			if (alert!=null) {
				
				status=true;
			}else {
				status=false;
			}
		Assert.assertTrue(status);
		//confrim
		alert.accept();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("No such alert element");
		}
		
	}
	//disavowal
	public static void disavowal(WebDriver driver) {
		try {
			
		
		Alert diavowal = driver.switchTo().alert();
		Boolean alertStatus;
		if (diavowal!=null) {
			alertStatus=true;
		}else {
			alertStatus=false;
		}
//		断言当前 alertStatus 的状态
		assertTrue(alertStatus);
		
		diavowal.dismiss();
		} catch (Exception e) {
			// TODO: handle exception
			
			System.out.println("No such alert element");
		}
	}
	

	
}
