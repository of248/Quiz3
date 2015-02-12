import java.util.Scanner;


public class UsernameAuthentication {
	
	public static String correctUsername = "csc201";
	public static String correctPassword = "awesome";
	public static String username;
	public static String password;
	static boolean authen = false;
	static boolean status = false;

	public static String getcorrectUsername(){
		return correctUsername;
	}
	
	public static String getcorrectPassword(){
		return correctPassword;
	}
	
	public static void main(String[] args){
		
		Scanner keyboard = new Scanner (System.in);
		
		System.out.println("Enter Username");
		username = keyboard.nextLine();
		authenticationUsername(username);
		if (authen == true){
			
			System.out.println("Enter Password");
			password = keyboard.nextLine(); 
			authenticationPassword(password);
			
			if (status == true){
				System.out.println("Welcome " + username);
			}
			else
				{
				System.out.println("Invalid password");
				}
		}
		else {
			System.out.println("Invalid Username");
		}
	
	
	}

	public static boolean authenticationUsername (String username){
			
		if(username.equalsIgnoreCase(correctUsername)) {

				authen = true;
				
					} else {
						
						authen=false;
					 }
		
			return authen;

				}
	
	public static boolean authenticationPassword(String password){
		
		if(password.equals((correctPassword))) {
		
			status =true;
			
			} else {
					
				status = false;
	
				}
		
		
		return status;
		
	}
}


