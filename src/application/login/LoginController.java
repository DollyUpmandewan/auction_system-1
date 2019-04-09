package application.login;

import java.io.IOException;

import application.Main;
import javafx.fxml.FXML;

//TODO add the Fields here just as the ones in the ones in the sign up page.
//TODO Handle events using the event handlers here. 
public class LoginController {

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
