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
			sc.close();
			login();
		}
		if(choice == 2) {
			sc.close();
			signup();
		}
		else {
			print("Invalid Input");
			sc.close();
			start();
		}
	}
	void signup() {
		print("Enter UserName");
		
		
	}
	void login() {
		// TODO Auto-generated method stub
		
	}
}
