
package application;
import java.sql.*;
import java.util.*;

public class LoginAuction {
	public boolean LoginCheck(String username, String password) {
		username = "\""+username+"\"";
		password = "\""+password+"\"";
		// Takes the User's Data, username and password 
		// return a boolean confirming the login credentials
		ConnectingMysql co = new ConnectingMysql();
		Connection c = co.getConnection();
		boolean flag = true;
		try {
			Statement st = c.createStatement();
			ResultSet rs = st.executeQuery("select * from login where username="+username+" and password ="+password); // Fetching from database
			if(rs.wasNull()) {
				return false; // returns false if no such tuple is found
			}
			String user = rs.getString(1);
			String pass = rs.getString(2);
			user = "\""+user+"\"";
			pass = "\""+pass+"\"";
			if (user.equals(username)&&
			pass.equals(password)) {
				flag = true;
				return true; // Re-checking the strings
			}
			else {
				flag = false;
				return false; }// Returns false if the re-checking fails
		}catch(Exception e) {
			e.printStackTrace();
		}
		try {
			c.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return flag;
	}
}
