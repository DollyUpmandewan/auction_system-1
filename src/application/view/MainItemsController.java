package application.view;

import java.io.IOException;
import javafx.scene.control.Button;

import application.Main;
import javafx.fxml.FXML;

public class MainItemsController {
	
	 @FXML
	    private Button ItemlistId;

	    @FXML
	    private Button BiddingListId;

	    @FXML
	    private Button SellingListId;

	    @FXML
	    private Button ShippingListId;
       
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
	
		Main.showitemsScene();
	 	
	}
	
	
}
