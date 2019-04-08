package application.items;

import java.io.IOException;

import application.Main;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

public class Items_controll {
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
}
