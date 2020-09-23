package cn.AutoFramk.ConfigUntil;

import java.awt.Choice;

import org.openqa.selenium.firefox.FirefoxProfile;

import Allbrowser.Firefox;
/*
 * 封装自动下载功能模块 不常用 这里只写了部分 方法
 */
public class DownloadUtil {

	public static FirefoxProfile  download(String download_paht) {
		FirefoxProfile firefile = new FirefoxProfile();
		//设定下载文件夹 若果设定 默认 存在下载目录文件夹下
		firefile.setPreference("browser.download.folderlist", 2);
		
		firefile.setPreference("browser.download.dir", download_paht);
		//设定文件类型 具体复制devtools or tools 中 浏览器 request 信息逐步填写
		firefile.setPreference("browser.download.dir", false);
		// any firlfile.setperference......
		return firefile;
	}
	
}
