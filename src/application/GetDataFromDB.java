package application;


import java.sql.*;

import java.util.*;

public class GetDataFromDB{
	public class GetItems{
		public int n = 200;
		public int item_id[] = new int[n];
		public String item_name[] = new String[n];
		public int seller_id[] = new int[n];
		public int start_bid[] = new int[n];
		public String category[] = new String[n];
		ConnectingMysql co = new ConnectingMysql();
		Connection c = co.getConnection();
		public void getItems() {
			try {
				int i = 0;
				Statement st = c.createStatement();
				ResultSet rs = st.executeQuery("select * from items");
				while(rs.next()) {
					item_id[i] = rs.getInt(1);
					item_name[i] = rs.getString(2);
					seller_id[i] = rs.getInt(3);
					start_bid[i] = rs.getInt(4);
					category[i] = rs.getString(5);
					i++;
					System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3)+" "+rs.getInt(4)+" "+rs.getString(5));
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		public void getItemById(int id) {
			try {
				Statement st = c.createStatement();
				ResultSet rs = st.executeQuery("select * from items where item_id ="+id);
				while(rs.next()) {
					item_id[0] = rs.getInt(1);
					item_name[0] = rs.getString(2);
					seller_id[0] = rs.getInt(3);
					start_bid[0] = rs.getInt(4);
					category[0] = rs.getString(5);
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		public void getItemByName(String name) {
			try {
				name = "\""+name+"\"";
				int i =0;
				Statement st = c.createStatement();
				ResultSet rs = st.executeQuery("select * from items where item_name ="+name);
				while(rs.next()) {
					item_id[i] = rs.getInt(1);
					item_name[i] = rs.getString(2);
					seller_id[i] = rs.getInt(3);
					start_bid[i] = rs.getInt(4);
					category[i] = rs.getString(5);
					i++;
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		public void getItemBySellerId(int seller) {
			try {
				int i =0;
				Statement st = c.createStatement();
				ResultSet rs = st.executeQuery("select * from items where seller_id ="+seller);
				while(rs.next()) {
					item_id[i] = rs.getInt(1);
					item_name[i] = rs.getString(2);
					seller_id[i] = rs.getInt(3);
					start_bid[i] = rs.getInt(4);
					category[i] = rs.getString(5);
					i++;
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		public void getItemByStartBid(int bid) {
			try {
				int i =0;
				Statement st = c.createStatement();
				ResultSet rs = st.executeQuery("select * from items where start_bid ="+bid);
				while(rs.next()) {
					item_id[i] = rs.getInt(1);
					item_name[i] = rs.getString(2);
					seller_id[i] = rs.getInt(3);
					start_bid[i] = rs.getInt(4);
					category[i] = rs.getString(5);
					i++;
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		public void getItemByCategory(String cat) {
			try {
				cat = "\""+cat+"\"";
				int i =0;
				Statement st = c.createStatement();
				ResultSet rs = st.executeQuery("select * from items where category ="+cat);
				while(rs.next()) {
					item_id[i] = rs.getInt(1);
					item_name[i] = rs.getString(2);
					seller_id[i] = rs.getInt(3);
					start_bid[i] = rs.getInt(4);
					category[i] = rs.getString(5);
					i++;
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	public class GetResearch{
		public int n = 200;
		public int id [] = new int[n];
		public String original_owner [] = new String[n];
		public int age [] = new int [n];
		public String find_loc [] = new String [n];
		public int item_id [] = new int [n];
		ConnectingMysql co = new ConnectingMysql();
		Connection c = co.getConnection();
		public void getResearch() {
			try {
				Statement st = c.createStatement();
				ResultSet rs = st.executeQuery("select * from research");
				int i = 0;
				while(rs.next()) {
					id[i] = rs.getInt(1);
					original_owner[i] = rs.getString(2);
					age[i] = rs.getInt(3);
					find_loc[i] = rs.getString(4);
					item_id[i]=rs.getInt(5);
					System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3)+" "+rs.getString(4)+" "+rs.getInt(5));
					i++;
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
		}
		public void getResearchByOwner(String owner) {
			try {
				owner = "\""+owner+"\"";
				Statement st = c.createStatement();
				ResultSet rs = st.executeQuery("select * from research where original_owner="+owner);
				int i =0;
				while(rs.next()) {
					id[i] = rs.getInt(1);
					original_owner[i] = rs.getString(2);
					age[i] = rs.getInt(3);
					find_loc[i] = rs.getString(4);
					item_id[i]=rs.getInt(5);
					System.out.println(rs.getString(1)+" "+rs.getInt(2)+" "+rs.getString(3)+" "+rs.getInt(4));
					i++;
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
		}
		public void getResearchByAge(int age1) {
			try {
				Statement st = c.createStatement();
				ResultSet rs = st.executeQuery("select * from research where age="+age1);
				int i =0;
				while(rs.next()) {
					id[i] = rs.getInt(1);
					original_owner[i] = rs.getString(2);
					age[i] = rs.getInt(3);
					find_loc[i] = rs.getString(4);
					item_id[i]=rs.getInt(5);
					System.out.println(rs.getString(1)+" "+rs.getInt(2)+" "+rs.getString(3)+" "+rs.getInt(4));
					i++;
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		public void getResearchByLoc(String loc) {
			try {
				loc = "\""+loc+"\"";
				Statement st = c.createStatement();
				ResultSet rs = st.executeQuery("select * from research where find_loc="+loc);
				int i =0;
				while(rs.next()) {
					id[i] = rs.getInt(1);
					original_owner[i] = rs.getString(2);
					age[i] = rs.getInt(3);
					find_loc[i] = rs.getString(4);
					item_id[i]=rs.getInt(5);
					System.out.println(rs.getString(1)+" "+rs.getInt(2)+" "+rs.getString(3)+" "+rs.getInt(4));
					i++;
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
		}
		public void getResearchByItemId(int itemid) {
			try {
				Statement st = c.createStatement();
				ResultSet rs = st.executeQuery("select * from research where item_id="+itemid);
				int i =0;
				while(rs.next()) {
					id[i] = rs.getInt(1);
					original_owner[i] = rs.getString(2);
					age[i] = rs.getInt(3);
					find_loc[i] = rs.getString(4);
					item_id[i]=rs.getInt(5);
					System.out.println(rs.getString(1)+" "+rs.getInt(2)+" "+rs.getString(3)+" "+rs.getInt(4));
					i++;
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	public class GetSeller{
		public int n =200;
		public int seller_id[] = new int[n];
		public String email[] = new String[n];
		public String fname[] = new String[n];
		public String lname[]= new String[n];
		public String contact_no[]= new String[n];
		ConnectingMysql co = new ConnectingMysql();
		Connection c = co.getConnection();
		public void getSeller() {
			try {
				int i = 0;
				Statement st = c.createStatement();
				ResultSet rs = st.executeQuery("select * from seller");
				while(rs.next()) {
					seller_id[i]=rs.getInt(1);
					email[i]=rs.getString(2);
					fname[i]=rs.getString(3);
					lname[i]=rs.getString(4);
					contact_no[i]=rs.getString(5);
					i++;
					System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getString(4)+" "+rs.getString(5));
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
		}
		public void getSellerByID(int id) {
			try {
				int i = 0;
				Statement st = c.createStatement();
				ResultSet rs = st.executeQuery("select * from seller where seller_id = "+id);
				while(rs.next()) {
					seller_id[i]=rs.getInt(1);
					email[i]=rs.getString(2);
					fname[i]=rs.getString(3);
					lname[i]=rs.getString(4);
					contact_no[i]=rs.getString(5);
					i++;
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
		}
		public void getSellerByEmail(String email_id) {
			try {
				email_id = "\""+email_id+"\"";
				int i = 0;
				Statement st = c.createStatement();
				ResultSet rs = st.executeQuery("select * from seller where email = "+email_id);
				while(rs.next()) {
					seller_id[i]=rs.getInt(1);
					email[i]=rs.getString(2);
					fname[i]=rs.getString(3);
					lname[i]=rs.getString(4);
					contact_no[i]=rs.getString(5);
					i++;
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
		}
		public void getSellerByContact(String contact) {
			try {
				contact = "\""+contact+"\"";
				int i = 0;
				Statement st = c.createStatement();
				ResultSet rs = st.executeQuery("select * from seller where contact_no = "+contact);
				while(rs.next()) {
					seller_id[i]=rs.getInt(1);
					email[i]=rs.getString(2);
					fname[i]=rs.getString(3);
					lname[i]=rs.getString(4);
					contact_no[i]=rs.getString(5);
					i++;
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
		}
		public void getSellerByFName(String name) {
			try {
				name = "\""+name+"\"";
				int i = 0;
				Statement st = c.createStatement();
				ResultSet rs = st.executeQuery("select * from seller where fname = "+name);
				while(rs.next()) {
					seller_id[i]=rs.getInt(1);
					email[i]=rs.getString(2);
					fname[i]=rs.getString(3);
					lname[i]=rs.getString(4);
					contact_no[i]=rs.getString(5);
					i++;
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
		}
		public void getSellerByLName(String name) {
			try {
				name = "\""+name+"\"";
				int i = 0;
				Statement st = c.createStatement();
				ResultSet rs = st.executeQuery("select * from seller where lname = "+name);
				while(rs.next()) {
					seller_id[i]=rs.getInt(1);
					email[i]=rs.getString(2);
					fname[i]=rs.getString(3);
					lname[i]=rs.getString(4);
					contact_no[i]=rs.getString(5);
					i++;
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
		}
	}
	public class GetBidder{
		public int n =200;
		public int bidder_id[] = new int[n];
		public String email[] = new String[n];
		public String fname[] = new String[n];
		public String lname[]= new String[n];
		public String contact_no[]= new String[n];
		public String address[] = new String[n];
		ConnectingMysql co = new ConnectingMysql();
		Connection c = co.getConnection();
		public void getBidder() {
			try {
				int i = 0;
				Statement st = c.createStatement();
				ResultSet rs = st.executeQuery("select * from bidder");
				while(rs.next()) {
					bidder_id[i]=rs.getInt(1);
					email[i]=rs.getString(2);
					fname[i]=rs.getString(3);
					lname[i]=rs.getString(4);
					contact_no[i]=rs.getString(5);
					address[i]=rs.getString(6);
					i++;
					System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getString(4)+" "
										+rs.getString(5)+" "+rs.getString(6));
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
		}
		public void getBidderByID(int id) {
			try {
				int i = 0;
				Statement st = c.createStatement();
				ResultSet rs = st.executeQuery("select * from bidder where bidder_id = "+id);
				while(rs.next()) {
					bidder_id[i]=rs.getInt(1);
					email[i]=rs.getString(2);
					fname[i]=rs.getString(3);
					lname[i]=rs.getString(4);
					contact_no[i]=rs.getString(5);
					address[i]=rs.getString(6);
					i++;
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
		}
		public void getBidderByEmail(String email_id) {
			try {
				email_id = "\""+email_id+"\"";
				int i = 0;
				Statement st = c.createStatement();
				ResultSet rs = st.executeQuery("select * from bidder where email = "+email_id);
				while(rs.next()) {
					bidder_id[i]=rs.getInt(1);
					email[i]=rs.getString(2);
					fname[i]=rs.getString(3);
					lname[i]=rs.getString(4);
					contact_no[i]=rs.getString(5);
					address[i]=rs.getString(6);
					i++;
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
		}
		public void getBidderByContact(String contact) {
			try {
				contact = "\""+contact+"\"";
				int i = 0;
				Statement st = c.createStatement();
				ResultSet rs = st.executeQuery("select * from bidder where contact_no = "+contact);
				while(rs.next()) {
					bidder_id[i]=rs.getInt(1);
					email[i]=rs.getString(2);
					fname[i]=rs.getString(3);
					lname[i]=rs.getString(4);
					contact_no[i]=rs.getString(5);
					address[i]=rs.getString(6);
					i++;
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
		}
		public void getSellerByFName(String name) {
			try {
				name = "\""+name+"\"";
				int i = 0;
				Statement st = c.createStatement();
				ResultSet rs = st.executeQuery("select * from bidder where fname = "+name);
				while(rs.next()) {
					bidder_id[i]=rs.getInt(1);
					email[i]=rs.getString(2);
					fname[i]=rs.getString(3);
					lname[i]=rs.getString(4);
					contact_no[i]=rs.getString(5);
					address[i]=rs.getString(6);
					i++;
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
		}
		public void getBidderByLName(String name) {
			try {
				name = "\""+name+"\"";
				int i = 0;
				Statement st = c.createStatement();
				ResultSet rs = st.executeQuery("select * from bidder where lname = "+name);
				while(rs.next()) {
					bidder_id[i]=rs.getInt(1);
					email[i]=rs.getString(2);
					fname[i]=rs.getString(3);
					lname[i]=rs.getString(4);
					contact_no[i]=rs.getString(5);
					address[i]=rs.getString(6);
					i++;
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
		}
	}
	public class Admin{
		public int n = 200;
		public int admin_id []  = new int[n];
		public String fname[] = new String[n];
		public String lname[] = new String[n];
		public String email[] = new String[n];
		ConnectingMysql co = new ConnectingMysql();
		Connection c = co.getConnection();
		public void getAdmins() {
			try {
				int i = 0;
				Statement st = c.createStatement();
				ResultSet rs = st.executeQuery("select * from _admin");
				while(rs.next()) {
					admin_id[i] = rs.getInt(1);
					fname[i] = rs.getString(2);
					lname[i] = rs.getString(3);
					email[i] = rs.getString(4);
					i++;
				}
			}catch(SQLException e) {
				e.printStackTrace();
			}
		}
		public void getAdminsById(int id) {
			try {
				int i = 0;
				Statement st = c.createStatement();
				ResultSet rs = st.executeQuery("select * from _admin where admin_id = "+id);
				while(rs.next()) {
					admin_id[i] = rs.getInt(1);
					fname[i] = rs.getString(2);
					lname[i] = rs.getString(3);
					email[i] = rs.getString(4);
					i++;
				}
			}catch(SQLException e) {
				e.printStackTrace();
			}
		}
		public void getAdminsByFName(String name) {
			try {
				name = "\""+name+"\"";
				int i = 0;
				Statement st = c.createStatement();
				ResultSet rs = st.executeQuery("select * from _admin where fname = "+name);
				while(rs.next()) {
					admin_id[i] = rs.getInt(1);
					fname[i] = rs.getString(2);
					lname[i] = rs.getString(3);
					email[i] = rs.getString(4);
					i++;
				}
			}catch(SQLException e) {
				e.printStackTrace();
			}
		}
		public void getAdminsByLName(String name) {
			try {
				name = "\""+name+"\"";
				int i = 0;
				Statement st = c.createStatement();
				ResultSet rs = st.executeQuery("select * from _admin where lname = "+name);
				while(rs.next()) {
					admin_id[i] = rs.getInt(1);
					fname[i] = rs.getString(2);
					lname[i] = rs.getString(3);
					email[i] = rs.getString(4);
					i++;
				}
			}catch(SQLException e) {
				e.printStackTrace();
			}
		}
		public void getAdminsByEmail(String email) {
			try {
				email = "\""+email+"\"";
				int i = 0;
				Statement st = c.createStatement();
				ResultSet rs = st.executeQuery("select * from _admin where email = "+email);
				while(rs.next()) {
					admin_id[i] = rs.getInt(1);
					fname[i] = rs.getString(2);
					lname[i] = rs.getString(3);
					this.email[i] = rs.getString(4);
					i++;
				}
			}catch(SQLException e) {
				e.printStackTrace();
			}
		}
	}
	public class GetBidHistory{
		public int n = 200;
		public int bid []  = new int[n];
		public int bid_id []  = new int[n];
		public int bidder_id []  = new int[n];
		public int item_id []  = new int[n];
		ConnectingMysql co = new ConnectingMysql();
		Connection c = co.getConnection();
		public void getBids() {
			try {
				int i = 0;
				Statement st = c.createStatement();
				ResultSet rs = st.executeQuery("select * from bid_history");
				while(rs.next()) {
					bid[i] = rs.getInt(1);
					bid_id [i] = rs.getInt(2);
					bidder_id[i]= rs.getInt(3);
					item_id[i] = rs.getInt(4);
					i++;
				}
			}catch(SQLException e) {
				e.printStackTrace();
			}
		}
		public void getBidsByBidder(int bidder) {
			try {
				int i = 0;
				Statement st = c.createStatement();
				ResultSet rs = st.executeQuery("select * from bid_history where bidder_id ="+bidder);
				while(rs.next()) {
					bid[i] = rs.getInt(1);
					bid_id [i] = rs.getInt(2);
					bidder_id[i]= rs.getInt(3);
					item_id[i] = rs.getInt(4);
					i++;
				}
			}catch(SQLException e) {
				e.printStackTrace();
			}
		}
		public void getBidsByItem(int item) {
			try {
				int i = 0;
				Statement st = c.createStatement();
				ResultSet rs = st.executeQuery("select * from bid_history where item_id ="+item);
				while(rs.next()) {
					bid[i] = rs.getInt(1);
					bid_id [i] = rs.getInt(2);
					bidder_id[i]= rs.getInt(3);
					item_id[i] = rs.getInt(4);
					i++;
				}
			}catch(SQLException e) { 
				e.printStackTrace();
			}
		}
	}
	
}
/*
items
research
shipping
seller
bidder
 _admin
bid_history 
*/
 