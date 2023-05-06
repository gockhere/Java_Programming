package day07_ifStatements;

public class NestedIfIntro {
    public static void main(String[] args) {

        int score = -300;

        if (score >=0 && score <=100){
            if (score>= 60){
                System.out.println("passed");
            }else {
                System.out.println("failed");
            }

        }else {
            System.out.println("invalid score");
        }


        System.out.println("--------------------");

        int age = 0 ;

        if (age >=1 && age <= 150){
            if (age >=21){
                System.out.println("eligible");
            }else {
                System.out.println("not eligible");
            }
        }else {
            System.out.println("invalid age");
        }


        System.out.println("------------------------");













    }
}
