package application.bidding;

import java.io.IOException;
import application.Main;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class Bidding_controls  {
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
		  
	
	}

