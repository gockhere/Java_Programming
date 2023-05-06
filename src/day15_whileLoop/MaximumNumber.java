package day15_whileLoop;

import java.util.Scanner;

public class MaximumNumber {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


        int max = -2147483648;



        // write a program that can ask the user to enter a number for five times, print the maximum number


        for (int i = 0; i <5 ; i++) {
            System.out.println("Enter a number:");
            int number = input.nextInt();//10, 5 , 20 , 15 , 3

            if (number>max){
                max=number;
            }

        }

        System.out.println("max = " + max);




    }



}
