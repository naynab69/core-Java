//Program to demonstrate Database Settings 
package com.tnsif.preparedstatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DBUtil {
	private static final String DB_DRIVER_CLASS = "com.mysql.cj.jdbc.Driver";
	private static final String DB_USERNAME = "root";
	private static final String DB_PASSWORD = "Sanavi@05";
	private static final String DB_URL = "jdbc:mysql://localhost:3306/test";

	private static Connection con = null;
	private static Properties properties = null;
	static {

		try {
			Class.forName(DB_DRIVER_CLASS);
			properties = new Properties();
			properties.put("user", DB_USERNAME);
			properties.put("password", DB_PASSWORD);
			con = DriverManager.getConnection(DB_URL, properties);
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}

	public static Connection getConnectionObject() {
		return con;
	}
}
