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
	 * @param columncategory the columncategory to set
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
