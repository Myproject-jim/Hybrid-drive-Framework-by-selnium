package cn.AutoFramk.DataUtil;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
import java.util.ArrayList;



public class TestNGbyMysql {
	public static Object[][] connectMysql() {
	/*
	 * 定义数据库的基本变量
	 */
//		声明mysql驱动
		String diver="";
//		声明本地数据库ip地址加数据名称
		String url="";
		
		String user="";
		
		String password="";
		
		ArrayList<Object[]> datalist = new ArrayList<Object[]>();
		
		/*
		 * 连接数据设置数据
		 */
		
		try {
			Class.forName(diver);
			//连接数据库
			Connection conn = DriverManager.getConnection(url,user,password);
			if (!conn.isClosed()) {
				System.out.println("mysql connect successful");
			}
			//创建statement 对象
			 Statement statement = conn.createStatement();
			//创建sql语句
			 String sql="";
			 //声明resultset对象  存储数据库返回的结果
			ResultSet rs=statement.executeQuery(sql);
			
			ResultSetMetaData rsmetadata = rs.getMetaData();
			//获取数据库表的行列数
			 int cols=rsmetadata.getColumnCount();
			 //循环遍历里面的数据
			 while (rs.next()) {
				 //定义字符型数据存储数据
				String[] list=new String[cols];
				
				
				for (int i = 0; i < cols; i++) {
					list[i]=rs.getString(i+1);
					
				}
				datalist.add(list);
				//取出前3行数据  验证数据是否准确
				for (int i = 0; i < 3; i++) {
					System.out.println("Vefire"+rs.getString(i));
				}
				//关闭数据库结果集对象
				rs.close();
//				断开连接
				conn.close();
			}
			 
	/*
	 * 转换成 object 二维数据 用于  testng DataProvider 方法读取数据
	 */
		Object[][] objects=new Object[datalist.size()][];	
		for (int i = 0; i < objects.length; i++) {
			objects[i]=datalist.get(i);
		}	
		
		return objects;
		} catch (Exception e) {
			// TODO: handle exception
		}
		return null;
		
			
	}

}
