package application.items;

import java.awt.event.ActionEvent;
import java.sql.*;

import application.GetDataFromDB;
import javafx.fxml.FXML;



public class ItemList extends GetDataFromDB{
	
	//TODO Make changes according to the implementation of the class GetDataFromDB
	private String columnItemname;
	public String columnStartingbid; // This is an item
	private String columnItemId;  // Should be and integer value.
	private String columncategory; 
	private String columnSellernname;  // columnSellerID and should be an int. Since this needs to be changed
									   // at multiple places throughout the files and controllers, I didn't change it here.
	
	@FXML
	public void  handleAddItems(ActionEvent event) {
		GetDataFromDB.GetItems gi = new GetDataFromDB.GetItems();
		gi.getItems();
		/* 
		 * Sample Implementation is
		 * 
		 * 
		 * int columnItemId = gi.item_id[0];
		 * String columnItemname = gi.item_name[0];
		 * int sellerID = gi.seller_id[0];
		 * int columnStartingbid = gi.start_bid[0];
		 * String columncategory = gi.category[0]; // All of the tuples in the tables are stored in these arrays
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
