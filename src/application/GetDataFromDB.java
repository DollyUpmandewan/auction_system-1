package application;

import java.sql.*;

import java.util.*;

public class GetDataFromDB{
	class GetItems{
		int n = 200;
		int item_id[] = new int[n];
		String item_name[] = new String[n];
		int seller_id[] = new int[n];
		int start_bid[] = new int[n];
		String category[] = new String[n];
		ConnectingMysql co = new ConnectingMysql();
		Connection c = co.getConnection();
		void getItems() {
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
		void getItemById(int id) {
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
		void getItemByName(String name) {
			try {
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
		void getItemBySellerId(int seller) {
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
		void getItemByStartBid(int bid) {
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
		void getItemByCategory(int cat) {
			try {
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
	class GetResearch{
		int n = 200;
		int id [] = new int[n];
		String original_owner [] = new String[n];
		int age [] = new int [n];
		String find_loc [] = new String [n];
		int item_id [] = new int [n];
		ConnectingMysql co = new ConnectingMysql();
		Connection c = co.getConnection();
		void getResearch() {
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
		void getResearchByOwner(String owner) {
			try {
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
		void getResearchByAge(int age1) {
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
		void getResearchByLoc(String loc) {
			try {
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
		void getResearchByItemId(int itemid) {
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
	class GetSeller{
		int n =200;
		int seller_id[] = new int[n];
		String email[] = new String[n];
		String fname[] = new String[n];
		String lname[]= new String[n];
		String contact_no[]= new String[n];
		ConnectingMysql co = new ConnectingMysql();
		Connection c = co.getConnection();
		void getSeller() {
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
		void getSellerByID(int id) {
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
		void getSellerByEmail(String email_id) {
			try {
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
		void getSellerByContact(String contact) {
			try {
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
		void getSellerByFName(String name) {
			try {
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
		void getSellerByLName(String name) {
			try {
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
	class GetBidder{
		int n =200;
		int bidder_id[] = new int[n];
		String email[] = new String[n];
		String fname[] = new String[n];
		String lname[]= new String[n];
		String contact_no[]= new String[n];
		String address[] = new String[n];
		ConnectingMysql co = new ConnectingMysql();
		Connection c = co.getConnection();
		void getBidder() {
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
		void getBidderByID(int id) {
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
		void getBidderByEmail(String email_id) {
			try {
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
		void getBidderByContact(String contact) {
			try {
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
		void getSellerByFName(String name) {
			try {
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
		void getBidderByLName(String name) {
			try {
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
	class Admin{
		int n = 200;
		int admin_id []  = new int[n];
		String fname[] = new String[n];
		String lname[] = new String[n];
		String email[] = new String[n];
		ConnectingMysql co = new ConnectingMysql();
		Connection c = co.getConnection();
		void getAdmins() {
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
		void getAdminsById(int id) {
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
		void getAdminsByFName(String name) {
			try {
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
		void getAdminsByLName(String name) {
			try {
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
		void getAdminsByEmail(String email) {
			try {
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
	class GetBidHistory{
		int n = 200;
		int bid []  = new int[n];
		int bid_id []  = new int[n];
		int bidder_id []  = new int[n];
		int item_id []  = new int[n];
		ConnectingMysql co = new ConnectingMysql();
		Connection c = co.getConnection();
		void getBids() {
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
		void getBidsByBidder(int bidder) {
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
		void getBidsByItem(int item) {
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
 