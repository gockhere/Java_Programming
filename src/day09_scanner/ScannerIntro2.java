package day09_scanner;

import java.util.Scanner;

public class ScannerIntro2 {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        System.out.println("enter your decimal number :");

        float num1 = input.nextFloat();

        System.out.println("enter your second decimal number :");
         float num2 = input.nextFloat();

        System.out.println("enter true or false");
        boolean r = input.nextBoolean();


        System.out.println("num1 ="+num1);
        System.out.println("num2 ="+num2);
        System.out.println("r="+r);

        input.close();












    }
}
