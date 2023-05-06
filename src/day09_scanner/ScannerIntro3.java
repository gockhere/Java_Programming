package day09_scanner;

import java.util.Scanner;

public class ScannerIntro3 {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);

        System.out.println("enter a character");
        char ch = input.next().charAt(0);

        System.out.println( " you have entered ="+ch);

        System.out.println("would you like to continue?");

        String answer = input.next(); // i do not know --> i

        //String answer = input.nextLine(); // i do not know --> i do not know

        System.out.println("you have entered= "+answer);

        input.close();



    }
}
