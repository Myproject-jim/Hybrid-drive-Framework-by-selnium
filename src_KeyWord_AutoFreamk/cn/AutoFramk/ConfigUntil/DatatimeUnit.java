package cn.AutoFramk.ConfigUntil;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import cn.AutoFrame.Until.string_test;
/*
 * 封装时间类
 * why  当case抛异常 ，或者被测对象出现crash信息需要截图操作的时候 需要    确定出现crash时间 该类自动被调用       
 */
public class DatatimeUnit {
	//原始方法
//	public void data() {
//		Date now = new Date(); 
//		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");//可以方便地修改日期格式
//		String hehe = dateFormat.format( now ); 
//		System.out.println(hehe); 
//		
//		Calendar c = Calendar.getInstance();
//		int year = c.get(Calendar.YEAR); 
//		int month = c.get(Calendar.MONTH); 
//		int date = c.get(Calendar.DATE); 
//		int hour = c.get(Calendar.HOUR_OF_DAY); 
//		int minute = c.get(Calendar.MINUTE); 
//		int second = c.get(Calendar.SECOND); 
//		System.out.println(year + "/" + month + "/" + date + " " +hour + ":" +minute + ":" + second); 
//	}
	//编者日期个格式 直接获时间
	public static String data(String format) {
		Date time = new Date();
		String gettime = null;
		if (time!=null) {
			SimpleDateFormat dataFormat=new SimpleDateFormat(format);//日期格式
		    gettime=dataFormat.format(time);
		}
		return gettime;
	}
	
	//选择性获取时间
	public static int getyear(Date data) {
	    Calendar timeobject = Calendar.getInstance();
	    //获取给定的时间
	    timeobject.setTime(data);
		return  timeobject.get(Calendar.YEAR);
	}
	public static int getmonth(Date data) {
	    Calendar timeobject = Calendar.getInstance();
	    //获取给定的时间
	    timeobject.setTime(data);
		return  timeobject.get(Calendar.MONTH);
	}
	public static int getdate(Date data) {
	    Calendar timeobject = Calendar.getInstance();
	    //获取给定的时间
	    timeobject.setTime(data);
		return  timeobject.get(Calendar.DATE);
	}
	public static int getHOUR_OF_DAY(Date data) {
	    Calendar timeobject = Calendar.getInstance();
	    //获取给定的时间
	    timeobject.setTime(data);
		return  timeobject.get(Calendar.HOUR_OF_DAY);
	}
	
	public static int MINUTE(Date data) {
	    Calendar timeobject = Calendar.getInstance();
	    //获取给定的时间
	    timeobject.setTime(data);
		return  timeobject.get(Calendar.MINUTE);
	}
	public static int getSECOND(Date data) {
	    Calendar timeobject = Calendar.getInstance();
	    //获取给定的时间
	    timeobject.setTime(data);
		return  timeobject.get(Calendar.SECOND);
	}
	
	

}
