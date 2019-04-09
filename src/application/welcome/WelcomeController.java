package application.welcome;

import java.io.IOException;

import application.Main;
import javafx.fxml.FXML;

public class WelcomeController {
	@FXML
	   public void showLoginPage() throws IOException 
	   {
		   Main.showMainItems();
	   }

}
