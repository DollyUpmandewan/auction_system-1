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
//TODO : Add the even handling here bro
	    	Main.showMainItems();
	    }
	    
	    @FXML
	    void goAuction() throws IOException {

	    	Main.showAuction();
	    }
	    
		  
	
	}

