package day16_nestedLoop;

import java.util.Scanner;

public class LoopPractices {
    public static void main(String[] args) {



        for(int i=1;i<6;i++){

            System.out.println("hello"+i);

        }


        System.out.println("========================================");


        for (int i = 0; i < 5; i++) {

            System.out.println("hello"+i);

        }

        System.out.println("========================================");

        int j =0;
        while(j<5){

            System.out.println("hello"+j);

            j++;

        }

        System.out.println("========================================");



        int k=0;
        do{
            System.out.println("hello"+k);

           k++;
        }while(k<5);


        System.out.println("========================================");

        Scanner input= new Scanner(System.in);




        System.out.println("enter your grade");
        int score = input.nextInt();



        while(score<0 ||score>100){
            System.out.println("invalid score please re enter");
            score = input.nextInt();
        }


        if (score>60){
            System.out.println("passed");
        }else{
            System.out.println("failed");
        }









    }





















}
