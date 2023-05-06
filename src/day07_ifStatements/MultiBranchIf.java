package day07_ifStatements;

public class MultiBranchIf {
    public static void main(String[] args) {


        int num = 100;
        String result ="";

        if (num >0 ){
            result ="positive";
        }
        if (num < 0 ){
            result = "negative";
        }
        if(num ==0 ){
            result = "zero";
        }
        System.out.println(result);


        System.out.println("-------------------------------");


        String result2 = "";

        if (num >0){
            result2 = "positive";
        }

        else if (num <0) {
            result2="negative";
        }
        else {
            result2 = "zero";
        }


    }
}
