package application;

import java.sql.*;

class SetDataIntoDB{
	
	public void NewItem(String itemName, int sellerID, int startBid, int category) {
		ConnectingMysql co = new ConnectingMysql();
		Connection c = co.getConnection();
		try {
			Statement st = c.createStatement();
			st.execute("insert into items values("+itemName+","+sellerID+","+startBid+","+category+")");
			System.out.println("Successfuly pushed into the Database");
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}