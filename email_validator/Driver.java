import java.util.Scanner;

public class Driver {
	
	private static Scanner keyboard;
	//store the complete input string
	private static String email;

	//split the username from email
	private static String username;

	//split the domain name from email
	private static String domain;

	//store the characters from email
	private static char[] characters;

	//allowed special characters
	private static char[] allowed = {'_', '.'};

	//error message
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

		//the cuurent character in the traversal
		char pointer;
		//the previous character in the traversal
		char last_pointer;
		int username_length = 0;

		//for each character as part of the input
		for (int i = 0; i < characters.length; i++) {
			//obtain a pointer to the character
			pointer = characters[i];
			
			//check if the first character is a digit for the username
			if (i == 0 && Character.isDigit(pointer)) {
				error = "Username cannot start with a digit!";
				break;
			}else{
				//start reading characters for the domain name
				if (pointer == '@') {
					username_length = i;
				}
				//check if the first character is a digit for the domain name
				if (i == (username_length + 1) && Character.isDigit(pointer)) {
					error = "Domain name cannot start with a digit!";
					i = characters.length;
					break;
				}
				//store the last character from input
				if (i == 0) {
					last_pointer = ' ';
				}else{
					last_pointer = characters[i-1];
				}
				//check to see if allowed characters are included
				for (Character current : allowed) {
					//if the pointer is not one that is allowed
					if (!Character.isLetter(pointer) && pointer != current) {
						//if it is not allowed
						if (pointer == '`' || pointer == '~' || pointer == '!' || pointer == '#' || pointer == '$' || pointer == '%' || pointer == '^' || pointer == '&' || pointer == '*' || pointer == '(' || pointer == ')' || pointer == '-' || pointer == '=' || pointer == '+' ) {
							error = pointer + " character is not allowed!";
							i = characters.length;
							break;
						}
					//check to see if the last pointer and the current one are the same allowed characters
					}else if(!Character.isLetter(pointer) && pointer == current && last_pointer == current){
						error = "Consecutive " + current + "(s) are not allowed!";
						i = characters.length;
						break;
					//continue if the current character is allowed
					}else if (!Character.isLetter(pointer) && pointer == current){
						break;
					}
				}
			}
		}
		//check if the username is a minimum of 6 length
		// if (username_length < 6) {
		// 	error = "Username cannot be less than 6 letters!";
		// }
		//check errors and print
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