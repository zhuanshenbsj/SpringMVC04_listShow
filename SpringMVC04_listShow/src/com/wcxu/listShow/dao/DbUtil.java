package com.wcxu.listShow.dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class DbUtil {
	private static String url = "jdbc:mysql://localhost:3306/mysql";// url="jdbc:mysql:///demo1";
	private static String user = "root";
	private static String pwd = "root";

	static {
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	public static Connection getConnection() throws Exception {

		Connection conn = DriverManager.getConnection(url, user, pwd);
		return conn;
	}

	public static void main(String[] args) {
		try {
			Connection conn = getConnection();
			System.out.println(conn);
			conn.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
