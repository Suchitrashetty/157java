package org.sql;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Types;

public class Six {
public static void main(String[] args) throws Exception{
	Class.forName("oracle.jdbc.driver.OracleDriver");
	Connection c=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","tiger");
	CallableStatement ps=c.prepareCall("call add12(?,?,?)");
	ps.setInt(1,10);
	ps.setInt(2,20);
ps.registerOutParameter(3,Types.INTEGER);
ps.execute();
int n=ps.getInt(3);
System.out.println(n);

}
}
