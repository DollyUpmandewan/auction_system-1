package application.items;

import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.sql.*;

import application.GetDataFromDB;
import javafx.fxml.FXML;



public class ItemList extends GetDataFromDB{
	

	public Connection c = null;
	public Statement st = null;
	public ResultSet rs = null;
		

	/*public String columnItemname;
	public String columnStartingbid;
	public String columnItemId;
	public String columncategory;
	public String columnSellernname;*/
	
	private TextField txt_item_name;
	private TextField txt_Startingbid;
	private TextField txt_ItemId;
	private TextField txt_category;
	private TextField txt_Sellername;

	//TODO Make changes according to the implementation of the class GetDataFromDB
	private String columnItemname;
	public String columnStartingbid; // This is an item
	private String columnItemId;  // Should be and integer value.
	private String columncategory; 
	private String columnSellernname;  // columnSellerID and columnStartingbid should be an int. Since this needs to be changed
									   // at multiple places throughout the files and controllers, I didn't change it here.

	
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

