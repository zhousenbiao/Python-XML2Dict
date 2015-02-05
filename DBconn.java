package com.juke123.jsondata;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBconn {

	public Connection getdbconn() throws SQLException {
		String driver = "com.mysql.jdbc.Driver";
		String url = "jdbc:mysql://127.0.0.1:3306/dbname?useUnicode=true&characterEncoding=UTF-8&rewriteBatchedStatements=true";

		String user = "root";
		String password = "pwd";
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
		return conn;
	}
}
