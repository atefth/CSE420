import java.util.Scanner;

public class Driver {
	
	private static Scanner keyboard;
	private static String email;
	private static String username;
	private static String domain;
	private static char[] characters;
	private static char[] allowed = {'_', '.'};
	private static String error;

	public Driver(){
		keyboard = new Scanner(System.in);
		email = "";
		error = "";
	}

	public static void main(String[] args) {
		Driver driver = new Driver();
		System.out.print("Enter an email address:");
		email = keyboard.nextLine();
		System.out.print("You entered: ");
		System.out.println(email);
		characters = email.toCharArray();
		char pointer;
		char last_pointer;
		int username_length = 0;
		for (int i = 0; i < characters.length; i++) {
			pointer = characters[i];
			// System.out.println(pointer);
			if (i == 0 && Character.isDigit(pointer)) {
				error = "Username cannot start with a digit!";
				break;
			}else{
				if (pointer == '@') {
					username_length = i;
				}
				if (i == (username_length + 1) && Character.isDigit(pointer)) {
					error = "Domain name cannot start with a digit!";
					i = characters.length;
					break;
				}
				if (i == 0) {
					last_pointer = ' ';
				}else{
					last_pointer = characters[i-1];
				}
				for (Character current : allowed) {
					if (!Character.isLetter(pointer) && pointer != current) {
						
					}else if(!Character.isLetter(pointer) && pointer == current && last_pointer == current){
						error = "Consecutive " + current + "(s) are not allowed!";
						i = characters.length;
						break;
					}else{
						break;
					}
				}
			}
		}
		if (error.equals("")) {
			username = email.substring(0, username_length);
			domain = email.substring(username_length + 1, email.length());
			System.out.println("Your username is " + username);
			System.out.println("Your domain is " + domain);
			if (domain.equals("bracu.ac.bd") || domain.equals("gmail.com")) {
				System.out.println("Your domain is valid!");
			}else{
				System.out.println("Your domain is not recognized!");
			}
		}else{
			System.out.println(error);
			System.out.println("Please try again.");
		}
	}

}