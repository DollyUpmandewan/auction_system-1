package Auction;

import java.io.IOException;
import java.time.temporal.TemporalField;

import application.Main;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;

public class ActionController {

    @FXML
    private Button CAncelBidId;

    @FXML
    private Button LoadBidId;

    @FXML
    private TemporalField BidAmmountId;

    @FXML
    private TableColumn<?, ?> columnItemname;

    @FXML
    private TableColumn<?, ?> columnhbid;
    
    @FXML
    private void goHome() throws IOException 
    {
    	   Main.showMainItems();
    }
}



