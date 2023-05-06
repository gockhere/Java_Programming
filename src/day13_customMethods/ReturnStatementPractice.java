package day13_customMethods;

import java.util.Scanner;

public class ReturnStatementPractice {
    public static void main(String[] args) {

        char grade = new Scanner(System.in).next().charAt(0);

        boolean isValid = grade=='A'||grade=='B'||grade=='C'||grade=='D'||grade=='F';


        if (!isValid){
            System.err.println("invalid grade");
            return;//terminated  main method
        }
        if (grade=='A'){
            System.out.println("excellent");
        } else if (grade=='B') {
            System.out.println("great job");

        } else if (grade=='C') {
            System.out.println("good");

        } else if (grade=='D') {
            System.out.println("passed");

        }else {
            System.out.println("failed");
        }


    }



}
