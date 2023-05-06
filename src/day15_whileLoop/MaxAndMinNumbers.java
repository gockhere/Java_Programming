package day15_whileLoop;

import java.util.Scanner;

public class MaxAndMinNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        int max=-2147483648;
        int min= 2147483647;

        for (int i = 0; i < 5; i++) {

            System.out.println("Enter a number:");
            int number = input.nextInt();//10, 5 , 20 , 15 , 3

            if (number> max){
                max=number;
            }

            if (number< min){
                min=number;
            }

        }


        System.out.println("min = " + min);
        System.out.println("max = " + max);





    }
}
