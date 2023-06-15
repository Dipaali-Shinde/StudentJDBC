package com.jdbclogin.connection;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;
public class DbConnection {
	public static Connection getDatabaseConnection() {
		try {
			Class.forName(DbDetails.DBDRIVER);
			Connection con = DriverManager.getConnection(
			DbDetails.CONSTR, DbDetails.USERNAME, DbDetails.PASSWORD);
			return con;
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
			return null;
		}
	}
}
