package org.sql;
import java.sql.*;
import java.util.*;
public class Third3 {
	public static void main(String[] args)throws Exception {
		Scanner s=new Scanner(System.in);	
		
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection c=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","tiger");
		//PreparedStatement st=c.prepareStatement("update suchi set name=? where eno=?");
		PreparedStatement st=c.prepareStatement("delete from suchi where eno=?");
		System.out.println("enter name and empno");
		
	//	String name=s.next();
		int eno=s.nextInt();
		
	//	st.setString(1,name);
		st.setInt(1, eno);
		int x=st.executeUpdate();
		if(x>=1)
		System.out.println("row updated");
		else
			System.out.println("sorry");
	}
	}


