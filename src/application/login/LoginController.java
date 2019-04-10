package application.login;

import java.io.IOException;

import application.LoginAuction;
import application.Main;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.TextField;
 
public class LoginController {

    @FXML
    private TextField loginId;

    @FXML
    private TextField loginpass;

    @FXML
    private Button loginsubmit;

    @FXML
    private Hyperlink Signupbtn;

	@FXML
	   private void gotoSignup() throws IOException 
	   {
		   Main.ShowAddStage();
	   }
	 @FXML
	   private void goHome() throws IOException 
	   {
		 	String logID = loginId.getText();
		 	String logPass = loginpass.getText();
		 	LoginAuction la = new LoginAuction();
		 	if(la.LoginCheck(logID,logPass))
		 		Main.showMainItems();
		   
	   }
	
	 
}
