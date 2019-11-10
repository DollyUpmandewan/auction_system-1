package application;
import java.sql.*;
import java.util.*;
public class CommandLineDemo {
	static void print(String msg) {
		System.out.println(msg);
	}
	void start(){
		print("-----------Welcome to the Auction System----------");
		print("To Login Press 1\n To create new Account press 2");
		Scanner sc = new Scanner(System.in);
		int choice = sc.nextInt();
		if(choice == 1) {
			
			login();
		}
		if(choice == 2) {
			
			signup();
		}
		else {
			print("Invalid Input");
			
			start();
		}
	}
	void signup() {
		print("Enter UserName");
		
		
	}
	void login() {
		try {
		LoginAuction la = new LoginAuction();
		print("Enter ID");
		Scanner sc = new Scanner(System.in);
		String userID = sc.nextLine();
		print("Enter Password");
		String password = sc.nextLine();
		
		if(la.LoginCheck(userID, password))
			print("LoginSuccessful");
		else
			print("Wrong credentials/Credentials not found");
			login();
		}catch(Exception e) {e.printStackTrace();}
	}
}
