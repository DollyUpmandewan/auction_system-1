
package application;
import java.sql.*;
import java.util.*;

public class LoginAuction {
	public boolean LoginCheck(String username, String password) {
		
		ConnectingMysql co = new ConnectingMysql();
		Connection c = co.getConnection();
		try {
			Statement st = c.createStatement();
			ResultSet rs = st.executeQuery("select * from login where username="+username+" and password ="+password);
			if(rs.wasNull()) {
				return false;
			}
			String user = rs.getString(1);
			String pass = rs.getString(2);
			if (user.equals(username)&&
			pass.equals(password)) {
				return true;
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return false;
	}
}
