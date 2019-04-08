package application.view;

import java.io.IOException;

import application.Main;
import javafx.fxml.FXML;

public class MainItemsController {

	@FXML
	private void gotobiddingpart() throws IOException {
		
		Main.showBiddersScene();
		 	
	}
	
	@FXML
	private void gotosellingpart() throws IOException {
		
		Main.showSellerScene();
		 	
	}


	@FXML
	private void gotoitemspart() throws IOException {
	
		Main.showitemsScence();
	 	
	}
}
