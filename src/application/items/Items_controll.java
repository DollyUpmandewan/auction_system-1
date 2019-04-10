package application.items;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import application.ConnectingMysql;
import application.GetDataFromDB;
import application.Main;
import javafx.fxml.FXML;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.text.Text;

public class Items_controll extends GetDataFromDB{
	int i=0,j=1,k=2;
		
    @FXML
    private TextField Itemname;

    @FXML
    private TextField StartingBid;

    @FXML
    private TextField ItCategoer;

    @FXML
    private TextField itemidbid;

    @FXML
    private TextField itSellerid;

    @FXML
    private Button ItAddvalue;

    @FXML
    private Label row11;

    @FXML
    private Label row12;

    @FXML
    private Label row13;

    @FXML
    private Label row14;

    @FXML
    private Label row15;

    @FXML
    private Label row21;

    @FXML
    private Label row22;

    @FXML
    private Label row23;

    @FXML
    private Label row24;

    @FXML
    private Label row25;

    @FXML
    private Label row31;

    @FXML
    private Label row32;

    @FXML
    private Label row33;

    @FXML
    private Label row34;

    @FXML
    private Label row35;

    @FXML
    private Text itnamecol;

    @FXML
    private Text startidcol;

    @FXML
    private Text ItemIdcol;

    @FXML
    private Text ItCategoercol;

    @FXML
    private Text itSelleridcol;;
	
	@FXML
	public void  handleAddItems() {
		ConnectingMysql co = new ConnectingMysql();
		Connection c = co.getConnection();
		try {
			Statement st = c.createStatement();
st.execute("insert into items values("+itemidbid.getText()+","+Itemname.getText()+","+itSellerid.getText()+","+StartingBid.getText()+","+ItCategoer+")");
		c.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
			GetDataFromDB.GetItems gi = new GetDataFromDB.GetItems();
			gi.getItems();
			i+=2;
			j+=2;
			k+=2;
			row11.setText(gi.item_name[i]);
			row12.setText(""+gi.start_bid[i]);
			row13.setText(""+gi.item_id[i]);
			row14.setText(gi.category[i]);
			row15.setText(""+gi.seller_id[i]);
			row21.setText(gi.item_name[j]);
			row22.setText(""+gi.start_bid[j]);
			row23.setText(""+gi.item_id[j]);
			row24.setText(gi.category[j]);
			row25.setText(""+gi.seller_id[j]);
			row31.setText(gi.item_name[k]);
			row32.setText(""+gi.start_bid[k]);
			row33.setText(""+gi.item_id[k]);
			row34.setText(gi.category[k]);
			row35.setText(""+gi.seller_id[k]);
			
		}
	@FXML
	private void goHome() throws IOException {
		Main.showMainItems();
	}

}
