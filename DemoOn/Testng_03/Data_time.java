package Testng_03;
import java.nio.channels.NonReadableChannelException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import com.sun.net.httpserver.Authenticator.Result;


public class Data_time {
	//两种获取时间的方法 
	
	public static String format(Date data,String format) {
	   String result="";
		try {
			if (data!=null) {
				SimpleDateFormat df = new SimpleDateFormat(format);
				result=df.format(data);
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return result;
		
	}
	public static int getyear(Date date) {
		int result = 0;
		Calendar c = Calendar.getInstance();
		c.setTime(date);
		
		return c.get(Calendar.YEAR);
		
	}
	public static int getmonth(Date date) {
		int result = 0;
		Calendar c = Calendar.getInstance();
		c.setTime(date);
		
		return c.get(Calendar.MONTH);
	}
	public static int getday(Date date) {
		Calendar c = Calendar.getInstance();
		c.setTime(date);
		return  c.get(Calendar.DATE);
	}
	public static int gethour(Date date) {
		Calendar c = Calendar.getInstance();
		c.setTime(date);
		return  c.get(Calendar.HOUR_OF_DAY);
	}
	public static int getminute(Date date) {
		Calendar c = Calendar.getInstance();
		c.setTime(date);
		return  c.get(Calendar.MINUTE);
	}
	public static int getsecond(Date date) {
		Calendar c = Calendar.getInstance();
		c.setTime(date);
		return  c.get(Calendar.SECOND);
	}
	
	
	public static void main(String[] args) {
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

}
class time{
	

}