package application.login;

import java.io.IOException;

import application.Main;
import javafx.fxml.FXML;

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
