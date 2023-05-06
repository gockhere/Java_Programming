package day15_whileLoop;

import java.util.Scanner;

public class EligibleToVote {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        System.out.println("Enter Your Age :");
        int age= input.nextInt();//valid age 1-120

        while (!(age >=1 && age <=120)  ){ // while age is not valid

            System.err.println("invalid entry, Please re=enter your age:");
            age=input.nextInt();

        }

        System.out.println("Are You US Citizen ? yes/no");
        String yesOrNo=input.next().toLowerCase();

        while (!(yesOrNo.equals("yes")||yesOrNo.equals("no"))){//while the answer neither yes  no ask re-enter
            System.err.println("invalid entry! please re enter");
            System.err.println("Are You US Citizen ? yes/no");
            yesOrNo = input.next().toLowerCase();

        }

        if (age >=21 &&yesOrNo.equals("yes")){
            System.out.println("you are eligible to vote");
        }else {
            System.out.println("not eligible");
        }

















    }







}
