package application.items;

import java.awt.event.ActionEvent;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import application.GetDataFromDB;
import application.Main;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

public class Items_controll extends GetDataFromDB implements Initializable{
	@FXML
	public void  handleAddItems(ActionEvent event) {

		/*	String sql = "Insert into items(item_name,Startingbid,ItemId,category,Sellername) Values(?,?,?,?,?)";
			
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
			*/

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
			 *
	*/
		}
		
	@FXML
	public TableView<?> tableproduct;
	
	@FXML
	public TableView<?> columnItemname;
	
	
	@FXML
	public TableColumn<?,?> columnStartingbid;
	
	
	@FXML
	public TableColumn<?,?> columnItemId;
	
	
	@FXML
	public TableColumn<?,?> columncategory;
	
	@FXML
	public TableColumn<?,?> columnSellernname;
	
	
	
	@FXML
	private void goHome() throws IOException {
		Main.showMainItems();
	}


  public void initialize(URL url,ResourceBundle rb)
   {
	
   }
}
