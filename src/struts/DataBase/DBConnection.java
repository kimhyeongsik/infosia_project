package struts.DataBase;

import java.sql.Connection;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

public class DBConnection {

	private static DBConnection single;
	private DataSource ds;

	public static DBConnection getInstance(){
		if(single ==  null){
			single = new DBConnection();
		}
		return single;
	}



	public Connection getConnection(){
		Connection conn =null;
		try{
			Context initial = new InitialContext();
			Context context = (Context) initial.lookup("java:comp/env");
			ds = (DataSource) context.lookup("jdbc/orcl");
			conn = ds.getConnection();
		}catch(Exception e){
			e.printStackTrace();
		}
		return conn;
	}



}
