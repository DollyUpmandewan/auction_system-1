package application;

import java.sql.*;
import java.util.*;
public class ConnectingMysql {
	public Connection connection;
	public Connection getConnection() {
		String dbName = "auction";
		String userName = "root";
		String password = "password";
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			connection = DriverManager.getConnection("jdbc:mysql://localhost/"+dbName,userName,password);
		}catch(Exception e) {
			System.out.println(e);
		}
		
		return connection;
	}
	/*public static void main(String...s) {
		ConnectingMysql c = new ConnectingMysql();
		Connection co = c.getConnection();
		try {
			Statement st = co.createStatement();
			ResultSet rs = st.executeQuery("select * from test");
			//st.executeUpdate("insert into test values(5,5)");
			while(rs.next()) {
				System.out.println(rs.getInt(1)+" "+rs.getInt(2));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
	}*/
}
