package day09_scanner;

import java.util.Scanner;

public class DaysInWeek {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("enter the day number:");

        //int num = new Scanner(System.in).nextInt();

        int num = input.nextInt();

        String day = "Invalid";

        if (num >=1 && num <=7){

            day = (num==1)?"monday":(num==2)?"tuesday":(num==3)?"wednesday":(num ==4)?"thursday":(num==5)?"friday":(num==6)?"saturday":"sunday";



        }
        System.out.println(day);

        input.close();






    }
}
