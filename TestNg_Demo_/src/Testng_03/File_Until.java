package Testng_03;

import java.io.File;
import java.io.IOException;
public class File_Until {
	
	public static boolean creatfile(String destfilename) {
		File file = new File(destfilename);	
		if (file.exists()) {
			System.out.println("创建单个文件"+destfilename+"失败，目标已存在");
			return false;
		}else if (destfilename.endsWith(file.separator)) {
			System.out.println(""+destfilename+"dir is null");
			return false;
		} 
		//判断目标文件所在目录是否存在
		if (file.getParentFile().exists()) {
			System.out.println("Dir  was null");
			if(!file.getParentFile().mkdirs()) {
				System.out.println("Create dir is fail");
				return false;
			}
		}
		//判断创建的目标文件
		try {
			if (file.createNewFile()) {
			System.out.println("create singal file successful");	
			return true;
			}else {
				
				System.out.println("create singal file is fail");
				return false;
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
				
		return true;
	}
	//创建文件夹
	public static boolean createdir(String filename) {
		File dirFile=new File(filename);
		if (dirFile.exists()) {
			System.out.println("create file is fail for"+filename);
			return false;
		}
		if (dirFile.mkdirs()) {
			System.out.println("create file is successful"+filename);
			return true;
		}else {
			System.out.println("create file is fail for"+filename);
			return false;
		}
		
		
		
	}
		
}
