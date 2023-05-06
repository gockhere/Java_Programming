package day08_ternary_switch;

public class TernaryIntro03 {
    public static void main(String[] args) {




         int score = 95;
         /*

        if (score >=0 && score <=100){
            if (score>= 60){
                System.out.println("passed");
            }else {
                System.out.println("failed");
            }

        }else {
            System.out.println("invalid score");
        }
         */

        String result =(score >=0 && score <=100)?
                (score >= 60 )?"passed":"failed"
                :"invalid";

        System.out.println(result);


        System.out.println("----------------------------------");



        int n=5;

        String day = (n>=1 && n<=7)?
                (n==1)? "monday":(n==2)?"tuesday":(n==3)?"wednesday":(n==4)?"thursday":(n==5)?"friday":(n==6)?"saturday":"sunday"

                :"no such a day";
        System.out.println(day);


















    }
}
