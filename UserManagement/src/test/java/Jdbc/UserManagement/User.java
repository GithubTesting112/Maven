package Jdbc.UserManagement;


public class User {
	public static int Userdisplay() {
		System.out.println("User Login");
		System.out.println("Select your choice\n 1.SignUp \n 2.SignIn \n 3.Home");
		int userChoice=AdminandUser.input.nextInt();		
		return userChoice;		
	}
	public static void Usersignup() throws Exception {
		
			boolean admininfoId_b=false,fName_b=false,lName_b=false,address_b=false,gender_b=false,mobile_b=false,
					email_b=false,nationality_b=false,usermanagementId_b=false,userName_b=false,adminpass_b=false,role_b=false;
			
			String admininfoId;
			String usermanagementId;
			String fName,lName,address,gender,emailId,nationality,userName,adminPass,role,type,status;
			String mobile;
			
			while(true) {
				
				try {
					if(fName_b==false) {
						System.out.println("Enter your First Name (Alphabets Only) : ");
						fName=AdminandUser.input.next();
						if(new DataValidation().checkfname(fName)) {
							throw new ExceptionforInput("First Name\nIt's should contain only character...");
						}
						else
						{
							fName_b=true;
						}
						if(lName_b==false)
						{
							System.out.println("Enter your Last Name (All Letter must be small) : ");
							lName=AdminandUser.input.next();
							if(new DataValidation().checklname(lName)) {
								throw new ExceptionforInput("Last Name\nIt's should contain only characters...");
							}
							else
							{
								lName_b=true;
							}
						}
						if(address_b==false)
						{
							System.out.println("Enter your Address (All Letter must be in caps) : ");
							 address=AdminandUser.input.next();
							if(new DataValidation().checklname(lName)) {
								throw new ExceptionforInput("Last Name\nIt's should contain only charcters...");
							}
							else
							{
								address_b=true;
							}
						}
						if(gender_b==false)
						{
							System.out.println("Enter your gender \n1.Male \n2.Female \n3.Other :");
							 gender=AdminandUser.input.next();	
							if((new DataValidation().checkGender(gender))) {
							throw new ExceptionforInput("Gender \nYou choose the Gender from the list only...");
							}
							else
							{
								gender_b=true;
							}
						}
						if(mobile_b==false)
						{
							System.out.println("Enter your Mobile Number :");
							mobile=AdminandUser.input.next();
							if((new DataValidation().checkMobile(mobile))) {
								throw new ExceptionforInput("Mobile Number \nMobile Number should be 10 digits and start with 9, 8, 7,");
							}
							else
							{
								mobile_b=true;
							}
						}
						
						if(adminpass_b==false)
						{
						
							System.out.println("Enter your Password  (Password must be contains 8 characters) : ");
							adminPass=AdminandUser.input.next();
							if((new DataValidation().checkpassword(adminPass))) {
								throw new ExceptionforInput("Password \nPassword must have 8 characters,start with a capital letter,contain at least one number,and at least one special character");
							}
							else
							{
								adminpass_b=true;
							}
						}
						
//						if(role_b==false)
//						{
//							System.out.println("Enter your Role (Admin/User) : ");
//							role=AdminandUser.input.next();
//							if((new DataValidation().checkRole(role))) {
//								throw new ExceptionforInput("Role \nRole : Admin/User");
//							}
//							else
//							{
//								role_b=true;
//							}
//						}
//					if(role.equalsIgnoreCase("admin"))
//					{
//						 type="1";
//						 if(admininfoId_b==false)
//							{
//							System.out.println("Enter the user id like (3001)");
//							admininfoId=AdminandUser.input.next();
//							if((new DataValidation().checkadmin_id(admininfoId))) {
//								throw new ExceptionforInput("Admin Id \nOnly start with 300");
//							}
//							else
//							{
//								admininfoId_b=true;
//							}
//							}
//					}
//					else
//					{
//						type="2";
//						
//						if(admininfoId_b==false)
//						{
//						System.out.println("Enter the user id like (2001)");
//						admininfoId=AdminandUser.input.next();
//						if((new DataValidation().checkuser_id(admininfoId))) {
//							throw new ExceptionforInput("User Id \nOnly start with 200");
//						}
//						else
//						{
//							admininfoId=true;
//						}
//						}
//					}
					
					if(usermanagementId_b==false)
					{
					System.out.println("Enter the user management id like (10001)");
					usermanagementId=AdminandUser.input.next();
					if((new DataValidation().checkmanagement_id(usermanagementId))) {
						throw new ExceptionforInput("userManagementId \nOnly start with 1000");
					}
					else
					{
						usermanagementId_b=true;
					}
					}
					
					} catch (ExceptionforInput mgs) {
						// TODO Auto-generated catch block
						//e.printStackTrace();
						continue;
					}
					break;
		
//		System.out.println("Enter Userinfo id");
//		int admininfoId=AdminandUser.input.nextInt();		
//		System.out.println("Enter First name");
//		String fName=AdminandUser.input.next();
//		System.out.println("Enter last name");
//		String lName=AdminandUser.input.next();
//		System.out.println("Enter Address");
//		String address=AdminandUser.input.next();
//		System.out.println("Enter Gender");
//		String gender=AdminandUser.input.next();			
//		System.out.println("Enter Phone Number");
//		long mobile=AdminandUser.input.nextLong();
//		System.out.println("Enter Your E-mail ID");
//		String emailId=AdminandUser.input.next();	
//		System.out.println("Enter Nationality");
//		String nationality=AdminandUser.input.next();				
//		System.out.println("Enter UserManagementId");
//		int usermanagementId=AdminandUser.input.nextInt();		
//		System.out.println("Enter User Name");
//		String userName=AdminandUser.input.next();
//		System.out.println("Enter Password");
//		String adminPass=AdminandUser.input.next();	
//		System.out.println("Enter Role");
		 role="User";
         type="2";
         status="Active";		
		
		System.out.println("Complete Signup \n 1.Yes \n 2.No");
		String userSignupChoice=AdminandUser.input.next();		
			
		if (userSignupChoice.equals("1"))
		{
			try {
				jdbcInsert.jdbcConnection(admininfoId, fName, lName, address, gender, mobile, emailId, nationality, usermanagementId, userName, adminPass, role, usermanagementId, status);
		    
				}
				catch(Exception e)
				{
					System.out.println(e);
				}
			System.out.println("SignUp Completed");
			ManagementMain.main(null);
		}
		else{
			System.out.println("SignUp Cancelled");
			ManagementMain.main(null);
		}		
	}		
	public static void Usersignin() throws Exception {
		System.out.println("Please enter the user name");
		String userUserName=AdminandUser.input.next();
		System.out.println("Please enter the password");
		String userUserpassword=AdminandUser.input.next();		
		System.out.println("Sucessfully logged in");
		User.UsersigninChoice();
	}
		public static void UsersigninChoice() throws Exception {
		System.out.println("Select your Choice \n 1.View \n 2.Update \n 3.SignOut");
		int UsersigninChoice=AdminandUser.input.nextInt();
		 if(UsersigninChoice==1)
		    {
			 jdbcRetrive.UserRetrive();
			 System.out.println("\n 0.Back");
			 int back=AdminandUser.input.nextInt();
			 if (back==0) {
				User.UsersigninChoice(); 
			 }
		    }
		    else if(UsersigninChoice==2)
		    {
		    System.out.println(" Details Updated  ");
		    }
		    else if(UsersigninChoice==3)
		    {
		    System.out.println("Signed out sucessfully");
		    // String status="Deactive";
		    ManagementMain.main(null);
		    }
		    else
		    {
		    System.out.println("Please enter the valid choice");
		    User.UsersigninChoice();
		    }	
	}
	public static void UserSignOut() {
		AdminandUser.MainDisplay();
	}
}
