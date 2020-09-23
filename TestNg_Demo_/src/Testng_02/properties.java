package Testng_02;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class properties {
	public static void main(String [] args) throws IOException {

        Properties properties = new Properties();
   	         // 使用ClassLoader加载properties配置文件生成对应的输入流
   	 InputStream in = Properties.class.getClassLoader().getResourceAsStream("E:\\eclipse\\TestNg_Demo_\\src\\Testng_02\\ObjectMap.properties");
    	         // 使用properties对象加载输入流
   	 
   	 properties.load(in);
   	         //获取key对应的value值
    	 properties.getProperty("Setvserion.Homepage.id=id:query");
	}

}

