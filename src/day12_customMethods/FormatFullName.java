package day12_customMethods;

import java.util.Scanner;

public class FormatFullName {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Enter your first name");
        String first = input.next().trim();

        System.out.println("Enter your last name");
        String last=input.next().trim();

        input.close();




        first=first.substring(0,1).toUpperCase()+first.substring(1).toLowerCase();
    //"c" getting first char of first name and remaining


        System.out.println(first);

        last=last.substring(0,1).toUpperCase()+last.substring(1).toLowerCase();

        System.out.println(last);

        String fullName= first+" "+last;
        System.out.println(fullName);








        /*
        1. Write a program that asks user to enter first and last names, and then prints the full name in regular format (first character in upper case)

	                    input:
	                        firstName = "cyDEo"
	                        lastName = "SCHOOL";

	                    output:
	                        Cydeo School

         */











    }



}
