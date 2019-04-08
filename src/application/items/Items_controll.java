package application.items;

import java.io.IOException;

import application.Main;
import javafx.fxml.FXML;

public class Items_controll {
	@FXML
	private void goHome() throws IOException {
		Main.showMainItems();
	}
}
