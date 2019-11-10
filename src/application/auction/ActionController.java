package application.auction;

import java.io.IOException;
import java.net.URL;
import java.sql.*;
import java.time.temporal.TemporalField;
import java.util.ResourceBundle;

import application.ConnectingMysql;
import application.Main;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Labeled;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TextField;

public class ActionController{

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
    private Button refreshid;
    
    public static String itemName;
    public static String bid;
    
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
    	int amt = Integer.parseInt(ammountid.getText());
    	if(amt > Integer.parseInt(columnhbid.getText())) {
    		columnhbid.setText(""+amt);
    		int prevamt = Integer.parseInt(columnhbid.getText());
    		ConnectingMysql co = new ConnectingMysql();
    		Connection c = co.getConnection();
    		try {
    			Statement st = c.createStatement();
    			st.execute("UPDATE items SET start_bid ="+amt+"WHERE start_bid ="+prevamt);
    			columnhbid.setText(""+amt);
    		}catch(Exception e) {
    			e.printStackTrace();
    		}
    	}
    	else {
    		System.out.println("The entered amount is lesser than current highest bid. Please enter a higher bid.");
    	}
    }
    @FXML
    void gopay() throws IOException {
    	   	Main.Showfinal();
    		    }
    
    @FXML 
    private void refresh1() {
    	columnhbid.setText(bid);
    	columnItemname.setText(itemName);
    	
    	
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



