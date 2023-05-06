package day11_string;

import java.util.Scanner;

public class Login {
    public static void main(String[] args) {

        String correctUsername ="Cydeo",// literal
                correctPassword = "WoodenSpoon";

        Scanner input= new Scanner(System.in);

        System.out.println("enter your username");
        String username = input.nextLine();//new
        System.out.println("enter your password");
        String password = input.nextLine();

        input.close();

        if (password.equals(correctPassword)&&username.equals(correctUsername)){
            System.out.println("you are now logged in");

        }else {
            System.err.println("incorrect username or passwrod please try again");
        }
            /*
            2. Create a class named LogIn
			2.1 Ask the user to enter the username & password
			2.2 print "You are now logged in" If user entered valid username and password
				otherwise print the error message "Incorrect username or password. Please try again"

			Note: Assume that the valid credentials are:
						username: Cydeo
						password: WoodenSpoon
             */
















    }
}
