package day08_ternary_switch;

import java.sql.SQLOutput;

public class IfStatementAndTernaryPractice {
    public static void main(String[] args) {



        int score=90;
        String result = "";

        if (score>=0&&score<=100){

            result= (score >= 90)?"A":(score>=80)?"B":(score>=70)?"C":(score >=60)?"D":"F";


        }else {
            result="invalid score";
        }
        System.out.println(result);


        System.out.println("===========================================");



        String result2 =(score>=0&&score<=100)?
                 (score >= 90)?"A":(score>=80)?"B":(score>=70)?"C":(score >=60)?"D":"F"


                :"invalid score";

        System.out.println(result2);

        System.out.println("=========================================");














    }
}
