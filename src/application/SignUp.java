package application;
import java.sql.*;
import java.util.*;

import application.signup.SignupController;

public class SignUp {
	
	public void CreateAccount(String Fname, String Lname, String username, String password,
			String password2, String address,String mobile, String DoB, int userType) {
		//Creates an account of the user by creating a tuple in the login table of the database.
		// Takes the Input as FirstName,LastName,UserName,Password,Address; 
		// Takes and integer value describing the user type
		// Only three values are allowed. - 
		//									1 - Administrator
		// 									2 - Seller/Bidder or Basically "USER"
		//									
		ConnectingMysql co = new ConnectingMysql(); 
		Connection c = co.getConnection();
		if(repeatPasswordCheck(password,password2)) {
			try {
				Statement st = c.createStatement();
				SignupController suc = new SignupController();
				int age = suc.age;
				if(userType == 1 && age >= 18) {
					st.execute("insert into login values("+Fname+","+Lname+","+username+","+password+","+address+","+mobile+","+DoB+",admin)");
					// Inserting into a database.
				}
				else if(userType == 2 && age >= 18) {
					st.execute("insert into login values("+Fname+","+Lname+","+username+","+password+","+address+","+mobile+","+DoB+",user)");
				}
				else
				{
					System.out.println("Select User type either 1 or 2. \n The User age must be greater than or equal to 18.");
				}
			}catch(SQLException e) {
				e.printStackTrace();
			}
		}
	}
	public boolean repeatPasswordCheck(String password1,String password2) {
		
		return password1.equals(password2);
		
	}
}
