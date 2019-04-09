package application.items;

import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import application.GetDataFromDB;
import javafx.fxml.FXML;



public class ItemList extends GetDataFromDB{
	
	public Connection c = null;
	public Statement st = null;
	public ResultSet rs = null;
		

	public String columnItemname;
	public String columnStartingbid;
	public String columnItemId;
	public String columncategory;
	public String columnSellernname;
	
	private TextField txt_item_name;
	private TextField txt_Startingbid;
	private TextField txt_ItemId;
	private TextField txt_category;
	private TextField txt_Sellername;
	
	@FXML
	public void  handleAddItems(ActionEvent event) {
<<<<<<< HEAD
		String sql = "Insert into items(item_name,Startingbid,ItemId,category,Sellername) Values(?,?,?,?,?)";
		
		String itname = txt_item_name.getText();
		
		double Sbingbid = Double.valueOf(txt_Startingbid.getText());
		
		String ItId = txt_ItemId.getText();
		
		String category = txt_category.getText();
		
		String Sname = txt_Sellername.getText();
		
		try {
			st = c.prepareStatement(sql);	
			st.setString(1,itname);
			st.setString(2,Sbingbid);
			st.setString(3,ItId);
			st.setString(4,category);
			st.setString(5,Sname);
			
		}
		
=======
		GetDataFromDB.GetItems gi = new GetDataFromDB.GetItems();
		gi.getItems();
		/* 
		 * Sample Implementation is
		 * 
		 * 
		 * int itemID = gi.item_id[0];
		 * String itemName = gi.item_name[0];
		 * int sellerID = gi.seller_id[0];
		 * int startBid = gi.start_bid[0];
		 * String cat = gi.category[0]; // All of the tuples in the tables are stored in these arrays
		 * 								// The first tuple will be found in 0th index of each array.
		 * 
		 * 
		 * 				// e.g. suppose the first tuple in the table is like (1001,Knife,1254,50000,weapons)
		 * 				// then it will be stored as 
		 * 				//							 gi.item_id[0] = 1001;
		 * 				// 							 gi.item_name[0] = "Knife";
		 * 				//							 gi.seller_id[0] = 1254;
		 * 				//							 gi.start_bid[0] = 50000;
		 * 				//							 gi.category[0] = "weapons";
		 */
>>>>>>> 3bc4c2c882ee20e21be35bf799372b11446f7378
	}
	

	public ItemList(String columnItemname, String columnStartingbid, String columnItemId, String columncategory,
			String columnSellernname) {
		super();
		this.setColumnItemname(columnItemname);
		this.columnStartingbid = columnStartingbid;
		this.setColumnItemId(columnItemId);
		this.setColumncategory(columncategory);
		this.setColumnSellernname(columnSellernname);
	}

	public String getColumnItemname() {
		return columnItemname;
	}

	public void setColumnItemname(String columnItemname) {
		this.columnItemname = columnItemname;
	}

	/**
	 * @return the columnItemId
	 */
	public String getColumnItemId() {
		return columnItemId;
	}

	/**
	 * @param columnItemId the columnItemId to set
	 */
	public void setColumnItemId(String columnItemId) {
		this.columnItemId = columnItemId;
	}

	/**
	 * @return the columncategory
	 */
	public String getColumncategory() {
		return columncategory;
	}

	/**
	 * @param columncategory the column category to set
	 */
	public void setColumncategory(String columncategory) {
		this.columncategory = columncategory;
	}

	/**
	 * @return the columnSellernname
	 */
	public String getColumnSellernname() {
		return columnSellernname;
	}

	/**
	 * @param columnSellernname the columnSellernname to set
	 */
	public void setColumnSellernname(String columnSellernname) {
		this.columnSellernname = columnSellernname;
	}
}
