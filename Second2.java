package org.sql;
import java.sql.*;
import java.util.*;
public class Second2 {
	public static void main(String[] args)throws Exception {
	Scanner s=new Scanner(System.in);	
	
	Class.forName("oracle.jdbc.driver.OracleDriver");
	Connection c=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","tiger");
	PreparedStatement st=c.prepareStatement("insert into suchi values(?,?,?)");
	System.out.println("enter eno,name,address");
	int empno=s.nextInt();
	String name=s.next();
	String address=s.next();
	st.setInt(1, empno);
	st.setString(2,name);
	st.setString(3,address);
	st.execute();
	System.out.println("row inserted");
	}
}
