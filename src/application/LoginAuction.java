
package application;
import java.sql.*;
import java.util.*;

public class LoginAuction {
	public boolean LoginCheck(String username, String password) { 
		// Takes the User's Data, username and password 
		// return a boolean confirming the login credentials
		ConnectingMysql co = new ConnectingMysql();
		Connection c = co.getConnection();
		try {
			Statement st = c.createStatement();
			ResultSet rs = st.executeQuery("select * from login where username="+username+" and password ="+password); // Fetching from database
			if(rs.wasNull()) {
				return false; // returns false if no such tuple is found
			}
			String user = rs.getString(1);
			String pass = rs.getString(2);
			if (user.equals(username)&&
			pass.equals(password)) {
				return true; // Re-checking the strings
			}
			else 
				return false; // Returns false if the re-checking fails
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return false;
	}
}
