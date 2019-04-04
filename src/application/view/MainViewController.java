package application.view;

import java.io.IOException;

import application.Main;
import javafx.fxml.FXML;

public class MainViewController {
   @FXML
   private void goHome() throws IOException 
   {
	   Main.showMainItems();
   }
}
	