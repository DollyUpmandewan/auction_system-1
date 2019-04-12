package application.auction;

import java.io.IOException;
import java.time.temporal.TemporalField;

import application.Main;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Labeled;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TextField;

public class ActionController {

	@FXML
    private Button CAncelBidId;

    @FXML
    private Button LoadBidId;

    @FXML
    private TextField ammountid;

    @FXML
    private Label columnItemname;

    @FXML
    private Label columnhbid;
    
    @FXML
    private Label refreshid;
    
    @FXML
    private void goHome() throws IOException 
    {
    	   Main.showMainItems();
    }
    		
    @FXML
    private void gobidding() throws IOException 
    {
    	   Main.showBiddersScene();
    }
    
    @FXML
    private void addvalue1() {
    	
    	
    	//String Fname = FnameField.getText();
    	//int BidAmmount = ((Labeled) BidAmmountId).getText();
    	//TODO : ADD A METHOD THAT WILL PUSH THE BID VALUE TO THE BACKEND DATABSE AND WILL SHOW THE HIGHEST BID IN THE LABEL 
    	//set text the columnItemname and columnhbid from databse.
    	
    }
    @FXML
    void gopay() throws IOException {
    	//TODO : Add the even handling here bro
    		    	Main.Showfinal();
    		    }
    
    @FXML 
    private void refresh1() {
    	//TODO : JUST THE CURRENT HIGHEST BID AMMOUNT OF THE SAME ITEM.
    	//setText
    	
    	
    }
    @FXML
    private void addvalue2() {
    	
    	
    	//String Fname = FnameField.getText();
    	//int BidAmmount = ((Labeled) BidAmmountId).getText();
    	//TODO : ADD A METHOD THAT WILL PUSH THE BID VALUE TO THE BACKEND DATABSE AND WILL SHOW THE HIGHEST BID IN THE LABEL 
    	//set text the columnItemname and columnhbid from databse.
    	
    }
    
    @FXML 
    private void refresh2() {
    	//TODO : JUST THE CURRENT HIGHEST BID AMMOUNT OF THE SAME ITEM.
    	//setText
    	
    	
    }
    @FXML  
   private void addvalue3() {
    	
    	
    	//String Fname = FnameField.getText();
    	//int BidAmmount = ((Labeled) BidAmmountId).getText();
    	//TODO : ADD A METHOD THAT WILL PUSH THE BID VALUE TO THE BACKEND DATABSE AND WILL SHOW THE HIGHEST BID IN THE LABEL 
    	//set text the columnItemname and columnhbid from databse.
    	
    }
  
  @FXML 
  private void refresh3() {
  	//TODO : JUST THE CURRENT HIGHEST BID AMMOUNT OF THE SAME ITEM.
  	//setText
  	
  	
  }
 
}



