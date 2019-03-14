package org.sql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Mainconnection {
	private static Connection connection;
	public static Connection getConnection() throws ClassNotFoundException,SQLException{
	Class.forName("oracle.jdbc.driver.OracleDriver");
	connection =DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","tiger");
	return connection;
}}
