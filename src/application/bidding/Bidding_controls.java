package application.bidding;

import java.io.IOException;

import application.Main;
import javafx.fxml.FXML;

public class Bidding_controls {
	public class biddingviewcontrller{
		   @FXML
		   private void goHome() throws IOException 
		   {
			   Main.showMainItems();
		   }
	}
}
