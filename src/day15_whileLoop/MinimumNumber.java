package day15_whileLoop;

import java.util.Scanner;

public class MinimumNumber {



        public static void main(String[] args) {

            Scanner input = new Scanner(System.in);


            int min = 2147483647;



            // write a program that can ask the user to enter a number for five times, print the minimum number


            for (int i = 0; i <5 ; i++) {
                System.out.println("Enter a number:");
                int number = input.nextInt();//10, 5 , 20 , 15 , 3

                if (number<min){
                    min=number;
                }

            }

            System.out.println("min = " + min);




        }





}
