package cn.AutoFrame.Until;

import org.apache.log4j.Logger;



public class Log {
	private static Logger log=Logger.getLogger(Log.class.getName());
	public static void Start_test(String start) {
		log.info("-------------------------------");
		log.info("-----------start---------------");
		
	}
	public static void end_test(String end_test) {
	
		log.info("-----------end---------------");
		log.info("-------------------------------");
		
	}
	public static void warn(String warn) {
		
		log.warn(warn);
		
	}
	public static void error(String error) {
	
		log.error(error);
		
	}
	public static void info(String info) {
		
		log.info(info);
		
	}
}
