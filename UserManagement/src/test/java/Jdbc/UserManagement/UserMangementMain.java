package Jdbc.UserManagement;

import java.util.*;

public class UserMangementMain {

	public static void main(String[] args) throws Exception {
		int mainChoice = AdminandUser.MainDisplay();
		System.out.println(mainChoice);
		switch(mainChoice) {		
		case 1:             
			int adminChoice = Admin.Admindisplay();
			switch(adminChoice) {
			case 1: 
				Admin.Adminsignup();
				break;
			case  2:
				Admin.Adminsignin();
				break;
			case 3:
				AdminandUser.MainDisplay();
				break;
			default:
				System.out.println("Please enter the valid choice");
				Admin.Admindisplay();
				break;
			}
		break;
		case  2:			
			int userChoice = User.Userdisplay();
			switch(userChoice) {
			case 1: 
				User.Usersignup();
				break;
			case  2:
				User.Usersignin();
				break;
			case 3:
				AdminandUser.MainDisplay();
				break;
			default:
				System.out.println("Please enter the valid choice");
			    User.Userdisplay();
			    break;			    
			}
		break;
		case 3:
			System.out.println("Thank you !!!");
			System.exit(0);
		break;
		default:
			System.out.println("Please enter the valid choice");
			AdminandUser.MainDisplay();
		break;
		}
	}

}
