package day13_customMethods;

import java.util.Scanner;

public class ReturnStatementPractice2 {
    public static void main(String[] args) {


        int number = new Scanner(System.in).nextInt();


        if (number <1||number>7){
            System.err.println("invalid number:"+number);
            return;
        }

        System.out.println((number==1)?"monday":(number==2)?"tuesday":(number==3)?"wednesday":(number==4)?"thursday":(number==5)?"friday":(number==6)?"saturday": "sunday" );
    }
}
