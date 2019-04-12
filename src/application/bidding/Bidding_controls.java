package application.bidding;

import java.io.IOException;

import application.GetDataFromDB;
import application.GetDataFromDB.*;
import application.Main;
import application.auction.ActionController;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class Bidding_controls  {
	
	int i=0, j=1,k=2;
	@FXML
    private Label bid11;

    @FXML
    private Label bid21;

    @FXML
    private Label bid31;

    @FXML
    private Label bid12;

    @FXML
    private Label bid22;

    @FXML
    private Label bid32;

    @FXML
    private Button gobidbtn1;

    @FXML
    private Button gobidbtn2;

    @FXML
    private Button gobidbtn3;
	 @FXML
	    private Label biditemcolumn;

	    @FXML
	    private Label bidimagecolumn;

	    @FXML
	    private Label bidchoicecolumn;

	    @FXML
	    void goHome() throws IOException {
	    	Main.showMainItems();
	    }
	    
	    @FXML
	    void goAuction1() throws IOException {
	    	Main.showAuction1();
	    }
	    
	    @FXML
	    void goAuction2() throws IOException {

	    	Main.showAuction2();
	    }
	    @FXML
	    void goAuction3() throws IOException {

	    	Main.showAuction3();
	    }
		  
	    @FXML
	    void handleRefresh() {
	    	try {
	    		GetDataFromDB getData = new GetDataFromDB();
				GetItems gi = getData.new GetItems();
				gi.getItems();
				i+=3;
				j+=3;
				k+=3;
				bid11.setText(gi.item_name[i]);
				bid12.setText(""+gi.start_bid[i]);
				
				bid21.setText(gi.item_name[j]);
				bid22.setText(""+gi.start_bid[j]);
				
				bid31.setText(gi.item_name[k]);
				bid32.setText(""+gi.start_bid[k]);
				}catch(Exception e) {e.printStackTrace();}
	    }
	}

