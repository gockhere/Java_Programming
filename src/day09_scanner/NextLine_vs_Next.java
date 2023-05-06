package day09_scanner;

import java.util.Scanner;

public class NextLine_vs_Next {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);//enter

        System.out.println("enter your age:");
        int age = input.nextInt();//45+enter

        input.nextLine();// enter

        System.out.println("enter your full name =");
        String full_name = input.nextLine();

        System.out.println("age ="+age);
        System.out.println("your name ="+full_name);







    }
}
