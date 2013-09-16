package com.sd.training.struts2.util;

import java.sql.Connection;
import java.sql.DriverManager;

public class DatabaseUtil {

	public static Connection getDBConnection(){
	Connection conn = null;
	  String url = "jdbc:mysql://localhost:3306/";
	  String dbName = "onlineshopdb";
	  String driver = "com.mysql.jdbc.Driver";
	  String userName = "root"; 
	  String password = "root";
	  try {
	  Class.forName(driver).newInstance();
	  conn = DriverManager.getConnection(url+dbName,userName,password);
	  System.out.println("Connected to the database");
	  conn.close();
	  System.out.println("Disconnected from database");
	  } catch (Exception e) {
	  e.printStackTrace();
	  }
	  return conn;
	}
}