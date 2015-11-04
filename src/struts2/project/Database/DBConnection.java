package struts2.project.Database;

import java.sql.Connection;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

public class DBConnection {

	private static DBConnection single;

	public static DBConnection getInstance(){
		if(single == null){
			single = new DBConnection();
		}
		return single;
	}

	public Connection getConnection(){

		DataSource ds = null;
		Connection conn = null;

		try {
			Context initial = new InitialContext();
			Context context = (Context) initial.lookup("java:comp/env");
			ds = (DataSource) context.lookup("jdbc/oracle10");
			conn = ds.getConnection();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
		return conn;
	}




}
