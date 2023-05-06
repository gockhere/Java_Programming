package day09_scanner;

import java.util.Scanner;

public class NextLineMethodPractice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("enter your full name =");
        String name = input.nextLine();

        System.out.println("enter your school name= ");
        String school = input.nextLine();

        System.out.println("enter your age=");
        int age = input.nextInt();

        System.out.println("enter your gender=");
        String gender= input.next();

        input.nextLine();

        System.out.println("enter your street name = ");
        String street = input.nextLine();

        System.out.println("you entered full name = "+name);
        System.out.println("you entered school name = "+school);
        System.out.println("you entered age = "+age);
        System.out.println("you entered gender="+gender);
        System.out.println("you entered street name ="+street);








    }
}
