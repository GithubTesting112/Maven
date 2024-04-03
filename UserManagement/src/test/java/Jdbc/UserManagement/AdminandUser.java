package Jdbc.UserManagement;


import java.util.Scanner;

public class AdminandUser {
	static Scanner input=new Scanner(System.in);
	public static int MainDisplay() {
		   System.out.println("\t%%      %% %%%%%%% %%      %%%%%%  %%%%%% %%%%  %%%% %%%%%%%");
		   System.out.println("\t%%      %% %%      %%      %%      %%  %% %%  %%% %% %%       ");
		   System.out.println("\t%%  %%  %% %%%%%   %%      %%      %%  %% %%  %%% %% %%%%%      ");
		   System.out.println("\t%%  %%  %% %%      %%      %%      %%  %% %%      %% %%           ");
		   System.out.println("\t%%%%%%%%%% %%%%%%% %%%%%%% %%%%%%% %%%%%% %%      %% %%%%%%%     ");
		System.out.println("\n \n Welcome to Movie Ticket booking");
		System.out.println("Select Your Choice");
		System.out.println("1.Admin");
		System.out.println("2.User");
		System.out.println("Available Movies");
		System.out.println("3.Exit");
		int mainChoice=input.nextInt();		
	    return mainChoice;
	}
}
