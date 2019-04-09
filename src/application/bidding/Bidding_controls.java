package application.bidding;

import java.awt.event.ActionEvent;
import java.io.IOException;

import application.Main;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class Bidding_controls  {
	 @FXML
	    private Label biditemcolumn;

	    @FXML
	    private Label bidimagecolumn;

	    @FXML
	    private Label bidchoicecolumn;

	    @FXML
	    void goHome(ActionEvent event) throws IOException {
//TODO : Add the even handling here bro
	    	Main.showMainItems();
	    }

		  
	
	}

