package application.signup;

import java.awt.TextField;
import java.io.IOException;
import java.util.Calendar;

import application.LoginAuction;
import application.Main;
import application.SignUp;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;

public class SignupController {
	public int age;
	//This was created from the main options like to push into the data and take them out 
	// Seen(by avinash);
	 @FXML
	    private Button signupbtn;

	    @FXML
	    private TextField FnameField;

	    @FXML
	    private TextField PhoneField;

	    @FXML
	    private TextField EmailId;

	    @FXML
	    private TextField Addressfield;
	    

	    @FXML
	    private TextField userfield;

	    @FXML
	    private TextField passonefield;

	    @FXML
	    private TextField passtwofield;

	    @FXML
	    private TextField LnameField;

	    @FXML
	    public DatePicker DateOfBirth;

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
//String Fname, String Lname, String username, String password,
//String password2, String address,String mobile, String DoB, int userType
		 //  String Fname = FnameField.getText();
		  // String Lname = LnameField.getText();
		   //String username = userfield.getText();
		   //String password = passonefield.getText();
		   //String password2 = passtwofield.getText();
		   //String address = Addressfield.getText();
		   //String mobile = PhoneField.getText();
		  // Double DoB = DateOfBirth.getText();
		   //SignUp ca = new SignUp();
		   
		   
	   }
	

}
