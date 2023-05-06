package day16_nestedLoop;

import java.util.Scanner;

public class CydeoLogin {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter Your User Name:");
        String u = input.next();


        System.out.println("Enter Your Password:");
        String p = input.next();

        if(u.equals("Cydeo")&&p.equals("WoodenSpoon")){
            System.out.println("Logged In");
        }else {
            for (int i = 0; i < 3; i++) {
                if (i!=2) {

                    System.err.println("Incorrect Password or Username Please re-enter");
                }else{
                    System.err.println("this is your last chance Incorrect Password or Username Please re-enter");
                }

                System.out.println("Enter Your User Name:");
                u = input.next();

                System.out.println("Enter Your Password:");
                p = input.next();

                if (u.equals("Cydeo")&& p.equals("WoodenSpoon")){
                    System.out.println("Logged In");
                    break;// exits loop
                }


            }

            if(!(u.equals("Cydeo")&&p.equals("WoodenSpoon"))){
                System.err.println("your account now is locked , please connect with support team");

            }

            input.close();
        }

    }


    public static void cydeoLogin(String UserName, String Password){

        if(UserName.equals("Cydeo")&Password.equals("WoodenSpoon")) {
            System.out.println("Logged In");
        }else {
            System.out.println("invalid credentials");
        }

    }
}

/*
1. Create a class named CydeoLogIn. you are writing a code for the log-in function of the Cydeo Application, assume that your credentials are:
                    username: Cydeo
                    password: WoodenSpoon

        Ask the user to enter their credentials.
                If credentials are matched, your program should print "Logged in."

                If the credentials are not matched, the program should allow
                the user to have three attempts to enter correct credentials

                if all three attempts are failed, then print "Your account is lucked."
 */
