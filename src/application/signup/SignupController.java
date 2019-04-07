package application.signup;

import java.io.IOException;

import application.Main;
import javafx.fxml.FXML;

public class SignupController {
	
	@FXML
	   private void goHome() throws IOException 
	   {
		   Main.showMainItems();
	   }
	
	@FXML
	   private void gologinpage() throws IOException 
	   {
		   Main.showLoginPage();
	   }
	

}
