package Data_provider_base;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;


public class CSV_Until {
	public static Object[][] getdata(String fileName) throws IOException{
		
		List<Object[]> records = new ArrayList<Object[]>();
		String record;
		//设置utf-8字符集，使用带缓冲的区的字符输入流读取文件内容
		BufferedReader	file=new BufferedReader(new InputStreamReader(new FileInputStream(fileName)));
		//忽略读取csv文件标题的一行
		file.readLine();
	   //遍历除第一行的所有数据，并且存储在records数组中 每一个records存储对象作为一个string 存储数组
		while ((record=file.readLine())!=null) {
			String files[]=record.split(",");
			records.add(files);
			
		}
		if ((record=file.readLine())!=null) {
			for (int i = 0; i < record.length(); i++) {
				String files[]=record.split(",");
				records.add(files);
			}
		}
//		关闭数据流
		file.close();
		//定义一个object二维数组               转换object二维堆数组
		Object[][] resuls = new Object[records.size()][];
		for (int i = 0; i < resuls.length; i++) {
//			设置二维数组每行的值，每行的一个object对象
			resuls[i]=records.get(i);
			
		}
		
		return resuls;
		


		
	}

}
class test{
	public static void main(String[] args) throws IOException {
		CSV_Until.getdata("C:\\Users\\JIAMING.YANG\\Desktop\\01.csv");
	}
}
