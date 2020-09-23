package cn.AutoFramk.ConfigUntil;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
/*
 * 操作cookie selenium提过几种造作cookie的机制 ，具体功能如下 获取cookie的信息 delete deleteall cookie
 */
public class CookieUtil {
	public static void getcookie(WebDriver driver) {
		Set<Cookie> cookie = driver.manage().getCookies();
		
		for (Cookie cookie2 : cookie) {
			System.out.println(String.format("%S->%S->%S->%S->%S->%S->%S->%S->",cookie2.getDomain(),cookie2.getName(),cookie2.getPath(),cookie2.getValue()));
		}
	}
	public static boolean deletecookie(WebDriver driver,String cookiestring) {
		Set<Cookie> cookie = driver.manage().getCookies();
		driver.manage().deleteCookieNamed(cookiestring);
		if (cookie==null) {
			return true;
		}else {
			return false;
		}
		
	}
	public static boolean deleteallcookie(WebDriver driver,String cookString) {
		Set<Cookie> cookie = driver.manage().getCookies();
		driver.manage().deleteAllCookies();
		if (cookie==null) {
			return true;
		}else {
			return false;
		}
		
	}
}
