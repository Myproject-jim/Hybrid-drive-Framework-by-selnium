package Testng_03;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import com.mysql.fabric.xmlrpc.base.Data;

import bsh.This;

public class Fileclass {
	public static void main(String[] args) {
		String pathname="E:\\JFJDKFJLD";
		File mkdir=new File(pathname);
	
		//创建文件夹
		
		if (mkdir.mkdir()) {
			System.out.println("successful");
		}
		Date data = new Date();
		String filepath="jkjk.txt";
		File file=new File(pathname+"\\"+filepath+getyear(data)+getmonth(data)+1);
		try {
			//创建文件
			file.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Date now = new Date(); 
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");//可以方便地修改日期格式
		String hehe = dateFormat.format( now ); 
		System.out.println(hehe); 
		
		Calendar c = Calendar.getInstance();
		int year = c.get(Calendar.YEAR); 
		int month = c.get(Calendar.MONTH); 
		int date = c.get(Calendar.DATE); 
		int hour = c.get(Calendar.HOUR_OF_DAY); 
		int minute = c.get(Calendar.MINUTE); 
		int second = c.get(Calendar.SECOND); 
		System.out.println(year + "/" + month + "/" + date + " " +hour + ":" +minute + ":" + second); 
	}
//public static String data_time(Date data) {
//	if (data!=null) {
//		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
//		String currtetime = dateFormat.format( dateFormat );
//		return currtetime;
//	}else {
//		return null;
//	}
//	
//	
//}
public static int getyear(Date date) {
	int result = 0;
	Calendar c = Calendar.getInstance();
	c.setTime(date);
	
	return c.get(Calendar.YEAR);
	
}
public static int getmonth(Date date) {
	int current=0;
	Calendar calendar=Calendar.getInstance();
	current=calendar.get(Calendar.MONTH);
	return current;
}
}
