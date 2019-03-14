package org.sql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Fourth {
public static void main(String[] args) throws Exception{
	Class.forName("oracle.jdbc.driver.OracleDriver");
	Connection c=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","tiger");
    c.setAutoCommit(false);//by making false we can rollback
    Statement st=c.createStatement();
    st.addBatch("insert into suchi values(11,'name2','address4')");
    st.addBatch("insert into suchi values(12,'name3','address4')");
    st.addBatch("insert into suchi values(23,'name4','address4')");

st.executeBatch();
c.commit();
c.close();
}
}
