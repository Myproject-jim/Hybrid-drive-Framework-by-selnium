package Data_provider_base;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;


public class MySql_Until {
	
	
	public static Object[][]getTestData(String tablename){
		String driver="com.mysql.jdbc.Driver";
		String url="";
		String user="";
		String password="";
		
	  List<Object[]> records=new ArrayList<Object[]>();
	  try {
		Class.forName(driver);
		Connection conn = DriverManager.getConnection(url,user,password);
		//判断数据库是否连接成功
		if (!conn.isClosed()) {
			System.out.println("--------连接成功------");
		}
	  //创建statement 从而去调用excutequery 去执行sql语句
		Statement statement=conn.createStatement();
		String sql="select * from "+tablename;
		
		//存取执行sql 后的结果集 
		ResultSet rs = statement.executeQuery(sql);
		ResultSetMetaData remata = rs.getMetaData();
		//调用 resultset...的getColumnCount 行的列数    
		int cols=remata.getColumnCount();
		//使用next方法遍历数据结果中的所有的行数
		while(rs.next()) {
			//定义一维数组
			String [] fileStrings=new String[cols];
		    int col=0;
			for(int clodx=0;clodx<cols;clodx++) {
				fileStrings[col]=rs.getString(clodx+1);
				col++;
			}
			records.add(fileStrings);
		}
		
	} catch (Exception e) {
		// TODO: handle exception
	}
		
	  //转化成object类
	  Object[][] restults=new Object[records.size()][];
	  //循环遍历
		for (int i = 0; i < restults.length; i++) {
			restults[i]=records.get(i);
		}
		return restults;
		
	}
	
	
	
	

}
