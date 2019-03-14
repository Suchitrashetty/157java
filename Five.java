package org.sql;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Five {
 public static void main(String[] args) throws Exception{
	 Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection c=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","tiger");
	    c.setAutoCommit(false);
	   PreparedStatement ps=c.prepareStatement("insert into suchi values(?,?,?)");
	   BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
   while(true) {
	   System.out.println("enter id");
	   String s1=br.readLine();
	   int id=Integer.parseInt(s1);
   }
 }
}
