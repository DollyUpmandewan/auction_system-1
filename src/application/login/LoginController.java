package application.login;

import java.io.IOException;

import application.Main;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.TextField;

//TODO add the Fields here just as the ones in the ones in the sign up page.
//TODO Handle events using the event handlers here. 
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
		   Main.showMainItems();
	   }
	
	 
}
