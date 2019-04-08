package application.signup;

import java.awt.TextField;
import java.io.IOException;
import java.util.Calendar;

import application.Main;
import javafx.fxml.FXML;
import javafx.scene.control.DatePicker;

public class SignupController {
	public int age;
	//This was created fro the main options like to push into the data and take them out 
	@FXML
	private TextField nameField;
	
	@FXML
	private TextField PhoneField;
	
	@FXML
	private TextField EmailId;
	
	@FXML
	private TextField Address;
	
	// This is for the date of birth and the Age of the user
	@FXML
	private DatePicker DateOfBirth;
	
	
	@FXML
	private TextField agefield;
	
	@FXML
	   private void goHome() throws IOException 
	   {
		   Main.showMainItems();
	   }
	@FXML
	public void showAge() {
		Calendar now = Calendar.getInstance();
		int year = now.get(Calendar.YEAR);
		int birthYear = (DateOfBirth.getValue().getYear());
		this.age = year - birthYear;
		agefield.setText(Integer.toString(this.age)+ "Years");
		
		
	}
	@FXML
	   private void gologinpage() throws IOException 
	   {
		   Main.showLoginPage();
	   }
	

}
