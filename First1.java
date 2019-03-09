package org.sql;
import java.sql.*;
public class First1 {
 public static void main(String[] args) throws Exception{
	Class.forName("oracle.jdbc.driver.OracleDriver");
	Connection c=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","tiger");
	Statement st=c.createStatement();
   // st.execute("create table suchi(eno number,name varchar2(20),address varchar2(20))");
    //System.out.println("table created");
    //st.execute("insert into suchi values(1,'suchi','bangalore')");
    	//	System.out.println("row created");
	//st.execute("update suchi set name='suchitra' where eno=1");
	//System.out.println("updated");
	st.execute("insert into suchi values(2,'suvi','bangalore')");
		System.out.println(" second row created");
		st.execute("insert into suchi values(3,'sudee','bangalore')");
    		System.out.println("third row created");


   ResultSet rs=st.executeQuery("select * from suchi");
   while(rs.next()) {
	   System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3));
   }
 }
}
