package cn.AutoFramk.ConfigUntil;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import Testng_03.File_Until;

public class ScreenShotUnit {
	public static void main(String[] args) throws IOException {
		Date date=new Date();
		String picdir = "E:\\"+String.valueOf(DatatimeUnit.getyear(date));
		File file = new File(picdir);
		file.createNewFile();
	}
	
	public static void screenshot(String filepath) throws IOException {
		Date date=new Date();
		String picdir = filepath+String.valueOf(DatatimeUnit.getyear(date));
         File file = new File(filepath);
         if (!file.exists()) {
			file.createNewFile();
		}
		
		
		//截图保存

//		WebDriver driver = null;
//		TakesScreenshot screenShot = (TakesScreenshot) driver;
//
//		File file = screenShot.getScreenshotAs(OutputType.FILE);
//
//		try {
//
//			FileUtils.copyFile(file, new File(filepath));
//
//		} catch (IOException e) {
//
//			// TODO Auto-generated catch block
//
//			e.printStackTrace();
//
//		}
	}

}
