package application.items;

import java.awt.event.ActionEvent;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import application.GetDataFromDB;
import application.Main;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

public class Items_controll extends GetDataFromDB{
	int i=0,j=1,k=2;
		
	@FXML
	public Label row11;
	
	@FXML
	public Label row12;
	@FXML
	public Label row13;
	@FXML
	public Label row14;
	@FXML
	public Label row15;
	@FXML
	public Label row21;
	@FXML
	public Label row22;
	@FXML
	public Label row23;
	@FXML
	public Label row24;
	@FXML
	public Label row25;
	@FXML
	public Label row31;
	@FXML
	public Label row32;
	@FXML
	public Label row33;
	@FXML
	public Label row34;
	@FXML
	public Label row35;
	
	@FXML
	public void  handleAddItems(ActionEvent event) {
			GetDataFromDB.GetItems gi = new GetDataFromDB.GetItems();
			gi.getItems();
			i+=2;
			j+=2;
			k+=2;
			row11.setText(gi.item_name[i]);
			row12.setText(""+gi.start_bid[i]);
			row13.setText(""+gi.item_id[i]);
			row14.setText(gi.category[i]);
			row15.setText(""+gi.seller_id[i]);
			row21.setText(gi.item_name[j]);
			row22.setText(""+gi.start_bid[j]);
			row23.setText(""+gi.item_id[j]);
			row24.setText(gi.category[j]);
			row25.setText(""+gi.seller_id[j]);
			row31.setText(gi.item_name[k]);
			row32.setText(""+gi.start_bid[k]);
			row33.setText(""+gi.item_id[k]);
			row34.setText(gi.category[k]);
			row35.setText(""+gi.seller_id[k]);
			
		}
	@FXML
	private void goHome() throws IOException {
		Main.showMainItems();
	}

}
