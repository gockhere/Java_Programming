package day09_scanner;

import  java.util.Scanner;
// import java.util.*;
public class ScannerIntro {

    public static void main(String[] args) {


      Scanner input = new Scanner(System.in);
        System.out.println("enter your first number : ");



        byte num1 = input.nextByte();

        System.out.println("enter your second number : ");

        short num2=input.nextShort();

        System.out.println("enter your third number :");
        int num3 = input.nextInt();

        System.out.println("enter your fourth number : ");
        long num4 = input.nextLong();

        input.close();//input is closed , cannot read user inputs again

      /*  System.out.println("enter fifth number");

        int num5 = input.nextInt();

        scanner closed in line 27 . once its closed you cannot read inputs*/


        System.out.println("first number : " + num1);
        System.out.println("second number : "+ num2);
        System.out.println("third number : "+num3);
        System.out.println("fourth number : "+num4);
       // System.out.println("fifth number= " + num5);


    }





}
