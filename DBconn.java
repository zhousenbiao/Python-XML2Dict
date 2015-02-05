package com.juke123.jsondata;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBconn {

	public Connection getdbconn() throws SQLException {
		String driver = "com.mysql.jdbc.Driver";
		String url = "jdbc:mysql://192.168.1.2:3306/pvccrm?useUnicode=true&characterEncoding=UTF-8&rewriteBatchedStatements=true";

		String user = "pvccrm";
		String password = "mo439G76$$K^rw";
		Connection conn=null;  
		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(url, user, password);
//			if (!conn.isClosed())
//				System.out.println("Succeeded connecting to the Database!");

		} catch (ClassNotFoundException e) {
			System.out.println("Sorry,can`t find the Driver!");
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
//		finally{	
//			conn.close();	
//		}		
		return conn;
	}
}
