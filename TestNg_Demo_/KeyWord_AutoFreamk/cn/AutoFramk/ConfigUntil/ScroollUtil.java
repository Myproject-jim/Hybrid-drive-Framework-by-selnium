package cn.AutoFramk.ConfigUntil;

import org.openqa.selenium.JavascriptExecutor;

import com.mysql.jdbc.Driver;

import cn.AutoFrame.Until.Base_webdriver_browser;

public class ScroollUtil extends Base_webdriver_browser {
//设置滚动条的移动的像素
	public static void  scroll() {
		((JavascriptExecutor)driver).executeScript("window.scrollBy(0,800)");
		
		
	}
}
