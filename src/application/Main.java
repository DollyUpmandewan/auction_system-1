package application;


import java.io.IOException;

//import com.sun.scenario.effect.impl.prism.PrImage;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class Main extends Application {
	public static Stage primaryStage;
	public static BorderPane mainLayout;
	
	@Override
	public void start(Stage primaryStage) throws IOException {
		Main.primaryStage= primaryStage;
		Main.primaryStage.setTitle("Auction System App");
		showMainView();
		showWelcome();
		
	   }
	
   public static void showWelcome() throws IOException {
		// TODO Auto-generated method stub
		FXMLLoader loader = new FXMLLoader();
		loader.setLocation(Main.class.getResource("welcome/Welcomepart.fxml"));
		BorderPane wel = loader.load();
		mainLayout.setCenter(wel);
	}
/** 
 * @throws IOException 
 * 
 */
public void showMainView() throws IOException {
	   FXMLLoader loader = new FXMLLoader();
	   loader.setLocation(Main.class.getResource("view/MainView.fxml"));
	   mainLayout = loader.load();
	   Scene scene = new Scene(mainLayout,800,600);
	   primaryStage.setScene(scene);
	   primaryStage.show();   
   }

public static void showMainItems() throws IOException {
	FXMLLoader loader = new FXMLLoader();
	loader.setLocation(Main.class.getResource("view/MainItems.fxml"));
	BorderPane mainItems = loader.load();
	mainLayout.setCenter(mainItems);
	
}

public static void showAuction1() throws IOException {
	FXMLLoader loader = new FXMLLoader();
	loader.setLocation(Main.class.getResource("auction/Auctionpage.fxml"));
	BorderPane auctionpage = loader.load();
	mainLayout.setCenter(auctionpage);
	
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

public static void showitemsScene() throws IOException {
	// TODO Auto-generated method stub
	FXMLLoader loader = new FXMLLoader();
	System.out.println("entering itemspart");
	loader.setLocation(Main.class.getResource("items/Itemspart.fxml"));
	BorderPane itemspart = loader.load();
	mainLayout.setCenter(itemspart);
	
}

    public static void main(String[] args) {
    	//CommandLineDemo cld = new CommandLineDemo();
    	//cld.start();
    	System.out.println("hello");
		launch(args);
	}
	
    
	
	
	public static void showSignUpPage() throws IOException {
		// TODO Auto-generated method stub
		FXMLLoader loader = new FXMLLoader();
		loader.setLocation(Main.class.getResource("signup/JAva auc1.fxml"));
		BorderPane signupauc = loader.load();
		mainLayout.setCenter(signupauc);
		
	}
	
	public static void showLoginPage() throws IOException {
		// TODO Auto-generated method stub
		FXMLLoader loader = new FXMLLoader();
		loader.setLocation(Main.class.getResource("login/Java auc2.fxml"));
		BorderPane signupauc = loader.load();
		mainLayout.setCenter(signupauc); 
		
	}
	
	public static void ShowAddStage() throws IOException {
		// TODO Auto-generated method stub
		FXMLLoader loader = new FXMLLoader();
		loader.setLocation(Main.class.getResource("signup/Signuppage.fxml"));
		BorderPane signuppage = loader.load();
		
		Stage AddDialogStage  = new Stage();
		AddDialogStage.setTitle("SIGN UP TO THE PAGES");
		AddDialogStage.initModality(Modality.WINDOW_MODAL);
		AddDialogStage.initOwner(primaryStage);
		Scene scene = new Scene(signuppage);
		AddDialogStage.setScene(scene);
		AddDialogStage.showAndWait(); 
		
	}
	public static void showAuction2() throws IOException {
		// TODO Auto-generated method stub
		FXMLLoader loader = new FXMLLoader();
		loader.setLocation(Main.class.getResource("auction/Auctionpage2.fxml"));
		BorderPane auctionpage = loader.load();
		mainLayout.setCenter(auctionpage);
	}
	
	public static void showAuction3() throws IOException {
		// TODO Auto-generated method stub
		FXMLLoader loader = new FXMLLoader();
		loader.setLocation(Main.class.getResource("auction/Auctionpage3.fxml"));
		BorderPane auctionpage = loader.load();
		mainLayout.setCenter(auctionpage);
	}
	public static void Showfinal() throws IOException {
		// TODO Auto-generated method stub
				FXMLLoader loader = new FXMLLoader();
				loader.setLocation(Main.class.getResource("payment/Finalpage.fxml"));
				BorderPane auctionpage = loader.load();
				mainLayout.setCenter(auctionpage);
	}
	
}
