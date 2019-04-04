package application.view;

import java.io.IOException;

import application.Main;
import javafx.fxml.FXML;

public class MainItemsController {
	private Main main;
	@FXML
	private void gotobiddingpart() throws IOException {
		
		Main.showBiddersScene();
		 	
	}
	@FXML
	private void gotosellingpart() throws IOException {
		
		Main.showSellerScene();
		 	
	}
	public Main getMain() {
		return main;
	}
	public void setMain(Main main) {
		this.main = main;
	}


}
