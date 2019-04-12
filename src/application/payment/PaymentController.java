package application.payment;

import java.io.IOException;

import application.Main;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class PaymentController {
	 @FXML
	    private TextField paymentnameid;

	    @FXML
	    private TextField postaladdid;

	    @FXML
	    private TextField cnopayid;

	    @FXML
	    private TextField paymodeid;

	    @FXML
	    private Button paysubmitId;

	    @FXML
	    private Button payhomeid;

	 @FXML
	    void goHome() throws IOException {
		 Main.showMainItems();
	    }
	@FXML
	 public void gofinal() throws IOException {
		 Main.Showfinal();
	}
	
	@FXML 
	public void goback() throws IOException {
		Main.showBiddersScene();
	}
	 
}
