package application;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class Main extends Application {
	private Stage primaryStage;
	public static BorderPane mainLayout;
	
	@Override
	public void start(Stage primaryStage) throws IOException {
		this.primaryStage= primaryStage;
		this.primaryStage.setTitle("Auction System App");
		showMainView();
		showMainItems();
		
	   }
   /** 
 * @throws IOException 
 * 
 */
public void showMainView() throws IOException {
	   FXMLLoader loader = new FXMLLoader();
	   loader.setLocation(Main.class.getResource("view/MainView.fxml"));
	   mainLayout = loader.load();
	   Scene scene = new Scene(mainLayout);
	   primaryStage.setScene(scene);
	   primaryStage.show();   
   }

public static void showMainItems() throws IOException {
	FXMLLoader loader = new FXMLLoader();
	loader.setLocation(Main.class.getResource("view/MainItems.fxml"));
	BorderPane mainItems = loader.load();
	mainLayout.setCenter(mainItems);
	
}

public static void showBiddersScene() throws IOException {
	FXMLLoader loader = new FXMLLoader();
	loader.setLocation(Main.class.getResource("bidding/Biddingpart.fxml"));
	BorderPane Biddingpart = loader.load();
	mainLayout.setCenter(Biddingpart);
    
}

public static void showSellerScene() throws IOException {
	FXMLLoader loader = new FXMLLoader();
	loader.setLocation(Main.class.getResource("selling/Sellingpart.fxml"));
	BorderPane Sellingpart = loader.load();
	mainLayout.setCenter(Sellingpart);
    
}



	public static void main(String[] args) {
		launch(args);
	}
}
