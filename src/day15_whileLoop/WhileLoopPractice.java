package day15_whileLoop;

import java.util.Scanner;

public class WhileLoopPractice {

    public static void main(String[] args) {


        Scanner input= new Scanner(System.in);


        System.out.println("Enter Your Age");
        int age = input.nextInt();

        while (!(age>=1&&age<=150)){// while the age invalid
            System.out.println("invalid entry! Please re-enter your age:");

            age=input.nextInt();
        }






        if (age>21){
            System.out.println("eligible");
        }else {
            System.out.println("not eligible");
        }

        input.close();










    }
}
