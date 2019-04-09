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
	public void gotosellingpart() throws IOException {
		
		Main.showSellerScene();
		 	
	}


	@FXML
	public void gotoitemspart() throws IOException {
	
		Main.showitemsScence();
	 	
	}
	
	
}
