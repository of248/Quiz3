import javax.swing.JOptionPane;


public class Email {

	static boolean authen = false;
	static boolean status = false;
	
	
	public static void main(String[] args){
		
		UsernameAuthentication.getcorrectUsername();
		UsernameAuthentication.getcorrectPassword();
		
		String username = JOptionPane.showInputDialog("Enter Username");
		
		UsernameAuthentication.authenticationUsername(username);
	
		if(authen  == true){
			
		String password = JOptionPane.showInputDialog("Enter Password");
		
		UsernameAuthentication.authenticationPassword(password);
		
		if(status == true){
		
		JOptionPane.showInputDialog("Welcome");
		}
		
		 else {
				JOptionPane.showMessageDialog(null, "Invalid Username");
			}
		}
		
		
		}
	

}



