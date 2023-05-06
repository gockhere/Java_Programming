package day08_ternary_switch;

public class day08_ternary_switch {
    public static void main(String[] args) {

        int number = 100;






        /*
        String result ="";
        if (number >0){
            result="positive";
        } else if (number <0) {
            result="negative";
        }else {
            result="zero";
        }
        */

        String result= (number >0)? "positive" : (number<0) ? result = "negative" : "zero";
        System.out.println("-------------------------------------");

        int n = 1;

       /*
        String day = "";
        if (n==1){
            day = "monday";
        } else if (n==2) {
            day="tuesday";
        }else if (n==3) {
            day="wednesday";
        }else if (n==4) {
            day="thursday";
        }else if (n==5) {
            day="friday";
        }else if (n==6) {
            day="saturday";
        }else {
            day="sunday";
        } */

        String day=(n==1)? "monday":(n==2)?"tuesday":(n==3)?"wednesday":(n==4)?"thursday":(n==5)?"friday":(n==6)?"saturday":"sunday";
        System.out.println(day);

        System.out.println("-----------------------");
























    }
}
