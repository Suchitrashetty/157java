package org.sql;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Types;

public class Seven {
	public static void main(String[] args) throws Exception {
		
	
	Class.forName("oracle.jdbc.driver.OracleDriver");
	Connection c=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","tiger");
	CallableStatement ps=c.prepareCall("{?=call add_pro(?,?)}");
	ps.registerOutParameter(1,Types.INTEGER);
	ps.setInt(2, 20);
	ps.setInt(3, 30);
	ps.execute();
	int n=ps.getInt(1);
	System.out.println(n);
	}
}
